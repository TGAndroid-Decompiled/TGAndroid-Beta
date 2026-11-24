package defpackage;
public abstract class l1f {
    public static int a(byte[] bArr, int i, kj6 kj6Var) {
        int f = f(bArr, i, kj6Var);
        int i2 = kj6Var.b;
        if (i2 >= 0) {
            if (i2 <= bArr.length - f) {
                if (i2 == 0) {
                    kj6Var.d = zud.c;
                    return f;
                }
                kj6Var.d = zud.l(f, i2, bArr);
                return f + i2;
            }
            fvc.h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        fvc.h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public static int c(bbe bbeVar, int i, byte[] bArr, int i2, int i3, a3e a3eVar, kj6 kj6Var) {
        c2e zze = bbeVar.zze();
        bbe bbeVar2 = bbeVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        kj6 kj6Var2 = kj6Var;
        int k = k(zze, bbeVar2, bArr2, i2, i4, kj6Var2);
        bbeVar2.zzf(zze);
        kj6Var2.d = zze;
        a3eVar.add(zze);
        while (k < i4) {
            kj6 kj6Var3 = kj6Var2;
            int i5 = i4;
            int f = f(bArr2, k, kj6Var3);
            if (i != kj6Var3.b) {
                break;
            }
            byte[] bArr3 = bArr2;
            bbe bbeVar3 = bbeVar2;
            c2e zze2 = bbeVar3.zze();
            k = k(zze2, bbeVar3, bArr3, f, i5, kj6Var3);
            bbeVar2 = bbeVar3;
            bArr2 = bArr3;
            i4 = i5;
            kj6Var2 = kj6Var3;
            bbeVar2.zzf(zze2);
            kj6Var2.d = zze2;
            a3eVar.add(zze2);
        }
        return k;
    }

    public static int d(byte[] bArr, int i, a3e a3eVar, kj6 kj6Var) {
        h2e h2eVar = (h2e) a3eVar;
        int f = f(bArr, i, kj6Var);
        int i2 = kj6Var.b + f;
        while (f < i2) {
            f = f(bArr, f, kj6Var);
            h2eVar.j(kj6Var.b);
        }
        if (f == i2) {
            return f;
        }
        fvc.h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int e(int i, byte[] bArr, int i2, int i3, iee ieeVar, kj6 kj6Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                ieeVar.c(i, Integer.valueOf(b(bArr, i2)));
                                return i2 + 4;
                            }
                            fvc.h("Protocol message contained an invalid tag (zero).");
                            return 0;
                        }
                        int i5 = (i & (-8)) | 4;
                        iee b = iee.b();
                        int i6 = kj6Var.c + 1;
                        kj6Var.c = i6;
                        if (i6 < 100) {
                            int i7 = 0;
                            while (true) {
                                if (i2 >= i3) {
                                    break;
                                }
                                int f = f(bArr, i2, kj6Var);
                                int i8 = kj6Var.b;
                                if (i8 == i5) {
                                    i7 = i8;
                                    i2 = f;
                                    break;
                                }
                                i2 = e(i8, bArr, f, i3, b, kj6Var);
                                i7 = i8;
                            }
                            kj6Var.c--;
                            if (i2 <= i3 && i7 == i5) {
                                ieeVar.c(i, b);
                                return i2;
                            }
                            fvc.h("Failed to parse the message.");
                            return 0;
                        }
                        fvc.h("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        return 0;
                    }
                    int f2 = f(bArr, i2, kj6Var);
                    int i9 = kj6Var.b;
                    if (i9 >= 0) {
                        if (i9 <= bArr.length - f2) {
                            if (i9 == 0) {
                                ieeVar.c(i, zud.c);
                            } else {
                                ieeVar.c(i, zud.l(f2, i9, bArr));
                            }
                            return f2 + i9;
                        }
                        fvc.h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return 0;
                    }
                    fvc.h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    return 0;
                }
                ieeVar.c(i, Long.valueOf(l(i2, bArr)));
                return i2 + 8;
            }
            int i10 = i(bArr, i2, kj6Var);
            ieeVar.c(i, Long.valueOf(kj6Var.a));
            return i10;
        }
        fvc.h("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    public static int f(byte[] bArr, int i, kj6 kj6Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            kj6Var.b = b;
            return i2;
        }
        return g(b, bArr, i2, kj6Var);
    }

    public static int g(int i, byte[] bArr, int i2, kj6 kj6Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            kj6Var.b = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            kj6Var.b = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            kj6Var.b = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            kj6Var.b = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                kj6Var.b = i11;
                return i12;
            }
        }
    }

    public static int h(int i, byte[] bArr, int i2, int i3, a3e a3eVar, kj6 kj6Var) {
        h2e h2eVar = (h2e) a3eVar;
        int f = f(bArr, i2, kj6Var);
        h2eVar.j(kj6Var.b);
        while (f < i3) {
            int f2 = f(bArr, f, kj6Var);
            if (i != kj6Var.b) {
                break;
            }
            f = f(bArr, f2, kj6Var);
            h2eVar.j(kj6Var.b);
        }
        return f;
    }

    public static int i(byte[] bArr, int i, kj6 kj6Var) {
        byte b;
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            kj6Var.a = j;
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
        kj6Var.a = j2;
        return i3;
    }

    public static int j(Object obj, bbe bbeVar, byte[] bArr, int i, int i2, int i3, kj6 kj6Var) {
        l9e l9eVar = (l9e) bbeVar;
        int i4 = kj6Var.c + 1;
        kj6Var.c = i4;
        if (i4 < 100) {
            int o = l9eVar.o(obj, bArr, i, i2, i3, kj6Var);
            kj6Var.c--;
            kj6Var.d = obj;
            return o;
        }
        fvc.h("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        return 0;
    }

    public static int k(Object obj, bbe bbeVar, byte[] bArr, int i, int i2, kj6 kj6Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = g(i4, bArr, i3, kj6Var);
            i4 = kj6Var.b;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = kj6Var.c + 1;
            kj6Var.c = i6;
            if (i6 < 100) {
                int i7 = i5 + i4;
                bbeVar.a(obj, bArr, i5, i7, kj6Var);
                kj6Var.c--;
                kj6Var.d = obj;
                return i7;
            }
            fvc.h("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        fvc.h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static long l(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
