package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
public final class n6 {
    public final MappedByteBuffer f17049a;
    public final int f17050b;
    public final int f17051c;
    public final Inflater d = new Inflater(true);
    public final BitmapFactory.Options e = new BitmapFactory.Options();
    public byte[] f17052f = new byte[4096];
    public final byte[] f17053g = new byte[4608];
    public final byte[] h = new byte[4096];
    public final int[] f17054i = new int[4096];
    public final int[] f17055j = new int[4096];
    public final int[] f17056k = new int[256];
    public final byte[] f17057l = new byte[1024];
    public final int[] f17058m = new int[8];
    public final long[] f17059n = new long[8];
    public final byte[][] f17060o = new byte[8];
    public long f17061p;

    public n6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.n6.<init>():void");
    }

    public static IllegalStateException a(String str) {
        return new IllegalStateException("Damaged emoji.pack: ".concat(str));
    }

    public static int f(int i10) {
        return (i10 * 20) + 32;
    }

    public static int n(int i10, int i11) {
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

    public final Bitmap b(int i10, int i11) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(this.f17052f, i10, i11, this.e);
        if (decodeByteArray != null) {
            if (decodeByteArray.getWidth() == 64 && decodeByteArray.getHeight() == 64) {
                return decodeByteArray;
            }
            decodeByteArray.recycle();
            throw a("Unexpected bitmap dimensions");
        }
        throw a("Bitmap decoder rejected image");
    }

    public final void c(int r28, byte[] r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.n6.c(int, byte[]):void");
    }

    public final void d(int[] iArr, int i10) {
        Bitmap b10;
        Bitmap bitmap;
        boolean z10;
        int[] iArr2;
        int i11;
        int p5;
        int p9;
        int i12;
        int f7 = f(i10);
        MappedByteBuffer mappedByteBuffer = this.f17049a;
        int i13 = mappedByteBuffer.getInt(f7 + 4);
        int o10 = o(f7 + 8);
        int p10 = p(f7 + 16);
        if (p10 != 2) {
            int i14 = 3;
            if (p10 != 3) {
                byte[] bArr = this.h;
                c(i10, bArr);
                int o11 = o(f7 + 14);
                int i15 = f7 + 18;
                int p11 = p(i15) & 127;
                int i16 = o11 * p11;
                if ((p(i15) & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int j10 = j(f7) - 2;
                    l(i13 + 2, j10);
                    if ((p(f7 + 19) & 1) != 0) {
                        i12 = ((i16 * 7) + 7) / 8;
                    } else {
                        i12 = i16;
                    }
                    i(j10, i12);
                }
                int p12 = p(f7 + 19) & 1;
                byte[] bArr2 = this.f17053g;
                byte[] bArr3 = this.f17057l;
                if (p12 != 0) {
                    int i17 = 0;
                    while (i17 < i16) {
                        int i18 = i17 * 7;
                        int i19 = i18 & 7;
                        int i20 = i18 >>> i14;
                        if (z10) {
                            p5 = bArr2[i20] & 255;
                        } else {
                            p5 = p(i13 + i20);
                        }
                        int i21 = p5 >>> i19;
                        if (i19 > 1) {
                            if (z10) {
                                p9 = bArr2[i20 + 1] & 255;
                            } else {
                                p9 = p(i20 + i13 + 1);
                            }
                            i21 |= p9 << (8 - i19);
                        }
                        int i22 = i21 & 127;
                        bArr3[i17] = (byte) ((i22 >>> 6) | (i22 << 1));
                        i17++;
                        i14 = 3;
                    }
                } else if (z10) {
                    System.arraycopy(bArr2, 0, bArr3, 0, i16);
                } else {
                    for (int i23 = 0; i23 < i16; i23++) {
                        bArr3[i23] = mappedByteBuffer.get(i13 + i23);
                    }
                }
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    iArr2 = this.f17056k;
                    if (i24 >= o11) {
                        break;
                    }
                    if (p11 == 0) {
                        iArr2[i24] = (65793 * i24) | (-16777216);
                    } else if (p11 == 1) {
                        iArr2[i24] = ((bArr3[i25] & 255) * 65793) | (-16777216);
                        i25++;
                    } else {
                        int i26 = bArr3[i25] & 255;
                        int i27 = bArr3[i25 + 1] & 255;
                        int i28 = i25 + 3;
                        int i29 = bArr3[i25 + 2] & 255;
                        if (p11 == 4) {
                            i25 += 4;
                            i11 = bArr3[i28] & 255;
                        } else {
                            i25 = i28;
                            i11 = 255;
                        }
                        iArr2[i24] = (i27 << 8) | (i26 << 16) | (i11 << 24) | i29;
                    }
                    i24++;
                }
                for (int i30 = 0; i30 < 4096; i30++) {
                    int i31 = bArr[i30] & 255;
                    if (i31 < o11) {
                        iArr[i30] = iArr2[i31];
                    } else {
                        throw a("Palette index out of range");
                    }
                }
                return;
            }
        }
        l(i13, o10);
        BitmapFactory.Options options = this.e;
        options.inPremultiplied = false;
        Bitmap bitmap2 = null;
        try {
            if (p10 == 2) {
                b10 = e(20, o10);
            } else {
                b10 = b(20, o10);
            }
            bitmap = b10;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bitmap.getPixels(iArr, 0, 64, 0, 0, 64, 64);
            options.inPremultiplied = true;
            bitmap.recycle();
        } catch (Throwable th3) {
            th = th3;
            bitmap2 = bitmap;
            options.inPremultiplied = true;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            throw th;
        }
    }

    public final Bitmap e(int i10, int i11) {
        int i12 = i10 - 20;
        int i13 = i11 & 1;
        k(i12, 1179011410);
        k(i10 - 16, i11 + 12 + i13);
        k(i10 - 12, 1346520407);
        k(i10 - 8, 1278758998);
        k(i10 - 4, i11);
        if (i13 != 0) {
            this.f17052f[i10 + i11] = 0;
        }
        return b(i12, i11 + 20 + i13);
    }

    public final int g(int i10, int i11, int i12) {
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int o10 = o(f(i14));
            if (o10 < i10) {
                i11 = i14 + 1;
            } else if (o10 > i10) {
                i13 = i14 - 1;
            } else {
                return i14;
            }
        }
        return -1;
    }

    public final synchronized Bitmap h(int i10, int i11) {
        int i12;
        Bitmap b10;
        if (i10 >= 0 && i10 <= 15 && i11 >= 0 && i11 < 4096) {
            try {
                i12 = g((i10 * 4096) + i11, 0, this.f17051c);
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            i12 = -1;
        }
        if (i12 < 0) {
            return null;
        }
        int o10 = o(f(i12) + 2);
        if (o10 == 65535) {
            int[] iArr = this.f17054i;
            int f7 = f(i12);
            int i13 = this.f17049a.getInt(f7 + 4);
            int o11 = o(f7 + 8);
            int p5 = p(f7 + 16);
            if (p5 != 2 && p5 != 3) {
                d(iArr, i12);
                b10 = Bitmap.createBitmap(iArr, 64, 64, Bitmap.Config.ARGB_8888);
                return b10;
            }
            l(i13, o11);
            if (p5 == 2) {
                b10 = e(20, o11);
            } else {
                b10 = b(20, o11);
            }
            return b10;
        }
        d(this.f17055j, i12);
        d(this.f17054i, g(o10, this.f17051c, this.f17050b));
        for (int i14 = 0; i14 < 4096; i14++) {
            int[] iArr2 = this.f17055j;
            int i15 = iArr2[i14];
            iArr2[i14] = (i15 & 16777215) | (((((i15 >>> 24) * (this.f17054i[i14] & 255)) + 127) / 255) << 24);
        }
        return Bitmap.createBitmap(this.f17055j, 64, 64, Bitmap.Config.ARGB_8888);
    }

    public final void i(int i10, int i11) {
        Inflater inflater = this.d;
        inflater.reset();
        inflater.setInput(this.f17052f, 20, i10);
        int i12 = 0;
        while (i12 < i11) {
            try {
                int inflate = inflater.inflate(this.f17053g, i12, i11 - i12);
                if (inflate != 0) {
                    i12 += inflate;
                } else {
                    throw a("Truncated DEFLATE stream");
                }
            } catch (DataFormatException e) {
                throw new IllegalStateException("Damaged EPK3 DEFLATE stream", e);
            }
        }
        if (!inflater.finished() && (inflater.inflate(this.h, 0, 1) != 0 || !inflater.finished())) {
            throw a("Oversized DEFLATE stream");
        }
        if (inflater.getRemaining() == 0) {
            return;
        }
        throw a("Trailing DEFLATE bytes");
    }

    public final int j(int i10) {
        int i11;
        int i12 = i10 + 18;
        if ((p(i12) & 128) != 0) {
            int i13 = i10 + 8;
            if (o(i13) >= 3) {
                int o10 = o(this.f17049a.getInt(i10 + 4));
                if (o10 != 0 && (i11 = o10 + 2) <= o(i13)) {
                    return i11;
                }
                throw a("Invalid compressed palette");
            }
            throw a("Truncated compressed palette");
        }
        int o11 = o(i10 + 14) * (p(i12) & 127);
        if ((p(i10 + 19) & 1) != 0) {
            return ((o11 * 7) + 7) / 8;
        }
        return o11;
    }

    public final void k(int i10, int i11) {
        byte[] bArr = this.f17052f;
        bArr[i10] = (byte) i11;
        bArr[i10 + 1] = (byte) (i11 >>> 8);
        bArr[i10 + 2] = (byte) (i11 >>> 16);
        bArr[i10 + 3] = (byte) (i11 >>> 24);
    }

    public final void l(int i10, int i11) {
        byte[] bArr = this.f17052f;
        int i12 = i11 + 21;
        if (bArr.length < i12) {
            int length = bArr.length;
            while (length < i12) {
                length <<= 1;
            }
            this.f17052f = new byte[length];
        }
        MappedByteBuffer mappedByteBuffer = this.f17049a;
        mappedByteBuffer.position(i10);
        mappedByteBuffer.get(this.f17052f, 20, i11);
    }

    public final byte[] m(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[][] bArr = this.f17060o;
            long[] jArr = this.f17059n;
            int[] iArr = this.f17058m;
            if (i11 < 8) {
                if (iArr[i11] == i10) {
                    long j10 = this.f17061p + 1;
                    this.f17061p = j10;
                    jArr[i11] = j10;
                    return bArr[i11];
                }
                if (jArr[i11] < jArr[i12]) {
                    i12 = i11;
                }
                i11++;
            } else {
                if (bArr[i12] == null) {
                    bArr[i12] = new byte[4096];
                }
                iArr[i12] = -1;
                c(i10, bArr[i12]);
                iArr[i12] = i10;
                long j11 = this.f17061p + 1;
                this.f17061p = j11;
                jArr[i12] = j11;
                return bArr[i12];
            }
        }
    }

    public final int o(int i10) {
        return this.f17049a.getShort(i10) & 65535;
    }

    public final int p(int i10) {
        return this.f17049a.get(i10) & 255;
    }

    public final void q(int i10, int i11) {
        if (i10 < this.f17050b && i10 != i11) {
            int f7 = f(i10);
            if (p(f7 + 16) <= 1 && p(f7 + 17) == 0 && o(f7 + 10) == 65535 && o(f7 + 12) == 65535) {
                return;
            }
            throw new IOException("EPK3 dependency chains are forbidden");
        }
        throw new IOException("Invalid root reference");
    }
}
