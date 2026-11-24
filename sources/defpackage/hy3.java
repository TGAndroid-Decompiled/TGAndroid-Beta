package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.nio.MappedByteBuffer;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
public final class hy3 {
    public final MappedByteBuffer a;
    public final int b;
    public final int c;
    public final Inflater d = new Inflater(true);
    public final BitmapFactory.Options e = new BitmapFactory.Options();
    public byte[] f = new byte[4096];
    public final byte[] g = new byte[4608];
    public final byte[] h = new byte[4096];
    public final int[] i = new int[4096];
    public final int[] j = new int[4096];
    public final int[] k = new int[256];
    public final byte[] l = new byte[1024];
    public final int[] m = new int[8];
    public final long[] n = new long[8];
    public final byte[][] o = new byte[8];
    public long p;

    public hy3() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy3.<init>():void");
    }

    public static IllegalStateException a(String str) {
        return new IllegalStateException("Damaged emoji.pack: ".concat(str));
    }

    public static int f(int i) {
        return (i * 20) + 32;
    }

    public static int n(int i, int i2) {
        int i3 = i & 63;
        int i4 = i >>> 6;
        if ((i2 & 1) != 0) {
            i3 = 63 - i3;
        }
        if ((i2 & 2) != 0) {
            i4 = 63 - i4;
        }
        if ((i2 & 4) != 0) {
            return (i3 << 6) | i4;
        }
        return (i4 << 6) | i3;
    }

    public final Bitmap b(int i, int i2) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(this.f, i, i2, this.e);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy3.c(int, byte[]):void");
    }

    public final void d(int[] iArr, int i) {
        Bitmap b;
        boolean z;
        int[] iArr2;
        int i2;
        int p;
        int p2;
        int i3;
        int f = f(i);
        MappedByteBuffer mappedByteBuffer = this.a;
        int i4 = mappedByteBuffer.getInt(f + 4);
        int o = o(f + 8);
        int p3 = p(f + 16);
        if (p3 != 2) {
            int i5 = 3;
            if (p3 != 3) {
                byte[] bArr = this.h;
                c(i, bArr);
                int o2 = o(f + 14);
                int i6 = f + 18;
                int p4 = p(i6) & 127;
                int i7 = o2 * p4;
                if ((p(i6) & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int j = j(f) - 2;
                    l(i4 + 2, j);
                    if ((p(f + 19) & 1) != 0) {
                        i3 = ((i7 * 7) + 7) / 8;
                    } else {
                        i3 = i7;
                    }
                    i(j, i3);
                }
                int p5 = p(f + 19) & 1;
                byte[] bArr2 = this.g;
                byte[] bArr3 = this.l;
                if (p5 != 0) {
                    int i8 = 0;
                    while (i8 < i7) {
                        int i9 = i8 * 7;
                        int i10 = i9 & 7;
                        int i11 = i9 >>> i5;
                        if (z) {
                            p = bArr2[i11] & 255;
                        } else {
                            p = p(i4 + i11);
                        }
                        int i12 = p >>> i10;
                        if (i10 > 1) {
                            if (z) {
                                p2 = bArr2[i11 + 1] & 255;
                            } else {
                                p2 = p(i11 + i4 + 1);
                            }
                            i12 |= p2 << (8 - i10);
                        }
                        int i13 = i12 & 127;
                        bArr3[i8] = (byte) ((i13 << 1) | (i13 >>> 6));
                        i8++;
                        i5 = 3;
                    }
                } else if (z) {
                    System.arraycopy(bArr2, 0, bArr3, 0, i7);
                } else {
                    for (int i14 = 0; i14 < i7; i14++) {
                        bArr3[i14] = mappedByteBuffer.get(i4 + i14);
                    }
                }
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    iArr2 = this.k;
                    if (i15 >= o2) {
                        break;
                    }
                    if (p4 == 0) {
                        iArr2[i15] = (65793 * i15) | (-16777216);
                    } else if (p4 == 1) {
                        iArr2[i15] = ((bArr3[i16] & 255) * 65793) | (-16777216);
                        i16++;
                    } else {
                        int i17 = bArr3[i16] & 255;
                        int i18 = bArr3[i16 + 1] & 255;
                        int i19 = i16 + 3;
                        int i20 = bArr3[i16 + 2] & 255;
                        if (p4 == 4) {
                            i16 += 4;
                            i2 = bArr3[i19] & 255;
                        } else {
                            i16 = i19;
                            i2 = 255;
                        }
                        iArr2[i15] = (i2 << 24) | (i17 << 16) | (i18 << 8) | i20;
                    }
                    i15++;
                }
                for (int i21 = 0; i21 < 4096; i21++) {
                    int i22 = bArr[i21] & 255;
                    if (i22 < o2) {
                        iArr[i21] = iArr2[i22];
                    } else {
                        throw a("Palette index out of range");
                    }
                }
                return;
            }
        }
        l(i4, o);
        BitmapFactory.Options options = this.e;
        options.inPremultiplied = false;
        Bitmap bitmap = null;
        try {
            if (p3 == 2) {
                b = e(20, o);
            } else {
                b = b(20, o);
            }
            Bitmap bitmap2 = b;
            try {
                bitmap2.getPixels(iArr, 0, 64, 0, 0, 64, 64);
                options.inPremultiplied = true;
                bitmap2.recycle();
            } catch (Throwable th) {
                th = th;
                bitmap = bitmap2;
                options.inPremultiplied = true;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final Bitmap e(int i, int i2) {
        int i3 = i - 20;
        int i4 = i2 & 1;
        k(i3, 1179011410);
        k(i - 16, i2 + 12 + i4);
        k(i - 12, 1346520407);
        k(i - 8, 1278758998);
        k(i - 4, i2);
        if (i4 != 0) {
            this.f[i + i2] = 0;
        }
        return b(i3, i2 + 20 + i4);
    }

    public final int g(int i, int i2, int i3) {
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int o = o(f(i5));
            if (o < i) {
                i2 = i5 + 1;
            } else if (o > i) {
                i4 = i5 - 1;
            } else {
                return i5;
            }
        }
        return -1;
    }

    public final synchronized Bitmap h(int i, int i2) {
        int i3;
        Bitmap b;
        int i4 = 0;
        if (i >= 0 && i <= 15 && i2 >= 0 && i2 < 4096) {
            i3 = g((i << 12) + i2, 0, this.c);
        } else {
            i3 = -1;
        }
        if (i3 < 0) {
            return null;
        }
        int o = o(f(i3) + 2);
        if (o == 65535) {
            int[] iArr = this.i;
            int f = f(i3);
            int i5 = this.a.getInt(f + 4);
            int o2 = o(f + 8);
            int p = p(f + 16);
            if (p != 2 && p != 3) {
                d(iArr, i3);
                b = Bitmap.createBitmap(iArr, 64, 64, Bitmap.Config.ARGB_8888);
            } else {
                l(i5, o2);
                if (p == 2) {
                    b = e(20, o2);
                } else {
                    b = b(20, o2);
                }
            }
            return b;
        }
        d(this.j, i3);
        d(this.i, g(o, this.c, this.b));
        while (true) {
            int[] iArr2 = this.j;
            if (i4 < 4096) {
                int i6 = iArr2[i4];
                iArr2[i4] = (i6 & 16777215) | (((((i6 >>> 24) * (this.i[i4] & 255)) + 127) / 255) << 24);
                i4++;
            } else {
                return Bitmap.createBitmap(iArr2, 64, 64, Bitmap.Config.ARGB_8888);
            }
        }
    }

    public final void i(int i, int i2) {
        Inflater inflater = this.d;
        inflater.reset();
        inflater.setInput(this.f, 20, i);
        int i3 = 0;
        while (i3 < i2) {
            try {
                int inflate = inflater.inflate(this.g, i3, i2 - i3);
                if (inflate != 0) {
                    i3 += inflate;
                } else {
                    throw a("Truncated DEFLATE stream");
                }
            } catch (DataFormatException e) {
                wa3.h("Damaged EPK3 DEFLATE stream", e);
                return;
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

    public final int j(int i) {
        int i2;
        int i3 = i + 18;
        if ((p(i3) & 128) != 0) {
            int i4 = i + 8;
            if (o(i4) >= 3) {
                int o = o(this.a.getInt(i + 4));
                if (o != 0 && (i2 = o + 2) <= o(i4)) {
                    return i2;
                }
                throw a("Invalid compressed palette");
            }
            throw a("Truncated compressed palette");
        }
        int o2 = o(i + 14) * (p(i3) & 127);
        if ((p(i + 19) & 1) != 0) {
            return ((o2 * 7) + 7) / 8;
        }
        return o2;
    }

    public final void k(int i, int i2) {
        byte[] bArr = this.f;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >>> 8);
        bArr[i + 2] = (byte) (i2 >>> 16);
        bArr[i + 3] = (byte) (i2 >>> 24);
    }

    public final void l(int i, int i2) {
        byte[] bArr = this.f;
        int i3 = i2 + 21;
        if (bArr.length < i3) {
            int length = bArr.length;
            while (length < i3) {
                length <<= 1;
            }
            this.f = new byte[length];
        }
        MappedByteBuffer mappedByteBuffer = this.a;
        mappedByteBuffer.position(i);
        mappedByteBuffer.get(this.f, 20, i2);
    }

    public final byte[] m(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long[] jArr = this.n;
            byte[][] bArr = this.o;
            int[] iArr = this.m;
            if (i2 < 8) {
                if (iArr[i2] == i) {
                    long j = this.p + 1;
                    this.p = j;
                    jArr[i2] = j;
                    return bArr[i2];
                }
                if (jArr[i2] < jArr[i3]) {
                    i3 = i2;
                }
                i2++;
            } else {
                if (bArr[i3] == null) {
                    bArr[i3] = new byte[4096];
                }
                iArr[i3] = -1;
                c(i, bArr[i3]);
                iArr[i3] = i;
                long j2 = this.p + 1;
                this.p = j2;
                jArr[i3] = j2;
                return bArr[i3];
            }
        }
    }

    public final int o(int i) {
        return this.a.getShort(i) & 65535;
    }

    public final int p(int i) {
        return this.a.get(i) & 255;
    }

    public final void q(int i, int i2) {
        if (i < this.b && i != i2) {
            int f = f(i);
            if (p(f + 16) <= 1 && p(f + 17) == 0 && o(f + 10) == 65535 && o(f + 12) == 65535) {
                return;
            }
            wa3.d("EPK3 dependency chains are forbidden");
            return;
        }
        wa3.d("Invalid root reference");
    }
}
