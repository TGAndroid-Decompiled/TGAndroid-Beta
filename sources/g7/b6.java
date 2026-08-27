package g7;

public abstract class b6 {
    public static int a(byte[] bArr, int i10, ag.j1 j1Var) {
        int iF = f(bArr, i10, j1Var);
        int i11 = j1Var.f488a;
        if (i11 < 0) {
            throw new com.google.android.gms.internal.play_billing.b2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iF) {
            throw new com.google.android.gms.internal.play_billing.b2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            j1Var.d = com.google.android.gms.internal.play_billing.k1.f4053c;
            return iF;
        }
        j1Var.d = com.google.android.gms.internal.play_billing.k1.q(iF, i11, bArr);
        return iF + i11;
    }

    public static int b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int c(com.google.android.gms.internal.play_billing.s2 s2Var, int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.play_billing.y1 y1Var, ag.j1 j1Var) {
        com.google.android.gms.internal.play_billing.u1 u1VarZze = s2Var.zze();
        com.google.android.gms.internal.play_billing.s2 s2Var2 = s2Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        ag.j1 j1Var2 = j1Var;
        int iK = k(u1VarZze, s2Var2, bArr2, i11, i13, j1Var2);
        s2Var2.zzf(u1VarZze);
        j1Var2.d = u1VarZze;
        y1Var.add(u1VarZze);
        while (iK < i13) {
            ag.j1 j1Var3 = j1Var2;
            int i14 = i13;
            int iF = f(bArr2, iK, j1Var3);
            if (i10 != j1Var3.f488a) {
                break;
            }
            byte[] bArr3 = bArr2;
            com.google.android.gms.internal.play_billing.s2 s2Var3 = s2Var2;
            com.google.android.gms.internal.play_billing.u1 u1VarZze2 = s2Var3.zze();
            iK = k(u1VarZze2, s2Var3, bArr3, iF, i14, j1Var3);
            s2Var2 = s2Var3;
            bArr2 = bArr3;
            i13 = i14;
            j1Var2 = j1Var3;
            s2Var2.zzf(u1VarZze2);
            j1Var2.d = u1VarZze2;
            y1Var.add(u1VarZze2);
        }
        return iK;
    }

    public static int d(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.y1 y1Var, ag.j1 j1Var) {
        com.google.android.gms.internal.play_billing.v1 v1Var = (com.google.android.gms.internal.play_billing.v1) y1Var;
        int iF = f(bArr, i10, j1Var);
        int i11 = j1Var.f488a + iF;
        while (iF < i11) {
            iF = f(bArr, iF, j1Var);
            v1Var.o(j1Var.f488a);
        }
        if (iF == i11) {
            return iF;
        }
        throw new com.google.android.gms.internal.play_billing.b2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int e(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.play_billing.w2 w2Var, ag.j1 j1Var) {
        if ((i10 >>> 3) == 0) {
            throw new com.google.android.gms.internal.play_billing.b2("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int i14 = i(bArr, i11, j1Var);
            w2Var.c(i10, Long.valueOf(j1Var.f489b));
            return i14;
        }
        if (i13 == 1) {
            w2Var.c(i10, Long.valueOf(l(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iF = f(bArr, i11, j1Var);
            int i15 = j1Var.f488a;
            if (i15 < 0) {
                throw new com.google.android.gms.internal.play_billing.b2("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i15 > bArr.length - iF) {
                throw new com.google.android.gms.internal.play_billing.b2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i15 == 0) {
                w2Var.c(i10, com.google.android.gms.internal.play_billing.k1.f4053c);
            } else {
                w2Var.c(i10, com.google.android.gms.internal.play_billing.k1.q(iF, i15, bArr));
            }
            return iF + i15;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new com.google.android.gms.internal.play_billing.b2("Protocol message contained an invalid tag (zero).");
            }
            w2Var.c(i10, Integer.valueOf(b(bArr, i11)));
            return i11 + 4;
        }
        int i16 = (i10 & (-8)) | 4;
        com.google.android.gms.internal.play_billing.w2 w2VarB = com.google.android.gms.internal.play_billing.w2.b();
        int i17 = j1Var.f490c + 1;
        j1Var.f490c = i17;
        if (i17 >= 100) {
            throw new com.google.android.gms.internal.play_billing.b2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i18 = 0;
        while (i11 < i12) {
            int iF2 = f(bArr, i11, j1Var);
            int i19 = j1Var.f488a;
            if (i19 == i16) {
                i18 = i19;
                i11 = iF2;
                break;
            }
            i11 = e(i19, bArr, iF2, i12, w2VarB, j1Var);
            i18 = i19;
        }
        j1Var.f490c--;
        if (i11 > i12 || i18 != i16) {
            throw new com.google.android.gms.internal.play_billing.b2("Failed to parse the message.");
        }
        w2Var.c(i10, w2VarB);
        return i11;
    }

    public static int f(byte[] bArr, int i10, ag.j1 j1Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return g(b10, bArr, i11, j1Var);
        }
        j1Var.f488a = b10;
        return i11;
    }

    public static int g(int i10, byte[] bArr, int i11, ag.j1 j1Var) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            j1Var.f488a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            j1Var.f488a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            j1Var.f488a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            j1Var.f488a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                j1Var.f488a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int h(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.play_billing.y1 y1Var, ag.j1 j1Var) {
        com.google.android.gms.internal.play_billing.v1 v1Var = (com.google.android.gms.internal.play_billing.v1) y1Var;
        int iF = f(bArr, i11, j1Var);
        v1Var.o(j1Var.f488a);
        while (iF < i12) {
            int iF2 = f(bArr, iF, j1Var);
            if (i10 != j1Var.f488a) {
                break;
            }
            iF = f(bArr, iF2, j1Var);
            v1Var.o(j1Var.f488a);
        }
        return iF;
    }

    public static int i(byte[] bArr, int i10, ag.j1 j1Var) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            j1Var.f489b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        j1Var.f489b = j11;
        return i12;
    }

    public static int j(Object obj, com.google.android.gms.internal.play_billing.s2 s2Var, byte[] bArr, int i10, int i11, int i12, ag.j1 j1Var) {
        com.google.android.gms.internal.play_billing.m2 m2Var = (com.google.android.gms.internal.play_billing.m2) s2Var;
        int i13 = j1Var.f490c + 1;
        j1Var.f490c = i13;
        if (i13 >= 100) {
            throw new com.google.android.gms.internal.play_billing.b2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iQ = m2Var.q(obj, bArr, i10, i11, i12, j1Var);
        j1Var.f490c--;
        j1Var.d = obj;
        return iQ;
    }

    public static int k(Object obj, com.google.android.gms.internal.play_billing.s2 s2Var, byte[] bArr, int i10, int i11, ag.j1 j1Var) {
        int iG = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iG = g(i12, bArr, iG, j1Var);
            i12 = j1Var.f488a;
        }
        int i13 = iG;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new com.google.android.gms.internal.play_billing.b2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = j1Var.f490c + 1;
        j1Var.f490c = i14;
        if (i14 >= 100) {
            throw new com.google.android.gms.internal.play_billing.b2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i15 = i13 + i12;
        s2Var.b(obj, bArr, i13, i15, j1Var);
        j1Var.f490c--;
        j1Var.d = obj;
        return i15;
    }

    public static long l(int i10, byte[] bArr) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
