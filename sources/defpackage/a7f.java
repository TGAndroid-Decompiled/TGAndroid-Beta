package defpackage;

import java.io.IOException;
public abstract class a7f {
    public static int a(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public static int b(int i, byte[] bArr, int i2, int i3, bue bueVar, lfd lfdVar) {
        nse nseVar = (nse) bueVar;
        int h = h(bArr, i2, lfdVar);
        nseVar.i(lfdVar.a);
        while (h < i3) {
            int h2 = h(bArr, h, lfdVar);
            if (i != lfdVar.a) {
                break;
            }
            h = h(bArr, h2, lfdVar);
            nseVar.i(lfdVar.a);
        }
        return h;
    }

    public static int c(int i, byte[] bArr, int i2, int i3, h4f h4fVar, lfd lfdVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                h4fVar.a(i, Integer.valueOf(a(i2, bArr)));
                                return i2 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        h4f b = h4f.b();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int h = h(bArr, i2, lfdVar);
                            int i7 = lfdVar.a;
                            if (i7 != i5) {
                                i2 = c(i7, bArr, h, i3, b, lfdVar);
                                i6 = i7;
                            } else {
                                i6 = i7;
                                i2 = h;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            h4fVar.a(i, b);
                            return i2;
                        }
                        throw new IOException("Failed to parse the message.");
                    }
                    int h2 = h(bArr, i2, lfdVar);
                    int i8 = lfdVar.a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - h2) {
                            if (i8 == 0) {
                                h4fVar.a(i, jne.c);
                            } else {
                                h4fVar.a(i, jne.j(h2, i8, bArr));
                            }
                            return h2 + i8;
                        }
                        throw wte.a();
                    }
                    throw wte.b();
                }
                h4fVar.a(i, Long.valueOf(j(i2, bArr)));
                return i2 + 8;
            }
            int i9 = i(bArr, i2, lfdVar);
            h4fVar.a(i, Long.valueOf(lfdVar.b));
            return i9;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int d(int i, byte[] bArr, int i2, lfd lfdVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            lfdVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            lfdVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            lfdVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            lfdVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                lfdVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int e(o1f o1fVar, int i, byte[] bArr, int i2, int i3, bue bueVar, lfd lfdVar) {
        int g = g(o1fVar, bArr, i2, i3, lfdVar);
        bueVar.add(lfdVar.c);
        while (g < i3) {
            int h = h(bArr, g, lfdVar);
            if (i != lfdVar.a) {
                break;
            }
            g = g(o1fVar, bArr, h, i3, lfdVar);
            bueVar.add(lfdVar.c);
        }
        return g;
    }

    public static int f(o1f o1fVar, byte[] bArr, int i, int i2, int i3, lfd lfdVar) {
        hze hzeVar = (hze) o1fVar;
        Object zza = hzeVar.zza();
        int j = hzeVar.j(zza, bArr, i, i2, i3, lfdVar);
        hzeVar.b(zza);
        lfdVar.c = zza;
        return j;
    }

    public static int g(o1f o1fVar, byte[] bArr, int i, int i2, lfd lfdVar) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = d(i4, bArr, i3, lfdVar);
            i4 = lfdVar.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object zza = o1fVar.zza();
            int i6 = i5 + i4;
            o1fVar.c(zza, bArr, i5, i6, lfdVar);
            o1fVar.b(zza);
            lfdVar.c = zza;
            return i6;
        }
        throw wte.a();
    }

    public static int h(byte[] bArr, int i, lfd lfdVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            lfdVar.a = b;
            return i2;
        }
        return d(b, bArr, i2, lfdVar);
    }

    public static int i(byte[] bArr, int i, lfd lfdVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            lfdVar.b = j;
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
        lfdVar.b = j2;
        return i3;
    }

    public static long j(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int k(byte[] bArr, int i, lfd lfdVar) {
        int h = h(bArr, i, lfdVar);
        int i2 = lfdVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                lfdVar.c = "";
                return h;
            }
            lfdVar.c = new String(bArr, h, i2, xse.a);
            return h + i2;
        }
        throw wte.b();
    }

    public static int l(byte[] r17, int r18, defpackage.lfd r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a7f.l(byte[], int, lfd):int");
    }

    public static int m(byte[] bArr, int i, lfd lfdVar) {
        int h = h(bArr, i, lfdVar);
        int i2 = lfdVar.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - h) {
                if (i2 == 0) {
                    lfdVar.c = jne.c;
                    return h;
                }
                lfdVar.c = jne.j(h, i2, bArr);
                return h + i2;
            }
            throw wte.a();
        }
        throw wte.b();
    }
}
