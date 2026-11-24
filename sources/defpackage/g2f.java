package defpackage;

import java.io.IOException;
public abstract class g2f {
    public static int a(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public static int b(int i, byte[] bArr, int i2, int i3, kpe kpeVar, sad sadVar) {
        wne wneVar = (wne) kpeVar;
        int h = h(bArr, i2, sadVar);
        wneVar.i(sadVar.a);
        while (h < i3) {
            int h2 = h(bArr, h, sadVar);
            if (i != sadVar.a) {
                break;
            }
            h = h(bArr, h2, sadVar);
            wneVar.i(sadVar.a);
        }
        return h;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, qze qzeVar, sad sadVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                qzeVar.a(i, Integer.valueOf(a(i2, bArr)));
                                return i2 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        qze b = qze.b();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int h = h(bArr, i2, sadVar);
                            int i7 = sadVar.a;
                            if (i7 != i5) {
                                i2 = c(i7, bArr, h, i3, b, sadVar);
                                i6 = i7;
                            } else {
                                i6 = i7;
                                i2 = h;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            qzeVar.a(i, b);
                            return i2;
                        }
                        throw new IOException("Failed to parse the message.");
                    }
                    int h2 = h(bArr, i2, sadVar);
                    int i8 = sadVar.a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - h2) {
                            if (i8 == 0) {
                                qzeVar.a(i, sie.c);
                            } else {
                                qzeVar.a(i, sie.j(h2, i8, bArr));
                            }
                            return h2 + i8;
                        }
                        throw fpe.a();
                    }
                    throw fpe.b();
                }
                qzeVar.a(i, Long.valueOf(j(i2, bArr)));
                return i2 + 8;
            }
            int i9 = i(bArr, i2, sadVar);
            qzeVar.a(i, Long.valueOf(sadVar.b));
            return i9;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int d(int i, byte[] bArr, int i2, sad sadVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            sadVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            sadVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            sadVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            sadVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                sadVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int e(xwe xweVar, int i, byte[] bArr, int i2, int i3, kpe kpeVar, sad sadVar) {
        int g = g(xweVar, bArr, i2, i3, sadVar);
        kpeVar.add(sadVar.c);
        while (g < i3) {
            int h = h(bArr, g, sadVar);
            if (i != sadVar.a) {
                break;
            }
            g = g(xweVar, bArr, h, i3, sadVar);
            kpeVar.add(sadVar.c);
        }
        return g;
    }

    public static int f(xwe xweVar, byte[] bArr, int i, int i2, int i3, sad sadVar) {
        que queVar = (que) xweVar;
        Object zza = queVar.zza();
        int j = queVar.j(zza, bArr, i, i2, i3, sadVar);
        queVar.b(zza);
        sadVar.c = zza;
        return j;
    }

    public static int g(xwe xweVar, byte[] bArr, int i, int i2, sad sadVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = d(i4, bArr, i3, sadVar);
            i4 = sadVar.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object zza = xweVar.zza();
            int i6 = i5 + i4;
            xweVar.c(zza, bArr, i5, i6, sadVar);
            xweVar.b(zza);
            sadVar.c = zza;
            return i6;
        }
        throw fpe.a();
    }

    public static int h(byte[] bArr, int i, sad sadVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            sadVar.a = b;
            return i2;
        }
        return d(b, bArr, i2, sadVar);
    }

    public static int i(byte[] bArr, int i, sad sadVar) {
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

    public static long j(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int k(byte[] bArr, int i, sad sadVar) {
        int h = h(bArr, i, sadVar);
        int i2 = sadVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                sadVar.c = "";
                return h;
            }
            sadVar.c = new String(bArr, h, i2, foe.a);
            return h + i2;
        }
        throw fpe.b();
    }

    public static int l(byte[] r17, int r18, defpackage.sad r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g2f.l(byte[], int, sad):int");
    }

    public static int m(byte[] bArr, int i, sad sadVar) {
        int h = h(bArr, i, sadVar);
        int i2 = sadVar.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - h) {
                if (i2 == 0) {
                    sadVar.c = sie.c;
                    return h;
                }
                sadVar.c = sie.j(h, i2, bArr);
                return h + i2;
            }
            throw fpe.a();
        }
        throw fpe.b();
    }
}
