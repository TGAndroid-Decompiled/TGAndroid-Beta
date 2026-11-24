package defpackage;

import java.io.IOException;
public abstract class pze {
    public static int a(int i, byte[] bArr, int i2, int i3, sad sadVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = d(bArr, i2, sadVar);
                            i6 = sadVar.a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = a(i6, bArr, i2, i3, sadVar);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw vkd.b();
                    }
                    return d(bArr, i2, sadVar) + sadVar.a;
                }
                return i2 + 8;
            }
            return e(bArr, i2, sadVar);
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int b(int i, byte[] bArr, int i2, int i3, dyd dydVar, sad sadVar) {
        Object i4;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 3) {
                            if (i5 == 5) {
                                dydVar.a(i, Integer.valueOf(f(i2, bArr)));
                                return i2 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        dyd b = dyd.b();
                        int i6 = (i & (-8)) | 4;
                        int i7 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int d = d(bArr, i2, sadVar);
                            int i8 = sadVar.a;
                            if (i8 != i6) {
                                i2 = b(i8, bArr, d, i3, b, sadVar);
                                i7 = i8;
                            } else {
                                i7 = i8;
                                i2 = d;
                                break;
                            }
                        }
                        if (i2 <= i3 && i7 == i6) {
                            dydVar.a(i, b);
                            return i2;
                        }
                        throw vkd.b();
                    }
                    int d2 = d(bArr, i2, sadVar);
                    int i9 = sadVar.a;
                    if (i9 == 0) {
                        i4 = cdd.c;
                    } else {
                        i4 = cdd.i(d2, i9, bArr);
                    }
                    dydVar.a(i, i4);
                    return d2 + i9;
                }
                dydVar.a(i, Long.valueOf(h(i2, bArr)));
                return i2 + 8;
            }
            int e = e(bArr, i2, sadVar);
            dydVar.a(i, Long.valueOf(sadVar.b));
            return e;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int c(int i, byte[] bArr, int i2, sad sadVar) {
        int i3;
        int i4 = i & 127;
        int i5 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i3 = b << 7;
        } else {
            int i6 = i4 | ((b & Byte.MAX_VALUE) << 7);
            int i7 = i2 + 2;
            byte b2 = bArr[i5];
            if (b2 >= 0) {
                sadVar.a = i6 | (b2 << 14);
                return i7;
            }
            i4 = i6 | ((b2 & Byte.MAX_VALUE) << 14);
            i5 = i2 + 3;
            byte b3 = bArr[i7];
            if (b3 >= 0) {
                i3 = b3 << 21;
            } else {
                int i8 = i4 | ((b3 & Byte.MAX_VALUE) << 21);
                int i9 = i2 + 4;
                byte b4 = bArr[i5];
                if (b4 >= 0) {
                    sadVar.a = i8 | (b4 << 28);
                    return i9;
                }
                int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 28);
                while (true) {
                    int i11 = i9 + 1;
                    if (bArr[i9] >= 0) {
                        sadVar.a = i10;
                        return i11;
                    }
                    i9 = i11;
                }
            }
        }
        sadVar.a = i4 | i3;
        return i5;
    }

    public static int d(byte[] bArr, int i, sad sadVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            sadVar.a = b;
            return i2;
        }
        return c(b, bArr, i2, sadVar);
    }

    public static int e(byte[] bArr, int i, sad sadVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            sadVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        sadVar.b = j2;
        return i3;
    }

    public static int f(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public static int g(byte[] bArr, int i, sad sadVar) {
        int d = d(bArr, i, sadVar);
        int i2 = sadVar.a;
        if (i2 == 0) {
            sadVar.c = "";
            return d;
        }
        int i3 = d + i2;
        if (l0e.a.b(bArr, d, i3)) {
            sadVar.c = new String(bArr, d, i2, ejd.a);
            return i3;
        }
        throw new IOException("Protocol message had invalid UTF-8.");
    }

    public static long h(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int i(byte[] bArr, int i, sad sadVar) {
        int d = d(bArr, i, sadVar);
        int i2 = sadVar.a;
        if (i2 == 0) {
            sadVar.c = cdd.c;
            return d;
        }
        sadVar.c = cdd.i(d, i2, bArr);
        return d + i2;
    }
}
