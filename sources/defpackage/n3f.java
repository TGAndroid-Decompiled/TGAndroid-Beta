package defpackage;
public abstract class n3f {
    public static int a(byte[] bArr, int i, nl6 nl6Var) {
        int f = f(bArr, i, nl6Var);
        int i2 = nl6Var.b;
        if (i2 >= 0) {
            if (i2 <= bArr.length - f) {
                if (i2 == 0) {
                    nl6Var.d = cxd.c;
                    return f;
                }
                nl6Var.d = cxd.l(f, i2, bArr);
                return f + i2;
            }
            i2d.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        i2d.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return 0;
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public static int c(cde cdeVar, int i, byte[] bArr, int i2, int i3, d5e d5eVar, nl6 nl6Var) {
        f4e zze = cdeVar.zze();
        cde cdeVar2 = cdeVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        nl6 nl6Var2 = nl6Var;
        int k = k(zze, cdeVar2, bArr2, i2, i4, nl6Var2);
        cdeVar2.zzf(zze);
        nl6Var2.d = zze;
        d5eVar.add(zze);
        while (k < i4) {
            nl6 nl6Var3 = nl6Var2;
            int i5 = i4;
            int f = f(bArr2, k, nl6Var3);
            if (i != nl6Var3.b) {
                break;
            }
            byte[] bArr3 = bArr2;
            cde cdeVar3 = cdeVar2;
            f4e zze2 = cdeVar3.zze();
            k = k(zze2, cdeVar3, bArr3, f, i5, nl6Var3);
            cdeVar2 = cdeVar3;
            bArr2 = bArr3;
            i4 = i5;
            nl6Var2 = nl6Var3;
            cdeVar2.zzf(zze2);
            nl6Var2.d = zze2;
            d5eVar.add(zze2);
        }
        return k;
    }

    public static int d(byte[] bArr, int i, d5e d5eVar, nl6 nl6Var) {
        k4e k4eVar = (k4e) d5eVar;
        int f = f(bArr, i, nl6Var);
        int i2 = nl6Var.b + f;
        while (f < i2) {
            f = f(bArr, f, nl6Var);
            k4eVar.j(nl6Var.b);
        }
        if (f == i2) {
            return f;
        }
        i2d.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int e(int i, byte[] bArr, int i2, int i3, jge jgeVar, nl6 nl6Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                jgeVar.c(i, Integer.valueOf(b(bArr, i2)));
                                return i2 + 4;
                            }
                            i2d.g("Protocol message contained an invalid tag (zero).");
                            return 0;
                        }
                        int i5 = (i & (-8)) | 4;
                        jge b = jge.b();
                        int i6 = nl6Var.c + 1;
                        nl6Var.c = i6;
                        if (i6 < 100) {
                            int i7 = 0;
                            while (true) {
                                if (i2 >= i3) {
                                    break;
                                }
                                int f = f(bArr, i2, nl6Var);
                                int i8 = nl6Var.b;
                                if (i8 == i5) {
                                    i7 = i8;
                                    i2 = f;
                                    break;
                                }
                                i2 = e(i8, bArr, f, i3, b, nl6Var);
                                i7 = i8;
                            }
                            nl6Var.c--;
                            if (i2 <= i3 && i7 == i5) {
                                jgeVar.c(i, b);
                                return i2;
                            }
                            i2d.g("Failed to parse the message.");
                            return 0;
                        }
                        i2d.g("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                        return 0;
                    }
                    int f2 = f(bArr, i2, nl6Var);
                    int i9 = nl6Var.b;
                    if (i9 >= 0) {
                        if (i9 <= bArr.length - f2) {
                            if (i9 == 0) {
                                jgeVar.c(i, cxd.c);
                            } else {
                                jgeVar.c(i, cxd.l(f2, i9, bArr));
                            }
                            return f2 + i9;
                        }
                        i2d.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return 0;
                    }
                    i2d.g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    return 0;
                }
                jgeVar.c(i, Long.valueOf(l(i2, bArr)));
                return i2 + 8;
            }
            int i10 = i(bArr, i2, nl6Var);
            jgeVar.c(i, Long.valueOf(nl6Var.a));
            return i10;
        }
        i2d.g("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    public static int f(byte[] bArr, int i, nl6 nl6Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            nl6Var.b = b;
            return i2;
        }
        return g(b, bArr, i2, nl6Var);
    }

    public static int g(int i, byte[] bArr, int i2, nl6 nl6Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            nl6Var.b = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            nl6Var.b = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            nl6Var.b = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            nl6Var.b = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                nl6Var.b = i11;
                return i12;
            }
        }
    }

    public static int h(int i, byte[] bArr, int i2, int i3, d5e d5eVar, nl6 nl6Var) {
        k4e k4eVar = (k4e) d5eVar;
        int f = f(bArr, i2, nl6Var);
        k4eVar.j(nl6Var.b);
        while (f < i3) {
            int f2 = f(bArr, f, nl6Var);
            if (i != nl6Var.b) {
                break;
            }
            f = f(bArr, f2, nl6Var);
            k4eVar.j(nl6Var.b);
        }
        return f;
    }

    public static int i(byte[] bArr, int i, nl6 nl6Var) {
        byte b;
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            nl6Var.a = j;
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
        nl6Var.a = j2;
        return i3;
    }

    public static int j(Object obj, cde cdeVar, byte[] bArr, int i, int i2, int i3, nl6 nl6Var) {
        mbe mbeVar = (mbe) cdeVar;
        int i4 = nl6Var.c + 1;
        nl6Var.c = i4;
        if (i4 < 100) {
            int o = mbeVar.o(obj, bArr, i, i2, i3, nl6Var);
            nl6Var.c--;
            nl6Var.d = obj;
            return o;
        }
        i2d.g("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        return 0;
    }

    public static int k(Object obj, cde cdeVar, byte[] bArr, int i, int i2, nl6 nl6Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = g(i4, bArr, i3, nl6Var);
            i4 = nl6Var.b;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = nl6Var.c + 1;
            nl6Var.c = i6;
            if (i6 < 100) {
                int i7 = i5 + i4;
                cdeVar.a(obj, bArr, i5, i7, nl6Var);
                nl6Var.c--;
                nl6Var.d = obj;
                return i7;
            }
            i2d.g("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        i2d.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static long l(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}
