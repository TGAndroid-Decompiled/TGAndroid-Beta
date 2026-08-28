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

        public EmojiEntry(int i9, int i10, int i11) {
            super(i9, i10);
            this.maskId = i11;
        }
    }

    public static class ImageEntry {
        final int length;
        final int offset;

        public ImageEntry(int i9, int i10) {
            this.offset = i9;
            this.length = i10;
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
        int i9 = order.getInt();
        if (i9 >= 0 && i9 % 12 == 0) {
            int i10 = i9 / 12;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = order.getShort() & 65535;
                int i13 = 65535 & order.getShort();
                int i14 = order.getInt();
                int i15 = order.getInt();
                validateRange(i14, i15, j3.r0.l(i12, "emoji "));
                this.emojis.put(i12, new EmojiEntry(i14, i15, i13));
            }
            int i16 = order.getInt();
            if (i16 >= 0 && i16 % 10 == 0) {
                int i17 = i16 / 10;
                for (int i18 = 0; i18 < i17; i18++) {
                    int i19 = order.getShort() & 65535;
                    int i20 = order.getInt();
                    int i21 = order.getInt();
                    validateRange(i20, i21, j3.r0.l(i19, "mask "));
                    this.masks.put(i19, new ImageEntry(i20, i21));
                }
                return;
            }
            throw new IOException(j3.r0.l(i16, "Invalid mask metadata length: "));
        }
        throw new IOException(j3.r0.l(i9, "Invalid emoji metadata length: "));
    }

    private void validateRange(int i9, int i10, String str) {
        if (i9 >= 0 && i10 >= 0) {
            if (i9 + i10 <= this.buffer.capacity()) {
                return;
            }
            throw new IOException("Range outside emoji pack for " + str + ": offset=" + i9 + ", length=" + i10 + ", packSize=" + this.buffer.capacity());
        }
        throw new IOException("Invalid range for " + str + ": offset=" + i9 + ", length=" + i10);
    }

    public Bitmap getEmoji(int i9, int i10) {
        EmojiEntry emojiEntry;
        if (i9 < 0 || i10 < 0 || i10 >= 4096) {
            return null;
        }
        long j10 = (i9 * 4096) + i10;
        if (j10 > 65535 || (emojiEntry = this.emojis.get((int) j10)) == null) {
            return null;
        }
        return decode(emojiEntry);
    }

    public Bitmap getMask(int i9) {
        ImageEntry imageEntry = this.masks.get(i9);
        if (imageEntry == null) {
            return null;
        }
        return decode(imageEntry);
    }

    public int getMaskId(int i9, int i10) {
        EmojiEntry emojiEntry;
        if (i9 >= 0 && i10 >= 0 && i10 < 4096) {
            long j10 = (i9 * 4096) + i10;
            if (j10 <= 65535 && (emojiEntry = this.emojis.get((int) j10)) != null) {
                return emojiEntry.maskId;
            }
        }
        return 65535;
    }
}
