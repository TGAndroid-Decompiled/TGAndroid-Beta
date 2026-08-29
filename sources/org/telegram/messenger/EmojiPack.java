package org.telegram.messenger;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.SparseArray;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
public final class EmojiPack {
    private static final String ASSET_NAME = "emoji.pack";
    private static final int EMOJI_ENTRY_SIZE = 12;
    private static final int MASK_ENTRY_SIZE = 10;
    private static final int NO_MASK = 65535;
    private static EmojiPack instance;
    private final AssetFileDescriptor assetFileDescriptor;
    private final MappedByteBuffer buffer;
    private final FileChannel channel;
    private final FileInputStream inputStream;
    private final SparseArray<EmojiEntry> emojis = new SparseArray<>();
    private final SparseArray<ImageEntry> masks = new SparseArray<>();
    private byte[] decodeBuffer = new byte[1024];

    public static final class EmojiEntry extends ImageEntry {
        final int maskId;

        public EmojiEntry(int i10, int i11, int i12) {
            super(i10, i11);
            this.maskId = i12;
        }
    }

    public static class ImageEntry {
        final int length;
        final int offset;

        public ImageEntry(int i10, int i11) {
            this.offset = i10;
            this.length = i11;
        }
    }

    private EmojiPack() {
        AssetFileDescriptor openFd = ApplicationLoader.applicationContext.getAssets().openFd("emoji.pack");
        this.assetFileDescriptor = openFd;
        FileInputStream fileInputStream = new FileInputStream(openFd.getFileDescriptor());
        this.inputStream = fileInputStream;
        FileChannel channel = fileInputStream.getChannel();
        this.channel = channel;
        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getLength());
        this.buffer = map;
        map.order(ByteOrder.LITTLE_ENDIAN);
        readMetadata();
    }

    private Bitmap decode(ImageEntry imageEntry) {
        byte[] bArr = this.decodeBuffer;
        if (bArr.length < imageEntry.length) {
            int length = bArr.length;
            while (length < imageEntry.length) {
                length <<= 1;
            }
            this.decodeBuffer = new byte[length];
        }
        this.buffer.position(imageEntry.offset);
        this.buffer.get(this.decodeBuffer, 0, imageEntry.length);
        return BitmapFactory.decodeByteArray(this.decodeBuffer, 0, imageEntry.length);
    }

    public static EmojiPack getInstance() {
        if (instance == null) {
            try {
                instance = new EmojiPack();
            } catch (IOException e10) {
                throw new RuntimeException("Unable to open emoji pack", e10);
            }
        }
        return instance;
    }

    private void readMetadata() {
        ByteBuffer order = this.buffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i10 = order.getInt();
        if (i10 >= 0 && i10 % 12 == 0) {
            int i11 = i10 / 12;
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = order.getShort() & 65535;
                int i14 = 65535 & order.getShort();
                int i15 = order.getInt();
                int i16 = order.getInt();
                validateRange(i15, i16, j7.l1.k(i13, "emoji "));
                this.emojis.put(i13, new EmojiEntry(i15, i16, i14));
            }
            int i17 = order.getInt();
            if (i17 >= 0 && i17 % 10 == 0) {
                int i18 = i17 / 10;
                for (int i19 = 0; i19 < i18; i19++) {
                    int i20 = order.getShort() & 65535;
                    int i21 = order.getInt();
                    int i22 = order.getInt();
                    validateRange(i21, i22, j7.l1.k(i20, "mask "));
                    this.masks.put(i20, new ImageEntry(i21, i22));
                }
                return;
            }
            throw new IOException(j7.l1.k(i17, "Invalid mask metadata length: "));
        }
        throw new IOException(j7.l1.k(i10, "Invalid emoji metadata length: "));
    }

    private void validateRange(int i10, int i11, String str) {
        if (i10 >= 0 && i11 >= 0) {
            if (i10 + i11 <= this.buffer.capacity()) {
                return;
            }
            throw new IOException("Range outside emoji pack for " + str + ": offset=" + i10 + ", length=" + i11 + ", packSize=" + this.buffer.capacity());
        }
        throw new IOException("Invalid range for " + str + ": offset=" + i10 + ", length=" + i11);
    }

    public Bitmap getEmoji(int i10, int i11) {
        EmojiEntry emojiEntry;
        if (i10 < 0 || i11 < 0 || i11 >= 4096) {
            return null;
        }
        long j10 = (i10 * 4096) + i11;
        if (j10 > 65535 || (emojiEntry = this.emojis.get((int) j10)) == null) {
            return null;
        }
        return decode(emojiEntry);
    }

    public Bitmap getMask(int i10) {
        ImageEntry imageEntry = this.masks.get(i10);
        if (imageEntry == null) {
            return null;
        }
        return decode(imageEntry);
    }

    public int getMaskId(int i10, int i11) {
        EmojiEntry emojiEntry;
        if (i10 >= 0 && i11 >= 0 && i11 < 4096) {
            long j10 = (i10 * 4096) + i11;
            if (j10 <= 65535 && (emojiEntry = this.emojis.get((int) j10)) != null) {
                return emojiEntry.maskId;
            }
        }
        return 65535;
    }
}
