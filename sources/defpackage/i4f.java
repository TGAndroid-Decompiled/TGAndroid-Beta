package defpackage;

import java.io.IOException;
public abstract class i4f {
    public static int a(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public static int b(int i, byte[] bArr, int i2, int i3, nre nreVar, ucd ucdVar) {
        zpe zpeVar = (zpe) nreVar;
        int h = h(bArr, i2, ucdVar);
        zpeVar.i(ucdVar.a);
        while (h < i3) {
            int h2 = h(bArr, h, ucdVar);
            if (i != ucdVar.a) {
                break;
            }
            h = h(bArr, h2, ucdVar);
            zpeVar.i(ucdVar.a);
        }
        return h;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, s1f s1fVar, ucd ucdVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                s1fVar.a(i, Integer.valueOf(a(i2, bArr)));
                                return i2 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        s1f b = s1f.b();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int h = h(bArr, i2, ucdVar);
                            int i7 = ucdVar.a;
                            if (i7 != i5) {
                                i2 = c(i7, bArr, h, i3, b, ucdVar);
                                i6 = i7;
                            } else {
                                i6 = i7;
                                i2 = h;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            s1fVar.a(i, b);
                            return i2;
                        }
                        throw new IOException("Failed to parse the message.");
                    }
                    int h2 = h(bArr, i2, ucdVar);
                    int i8 = ucdVar.a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - h2) {
                            if (i8 == 0) {
                                s1fVar.a(i, tke.c);
                            } else {
                                s1fVar.a(i, tke.j(h2, i8, bArr));
                            }
                            return h2 + i8;
                        }
                        throw ire.a();
                    }
                    throw ire.b();
                }
                s1fVar.a(i, Long.valueOf(j(i2, bArr)));
                return i2 + 8;
            }
            int i9 = i(bArr, i2, ucdVar);
            s1fVar.a(i, Long.valueOf(ucdVar.b));
            return i9;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int d(int i, byte[] bArr, int i2, ucd ucdVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            ucdVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            ucdVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            ucdVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            ucdVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                ucdVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int e(zye zyeVar, int i, byte[] bArr, int i2, int i3, nre nreVar, ucd ucdVar) {
        int g = g(zyeVar, bArr, i2, i3, ucdVar);
        nreVar.add(ucdVar.c);
        while (g < i3) {
            int h = h(bArr, g, ucdVar);
            if (i != ucdVar.a) {
                break;
            }
            g = g(zyeVar, bArr, h, i3, ucdVar);
            nreVar.add(ucdVar.c);
        }
        return g;
    }

    public static int f(zye zyeVar, byte[] bArr, int i, int i2, int i3, ucd ucdVar) {
        swe sweVar = (swe) zyeVar;
        Object zza = sweVar.zza();
        int j = sweVar.j(zza, bArr, i, i2, i3, ucdVar);
        sweVar.b(zza);
        ucdVar.c = zza;
        return j;
    }

    public static int g(zye zyeVar, byte[] bArr, int i, int i2, ucd ucdVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = d(i4, bArr, i3, ucdVar);
            i4 = ucdVar.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object zza = zyeVar.zza();
            int i6 = i5 + i4;
            zyeVar.c(zza, bArr, i5, i6, ucdVar);
            zyeVar.b(zza);
            ucdVar.c = zza;
            return i6;
        }
        throw ire.a();
    }

    public static int h(byte[] bArr, int i, ucd ucdVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            ucdVar.a = b;
            return i2;
        }
        return d(b, bArr, i2, ucdVar);
    }

    public static int i(byte[] bArr, int i, ucd ucdVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            ucdVar.b = j;
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
        ucdVar.b = j2;
        return i3;
    }

    public static long j(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int k(byte[] bArr, int i, ucd ucdVar) {
        int h = h(bArr, i, ucdVar);
        int i2 = ucdVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                ucdVar.c = "";
                return h;
            }
            ucdVar.c = new String(bArr, h, i2, iqe.a);
            return h + i2;
        }
        throw ire.b();
    }

    public static int l(byte[] r17, int r18, defpackage.ucd r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i4f.l(byte[], int, ucd):int");
    }

    public static int m(byte[] bArr, int i, ucd ucdVar) {
        int h = h(bArr, i, ucdVar);
        int i2 = ucdVar.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - h) {
                if (i2 == 0) {
                    ucdVar.c = tke.c;
                    return h;
                }
                ucdVar.c = tke.j(h, i2, bArr);
                return h + i2;
            }
            throw ire.a();
        }
        throw ire.b();
    }
}
