package org.telegram.messenger;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
public final class EmojiPack {
    private static final String ASSET_NAME = "emoji.pack";
    private static final int DEFLATE = 0;
    private static final int ENTRY_SIZE = 20;
    private static final int FULL_IMAGE = 3;
    private static final int HEADER_SIZE = 32;
    private static final int INDEX_WEBP = 1;
    private static final int MAP_REFERENCE = 4;
    private static final int NO_MASK = 65535;
    private static final int PIXELS = 4096;
    private static final int RGBA_WEBP = 2;
    private static final int ROOT_CACHE_SIZE = 8;
    private static final int SIDE = 64;
    private long age;
    private final MappedByteBuffer buffer;
    private final int count;
    private final byte[] decoded;
    private final int emojiCount;
    private final int[] emojiPixels;
    private byte[] encoded;
    private final byte[] indices;
    private final Inflater inflater;
    private final BitmapFactory.Options options;
    private final int[] palette;
    private final byte[] paletteBytes;
    private final int[] pixels;
    private final long[] rootAges;
    private final int[] rootIds;
    private final byte[][] rootMaps;

    public static final class Holder {
        static final EmojiPack INSTANCE = open();

        private Holder() {
        }

        private static EmojiPack open() {
            try {
                return new EmojiPack();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to open emoji.pack", e);
            }
        }
    }

    private static IllegalStateException damaged(String str) {
        return new IllegalStateException(org.telegram.ui.Cells.r6.i("Damaged emoji.pack: ", str));
    }

    private Bitmap decode(int i10) {
        int entry = entry(i10);
        int i11 = this.buffer.getInt(entry + 4);
        int u16 = u16(entry + 8);
        int u82 = u8(entry + 16);
        if (u82 != 2 && u82 != 3) {
            decodePixels(i10, this.pixels);
            return Bitmap.createBitmap(this.pixels, 64, 64, Bitmap.Config.ARGB_8888);
        }
        readBytes(i11, u16);
        if (u82 == 2) {
            return decodeWebp(20, u16);
        }
        return decodeBitmap(20, u16);
    }

    private Bitmap decodeBitmap(int i10, int i11) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(this.encoded, i10, i11, this.options);
        if (decodeByteArray != null) {
            if (decodeByteArray.getWidth() == 64 && decodeByteArray.getHeight() == 64) {
                return decodeByteArray;
            }
            decodeByteArray.recycle();
            throw damaged("Unexpected bitmap dimensions");
        }
        throw damaged("Bitmap decoder rejected image");
    }

    private void decodeIndices(int r28, byte[] r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.EmojiPack.decodeIndices(int, byte[]):void");
    }

    private void decodePixels(int i10, int[] iArr) {
        Throwable th2;
        Bitmap decodeBitmap;
        boolean z10;
        int i11;
        int u82;
        int u83;
        int i12;
        int entry = entry(i10);
        int i13 = this.buffer.getInt(entry + 4);
        int u16 = u16(entry + 8);
        int u84 = u8(entry + 16);
        if (u84 != 2 && u84 != 3) {
            decodeIndices(i10, this.indices);
            int u162 = u16(entry + 14);
            int i14 = entry + 18;
            int u85 = u8(i14) & 127;
            int i15 = u162 * u85;
            if ((u8(i14) & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int paletteLength = paletteLength(entry) - 2;
                readBytes(i13 + 2, paletteLength);
                if ((u8(entry + 19) & 1) != 0) {
                    i12 = ((i15 * 7) + 7) / 8;
                } else {
                    i12 = i15;
                }
                inflate(paletteLength, i12);
            }
            if ((u8(entry + 19) & 1) != 0) {
                for (int i16 = 0; i16 < i15; i16++) {
                    int i17 = i16 * 7;
                    int i18 = i17 & 7;
                    int i19 = i17 >>> 3;
                    if (z10) {
                        u82 = this.decoded[i19] & 255;
                    } else {
                        u82 = u8(i13 + i19);
                    }
                    int i20 = u82 >>> i18;
                    if (i18 > 1) {
                        if (z10) {
                            u83 = this.decoded[i19 + 1] & 255;
                        } else {
                            u83 = u8(i19 + i13 + 1);
                        }
                        i20 |= u83 << (8 - i18);
                    }
                    int i21 = i20 & 127;
                    this.paletteBytes[i16] = (byte) ((i21 >>> 6) | (i21 << 1));
                }
            } else if (z10) {
                System.arraycopy(this.decoded, 0, this.paletteBytes, 0, i15);
            } else {
                for (int i22 = 0; i22 < i15; i22++) {
                    this.paletteBytes[i22] = this.buffer.get(i13 + i22);
                }
            }
            int i23 = 0;
            for (int i24 = 0; i24 < u162; i24++) {
                if (u85 == 0) {
                    this.palette[i24] = (65793 * i24) | (-16777216);
                } else if (u85 == 1) {
                    this.palette[i24] = ((this.paletteBytes[i23] & 255) * 65793) | (-16777216);
                    i23++;
                } else {
                    byte[] bArr = this.paletteBytes;
                    int i25 = bArr[i23] & 255;
                    int i26 = bArr[i23 + 1] & 255;
                    int i27 = i23 + 3;
                    int i28 = bArr[i23 + 2] & 255;
                    if (u85 == 4) {
                        i23 += 4;
                        i11 = bArr[i27] & 255;
                    } else {
                        i23 = i27;
                        i11 = 255;
                    }
                    this.palette[i24] = (i11 << 24) | (i25 << 16) | (i26 << 8) | i28;
                }
            }
            for (int i29 = 0; i29 < 4096; i29++) {
                int i30 = this.indices[i29] & 255;
                if (i30 < u162) {
                    iArr[i29] = this.palette[i30];
                } else {
                    throw damaged("Palette index out of range");
                }
            }
            return;
        }
        readBytes(i13, u16);
        this.options.inPremultiplied = false;
        Bitmap bitmap = null;
        try {
            if (u84 == 2) {
                decodeBitmap = decodeWebp(20, u16);
            } else {
                decodeBitmap = decodeBitmap(20, u16);
            }
            Bitmap bitmap2 = decodeBitmap;
            try {
                bitmap2.getPixels(iArr, 0, 64, 0, 0, 64, 64);
                this.options.inPremultiplied = true;
                bitmap2.recycle();
            } catch (Throwable th3) {
                th2 = th3;
                bitmap = bitmap2;
                this.options.inPremultiplied = true;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private Bitmap decodeWebp(int i10, int i11) {
        int i12 = i10 - 20;
        int i13 = i11 & 1;
        putInt(i12, 1179011410);
        putInt(i10 - 16, i11 + 12 + i13);
        putInt(i10 - 12, 1346520407);
        putInt(i10 - 8, 1278758998);
        putInt(i10 - 4, i11);
        if (i13 != 0) {
            this.encoded[i10 + i11] = 0;
        }
        return decodeBitmap(i12, i11 + 20 + i13);
    }

    private static int entry(int i10) {
        return (i10 * 20) + 32;
    }

    private int find(int i10, int i11, int i12) {
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int u16 = u16(entry(i14));
            if (u16 < i10) {
                i11 = i14 + 1;
            } else if (u16 > i10) {
                i13 = i14 - 1;
            } else {
                return i14;
            }
        }
        return -1;
    }

    private int findEmoji(int i10, int i11) {
        if (i10 >= 0 && i10 <= 15 && i11 >= 0 && i11 < 4096) {
            return find((i10 * 4096) + i11, 0, this.emojiCount);
        }
        return -1;
    }

    public static EmojiPack getInstance() {
        return Holder.INSTANCE;
    }

    private void inflate(int i10, int i11) {
        this.inflater.reset();
        this.inflater.setInput(this.encoded, 20, i10);
        int i12 = 0;
        while (i12 < i11) {
            try {
                int inflate = this.inflater.inflate(this.decoded, i12, i11 - i12);
                if (inflate != 0) {
                    i12 += inflate;
                } else {
                    throw damaged("Truncated DEFLATE stream");
                }
            } catch (DataFormatException e) {
                throw new IllegalStateException("Damaged EPK3 DEFLATE stream", e);
            }
        }
        if (!this.inflater.finished() && (this.inflater.inflate(this.indices, 0, 1) != 0 || !this.inflater.finished())) {
            throw damaged("Oversized DEFLATE stream");
        }
        if (this.inflater.getRemaining() == 0) {
            return;
        }
        throw damaged("Trailing DEFLATE bytes");
    }

    private int paletteLength(int i10) {
        int i11;
        int i12 = i10 + 18;
        if ((u8(i12) & 128) != 0) {
            int i13 = i10 + 8;
            if (u16(i13) >= 3) {
                int u16 = u16(this.buffer.getInt(i10 + 4));
                if (u16 != 0 && (i11 = u16 + 2) <= u16(i13)) {
                    return i11;
                }
                throw damaged("Invalid compressed palette");
            }
            throw damaged("Truncated compressed palette");
        }
        int u162 = u16(i10 + 14) * (u8(i12) & 127);
        if ((u8(i10 + 19) & 1) != 0) {
            return ((u162 * 7) + 7) / 8;
        }
        return u162;
    }

    private void putInt(int i10, int i11) {
        byte[] bArr = this.encoded;
        bArr[i10] = (byte) i11;
        bArr[i10 + 1] = (byte) (i11 >>> 8);
        bArr[i10 + 2] = (byte) (i11 >>> 16);
        bArr[i10 + 3] = (byte) (i11 >>> 24);
    }

    private void readBytes(int i10, int i11) {
        byte[] bArr = this.encoded;
        int i12 = i11 + 21;
        if (bArr.length < i12) {
            int length = bArr.length;
            while (length < i12) {
                length <<= 1;
            }
            this.encoded = new byte[length];
        }
        this.buffer.position(i10);
        this.buffer.get(this.encoded, 20, i11);
    }

    private byte[] rootMap(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            if (this.rootIds[i12] == i10) {
                long[] jArr = this.rootAges;
                long j3 = this.age + 1;
                this.age = j3;
                jArr[i12] = j3;
                return this.rootMaps[i12];
            }
            long[] jArr2 = this.rootAges;
            if (jArr2[i12] < jArr2[i11]) {
                i11 = i12;
            }
        }
        byte[][] bArr = this.rootMaps;
        if (bArr[i11] == null) {
            bArr[i11] = new byte[4096];
        }
        this.rootIds[i11] = -1;
        decodeIndices(i10, bArr[i11]);
        this.rootIds[i11] = i10;
        long[] jArr3 = this.rootAges;
        long j10 = this.age + 1;
        this.age = j10;
        jArr3[i11] = j10;
        return this.rootMaps[i11];
    }

    private static int sourceIndex(int i10, int i11) {
        int i12 = i10 & 63;
        int i13 = i10 >>> 6;
        if ((i11 & 1) != 0) {
            i12 = 63 - i12;
        }
        if ((i11 & 2) != 0) {
            i13 = 63 - i13;
        }
        if ((i11 & 4) != 0) {
            return i13 | (i12 << 6);
        }
        return (i13 << 6) | i12;
    }

    private int u16(int i10) {
        return this.buffer.getShort(i10) & 65535;
    }

    private int u8(int i10) {
        return this.buffer.get(i10) & 255;
    }

    private void validateMetadata() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.EmojiPack.validateMetadata():void");
    }

    private void validateRoot(int i10, int i11) {
        if (i10 < this.count && i10 != i11) {
            int entry = entry(i10);
            if (u8(entry + 16) <= 1 && u8(entry + 17) == 0 && u16(entry + 10) == 65535 && u16(entry + 12) == 65535) {
                return;
            }
            throw new IOException("EPK3 dependency chains are forbidden");
        }
        throw new IOException("Invalid root reference");
    }

    public synchronized void clearCache() {
        Arrays.fill(this.rootIds, -1);
        Arrays.fill(this.rootMaps, (Object) null);
        Arrays.fill(this.rootAges, 0L);
        this.age = 0L;
    }

    public synchronized Bitmap getEmoji(int i10, int i11) {
        int findEmoji = findEmoji(i10, i11);
        if (findEmoji < 0) {
            return null;
        }
        int u16 = u16(entry(findEmoji) + 2);
        if (u16 == 65535) {
            return decode(findEmoji);
        }
        decodePixels(findEmoji, this.emojiPixels);
        decodePixels(find(u16, this.emojiCount, this.count), this.pixels);
        for (int i12 = 0; i12 < 4096; i12++) {
            int[] iArr = this.emojiPixels;
            int i13 = iArr[i12];
            iArr[i12] = (i13 & 16777215) | (((((i13 >>> 24) * (this.pixels[i12] & 255)) + 127) / 255) << 24);
        }
        return Bitmap.createBitmap(this.emojiPixels, 64, 64, Bitmap.Config.ARGB_8888);
    }

    private EmojiPack() {
        this.inflater = new Inflater(true);
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.options = options;
        this.encoded = new byte[4096];
        this.decoded = new byte[4608];
        this.indices = new byte[4096];
        this.pixels = new int[4096];
        this.emojiPixels = new int[4096];
        this.palette = new int[256];
        this.paletteBytes = new byte[1024];
        int[] iArr = new int[8];
        this.rootIds = iArr;
        this.rootAges = new long[8];
        this.rootMaps = new byte[8];
        AssetFileDescriptor openFd = ApplicationLoader.applicationContext.getAssets().openFd("emoji.pack");
        try {
            FileInputStream createInputStream = openFd.createInputStream();
            long length = openFd.getLength();
            if (length < 32 || length > 2147483647L) {
                throw new IOException("Invalid emoji pack length: " + length);
            }
            MappedByteBuffer map = createInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), length);
            this.buffer = map;
            createInputStream.close();
            openFd.close();
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (map.getInt(0) == 860573765 && ((u16(4) == 2 || u16(4) == 3) && u16(6) == 20 && map.getInt(8) == 64 && map.getInt(12) == 64 && map.getInt(24) == map.capacity() && map.getInt(28) == 0)) {
                int i10 = map.getInt(16);
                this.count = i10;
                int i11 = map.getInt(20);
                this.emojiCount = i11;
                if (i10 >= 1 && i10 <= 65535 && i11 >= 0 && i11 <= i10 && (i10 * 20) + 32 <= map.capacity()) {
                    validateMetadata();
                    Arrays.fill(iArr, -1);
                    options.inScaled = false;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    options.inPremultiplied = true;
                    return;
                }
                throw new IOException("Invalid EPK3 record count");
            }
            throw new IOException("Unsupported or damaged EPK3 header");
        } catch (Throwable th2) {
            if (openFd != null) {
                try {
                    openFd.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
