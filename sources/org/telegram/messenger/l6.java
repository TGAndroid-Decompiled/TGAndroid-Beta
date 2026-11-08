package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
public final class l6 {
    public final MappedByteBuffer f23846a;
    public final int f23847b;
    public final int f23848c;
    public final Inflater d = new Inflater(true);
    public final BitmapFactory.Options f23849e = new BitmapFactory.Options();
    public byte[] f23850f = new byte[4096];
    public final byte[] f23851g = new byte[4608];
    public final byte[] h = new byte[4096];
    public final int[] f23852i = new int[4096];
    public final int[] f23853j = new int[4096];
    public final int[] f23854k = new int[256];
    public final byte[] f23855l = new byte[1024];
    public final int[] f23856m = new int[8];
    public final long[] f23857n = new long[8];
    public final byte[][] f23858o = new byte[8];
    public long f23859p;

    public l6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.l6.<init>():void");
    }

    public static IllegalStateException a(String str) {
        return new IllegalStateException("Damaged emoji.pack: ".concat(str));
    }

    public static int f(int i7) {
        return (i7 * 20) + 32;
    }

    public static int n(int i7, int i10) {
        int i11 = i7 & 63;
        int i12 = i7 >>> 6;
        if ((i10 & 1) != 0) {
            i11 = 63 - i11;
        }
        if ((i10 & 2) != 0) {
            i12 = 63 - i12;
        }
        if ((i10 & 4) != 0) {
            return i12 | (i11 << 6);
        }
        return (i12 << 6) | i11;
    }

    public final Bitmap b(int i7, int i10) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(this.f23850f, i7, i10, this.f23849e);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.l6.c(int, byte[]):void");
    }

    public final void d(int[] iArr, int i7) {
        Bitmap b10;
        Bitmap bitmap;
        boolean z9;
        int[] iArr2;
        int i10;
        int p10;
        int p11;
        int i11;
        int f10 = f(i7);
        MappedByteBuffer mappedByteBuffer = this.f23846a;
        int i12 = mappedByteBuffer.getInt(f10 + 4);
        int o4 = o(f10 + 8);
        int p12 = p(f10 + 16);
        if (p12 != 2) {
            int i13 = 3;
            if (p12 != 3) {
                byte[] bArr = this.h;
                c(i7, bArr);
                int o10 = o(f10 + 14);
                int i14 = f10 + 18;
                int p13 = p(i14) & 127;
                int i15 = o10 * p13;
                if ((p(i14) & 128) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    int j3 = j(f10) - 2;
                    l(i12 + 2, j3);
                    if ((p(f10 + 19) & 1) != 0) {
                        i11 = ((i15 * 7) + 7) / 8;
                    } else {
                        i11 = i15;
                    }
                    i(j3, i11);
                }
                int p14 = p(f10 + 19) & 1;
                byte[] bArr2 = this.f23851g;
                byte[] bArr3 = this.f23855l;
                if (p14 != 0) {
                    int i16 = 0;
                    while (i16 < i15) {
                        int i17 = i16 * 7;
                        int i18 = i17 & 7;
                        int i19 = i17 >>> i13;
                        if (z9) {
                            p10 = bArr2[i19] & 255;
                        } else {
                            p10 = p(i12 + i19);
                        }
                        int i20 = p10 >>> i18;
                        if (i18 > 1) {
                            if (z9) {
                                p11 = bArr2[i19 + 1] & 255;
                            } else {
                                p11 = p(i19 + i12 + 1);
                            }
                            i20 |= p11 << (8 - i18);
                        }
                        int i21 = i20 & 127;
                        bArr3[i16] = (byte) ((i21 >>> 6) | (i21 << 1));
                        i16++;
                        i13 = 3;
                    }
                } else if (z9) {
                    System.arraycopy(bArr2, 0, bArr3, 0, i15);
                } else {
                    for (int i22 = 0; i22 < i15; i22++) {
                        bArr3[i22] = mappedByteBuffer.get(i12 + i22);
                    }
                }
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    iArr2 = this.f23854k;
                    if (i23 >= o10) {
                        break;
                    }
                    if (p13 == 0) {
                        iArr2[i23] = (65793 * i23) | (-16777216);
                    } else if (p13 == 1) {
                        iArr2[i23] = ((bArr3[i24] & 255) * 65793) | (-16777216);
                        i24++;
                    } else {
                        int i25 = bArr3[i24] & 255;
                        int i26 = bArr3[i24 + 1] & 255;
                        int i27 = i24 + 3;
                        int i28 = bArr3[i24 + 2] & 255;
                        if (p13 == 4) {
                            i24 += 4;
                            i10 = bArr3[i27] & 255;
                        } else {
                            i24 = i27;
                            i10 = 255;
                        }
                        iArr2[i23] = (i26 << 8) | (i25 << 16) | (i10 << 24) | i28;
                    }
                    i23++;
                }
                for (int i29 = 0; i29 < 4096; i29++) {
                    int i30 = bArr[i29] & 255;
                    if (i30 < o10) {
                        iArr[i29] = iArr2[i30];
                    } else {
                        throw a("Palette index out of range");
                    }
                }
                return;
            }
        }
        l(i12, o4);
        BitmapFactory.Options options = this.f23849e;
        options.inPremultiplied = false;
        Bitmap bitmap2 = null;
        try {
            if (p12 == 2) {
                b10 = e(20, o4);
            } else {
                b10 = b(20, o4);
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

    public final Bitmap e(int i7, int i10) {
        int i11 = i7 - 20;
        int i12 = i10 & 1;
        k(i11, 1179011410);
        k(i7 - 16, i10 + 12 + i12);
        k(i7 - 12, 1346520407);
        k(i7 - 8, 1278758998);
        k(i7 - 4, i10);
        if (i12 != 0) {
            this.f23850f[i7 + i10] = 0;
        }
        return b(i11, i10 + 20 + i12);
    }

    public final int g(int i7, int i10, int i11) {
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int o4 = o(f(i13));
            if (o4 < i7) {
                i10 = i13 + 1;
            } else if (o4 > i7) {
                i12 = i13 - 1;
            } else {
                return i13;
            }
        }
        return -1;
    }

    public final synchronized Bitmap h(int i7, int i10) {
        int i11;
        Bitmap b10;
        if (i7 >= 0 && i7 <= 15 && i10 >= 0 && i10 < 4096) {
            try {
                i11 = g((i7 * 4096) + i10, 0, this.f23848c);
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            i11 = -1;
        }
        if (i11 < 0) {
            return null;
        }
        int o4 = o(f(i11) + 2);
        if (o4 == 65535) {
            int[] iArr = this.f23852i;
            int f10 = f(i11);
            int i12 = this.f23846a.getInt(f10 + 4);
            int o10 = o(f10 + 8);
            int p10 = p(f10 + 16);
            if (p10 != 2 && p10 != 3) {
                d(iArr, i11);
                b10 = Bitmap.createBitmap(iArr, 64, 64, Bitmap.Config.ARGB_8888);
                return b10;
            }
            l(i12, o10);
            if (p10 == 2) {
                b10 = e(20, o10);
            } else {
                b10 = b(20, o10);
            }
            return b10;
        }
        d(this.f23853j, i11);
        d(this.f23852i, g(o4, this.f23848c, this.f23847b));
        for (int i13 = 0; i13 < 4096; i13++) {
            int[] iArr2 = this.f23853j;
            int i14 = iArr2[i13];
            iArr2[i13] = (i14 & 16777215) | (((((i14 >>> 24) * (this.f23852i[i13] & 255)) + 127) / 255) << 24);
        }
        return Bitmap.createBitmap(this.f23853j, 64, 64, Bitmap.Config.ARGB_8888);
    }

    public final void i(int i7, int i10) {
        Inflater inflater = this.d;
        inflater.reset();
        inflater.setInput(this.f23850f, 20, i7);
        int i11 = 0;
        while (i11 < i10) {
            try {
                int inflate = inflater.inflate(this.f23851g, i11, i10 - i11);
                if (inflate != 0) {
                    i11 += inflate;
                } else {
                    throw a("Truncated DEFLATE stream");
                }
            } catch (DataFormatException e10) {
                throw new IllegalStateException("Damaged EPK3 DEFLATE stream", e10);
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

    public final int j(int i7) {
        int i10;
        int i11 = i7 + 18;
        if ((p(i11) & 128) != 0) {
            int i12 = i7 + 8;
            if (o(i12) >= 3) {
                int o4 = o(this.f23846a.getInt(i7 + 4));
                if (o4 != 0 && (i10 = o4 + 2) <= o(i12)) {
                    return i10;
                }
                throw a("Invalid compressed palette");
            }
            throw a("Truncated compressed palette");
        }
        int o10 = o(i7 + 14) * (p(i11) & 127);
        if ((p(i7 + 19) & 1) != 0) {
            return ((o10 * 7) + 7) / 8;
        }
        return o10;
    }

    public final void k(int i7, int i10) {
        byte[] bArr = this.f23850f;
        bArr[i7] = (byte) i10;
        bArr[i7 + 1] = (byte) (i10 >>> 8);
        bArr[i7 + 2] = (byte) (i10 >>> 16);
        bArr[i7 + 3] = (byte) (i10 >>> 24);
    }

    public final void l(int i7, int i10) {
        byte[] bArr = this.f23850f;
        int i11 = i10 + 21;
        if (bArr.length < i11) {
            int length = bArr.length;
            while (length < i11) {
                length <<= 1;
            }
            this.f23850f = new byte[length];
        }
        MappedByteBuffer mappedByteBuffer = this.f23846a;
        mappedByteBuffer.position(i7);
        mappedByteBuffer.get(this.f23850f, 20, i10);
    }

    public final byte[] m(int i7) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[][] bArr = this.f23858o;
            long[] jArr = this.f23857n;
            int[] iArr = this.f23856m;
            if (i10 < 8) {
                if (iArr[i10] == i7) {
                    long j3 = this.f23859p + 1;
                    this.f23859p = j3;
                    jArr[i10] = j3;
                    return bArr[i10];
                }
                if (jArr[i10] < jArr[i11]) {
                    i11 = i10;
                }
                i10++;
            } else {
                if (bArr[i11] == null) {
                    bArr[i11] = new byte[4096];
                }
                iArr[i11] = -1;
                c(i7, bArr[i11]);
                iArr[i11] = i7;
                long j10 = this.f23859p + 1;
                this.f23859p = j10;
                jArr[i11] = j10;
                return bArr[i11];
            }
        }
    }

    public final int o(int i7) {
        return this.f23846a.getShort(i7) & 65535;
    }

    public final int p(int i7) {
        return this.f23846a.get(i7) & 255;
    }

    public final void q(int i7, int i10) {
        if (i7 < this.f23847b && i7 != i10) {
            int f10 = f(i7);
            if (p(f10 + 16) <= 1 && p(f10 + 17) == 0 && o(f10 + 10) == 65535 && o(f10 + 12) == 65535) {
                return;
            }
            throw new IOException("EPK3 dependency chains are forbidden");
        }
        throw new IOException("Invalid root reference");
    }
}
