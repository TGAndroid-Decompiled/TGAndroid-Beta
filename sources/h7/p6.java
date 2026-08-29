package h7;

import java.io.IOException;
public abstract class p6 {
    public static int a(byte[] bArr, int i10, cg.w0 w0Var) {
        int f9 = f(bArr, i10, w0Var);
        int i11 = w0Var.f3441a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - f9) {
                if (i11 == 0) {
                    w0Var.d = com.google.android.gms.internal.play_billing.k1.f4625c;
                    return f9;
                }
                w0Var.d = com.google.android.gms.internal.play_billing.k1.q(f9, i11, bArr);
                return f9 + i11;
            }
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int b(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int c(com.google.android.gms.internal.play_billing.s2 s2Var, int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.play_billing.y1 y1Var, cg.w0 w0Var) {
        com.google.android.gms.internal.play_billing.u1 zze = s2Var.zze();
        com.google.android.gms.internal.play_billing.s2 s2Var2 = s2Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        cg.w0 w0Var2 = w0Var;
        int k9 = k(zze, s2Var2, bArr2, i11, i13, w0Var2);
        s2Var2.zzf(zze);
        w0Var2.d = zze;
        y1Var.add(zze);
        while (k9 < i13) {
            cg.w0 w0Var3 = w0Var2;
            int i14 = i13;
            int f9 = f(bArr2, k9, w0Var3);
            if (i10 != w0Var3.f3441a) {
                break;
            }
            byte[] bArr3 = bArr2;
            com.google.android.gms.internal.play_billing.s2 s2Var3 = s2Var2;
            com.google.android.gms.internal.play_billing.u1 zze2 = s2Var3.zze();
            k9 = k(zze2, s2Var3, bArr3, f9, i14, w0Var3);
            s2Var2 = s2Var3;
            bArr2 = bArr3;
            i13 = i14;
            w0Var2 = w0Var3;
            s2Var2.zzf(zze2);
            w0Var2.d = zze2;
            y1Var.add(zze2);
        }
        return k9;
    }

    public static int d(byte[] bArr, int i10, com.google.android.gms.internal.play_billing.y1 y1Var, cg.w0 w0Var) {
        com.google.android.gms.internal.play_billing.v1 v1Var = (com.google.android.gms.internal.play_billing.v1) y1Var;
        int f9 = f(bArr, i10, w0Var);
        int i11 = w0Var.f3441a + f9;
        while (f9 < i11) {
            f9 = f(bArr, f9, w0Var);
            v1Var.o(w0Var.f3441a);
        }
        if (f9 == i11) {
            return f9;
        }
        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int e(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.play_billing.w2 w2Var, cg.w0 w0Var) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                w2Var.c(i10, Integer.valueOf(b(bArr, i11)));
                                return i11 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        int i14 = (i10 & (-8)) | 4;
                        com.google.android.gms.internal.play_billing.w2 b10 = com.google.android.gms.internal.play_billing.w2.b();
                        int i15 = w0Var.f3443c + 1;
                        w0Var.f3443c = i15;
                        if (i15 < 100) {
                            int i16 = 0;
                            while (true) {
                                if (i11 >= i12) {
                                    break;
                                }
                                int f9 = f(bArr, i11, w0Var);
                                int i17 = w0Var.f3441a;
                                if (i17 == i14) {
                                    i16 = i17;
                                    i11 = f9;
                                    break;
                                }
                                i11 = e(i17, bArr, f9, i12, b10, w0Var);
                                i16 = i17;
                            }
                            w0Var.f3443c--;
                            if (i11 <= i12 && i16 == i14) {
                                w2Var.c(i10, b10);
                                return i11;
                            }
                            throw new IOException("Failed to parse the message.");
                        }
                        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    int f10 = f(bArr, i11, w0Var);
                    int i18 = w0Var.f3441a;
                    if (i18 >= 0) {
                        if (i18 <= bArr.length - f10) {
                            if (i18 == 0) {
                                w2Var.c(i10, com.google.android.gms.internal.play_billing.k1.f4625c);
                            } else {
                                w2Var.c(i10, com.google.android.gms.internal.play_billing.k1.q(f10, i18, bArr));
                            }
                            return f10 + i18;
                        }
                        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                w2Var.c(i10, Long.valueOf(l(i11, bArr)));
                return i11 + 8;
            }
            int i19 = i(bArr, i11, w0Var);
            w2Var.c(i10, Long.valueOf(w0Var.f3442b));
            return i19;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int f(byte[] bArr, int i10, cg.w0 w0Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            w0Var.f3441a = b10;
            return i11;
        }
        return g(b10, bArr, i11, w0Var);
    }

    public static int g(int i10, byte[] bArr, int i11, cg.w0 w0Var) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            w0Var.f3441a = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            w0Var.f3441a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            w0Var.f3441a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            w0Var.f3441a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                w0Var.f3441a = i20;
                return i21;
            }
        }
    }

    public static int h(int i10, byte[] bArr, int i11, int i12, com.google.android.gms.internal.play_billing.y1 y1Var, cg.w0 w0Var) {
        com.google.android.gms.internal.play_billing.v1 v1Var = (com.google.android.gms.internal.play_billing.v1) y1Var;
        int f9 = f(bArr, i11, w0Var);
        v1Var.o(w0Var.f3441a);
        while (f9 < i12) {
            int f10 = f(bArr, f9, w0Var);
            if (i10 != w0Var.f3441a) {
                break;
            }
            f9 = f(bArr, f10, w0Var);
            v1Var.o(w0Var.f3441a);
        }
        return f9;
    }

    public static int i(byte[] bArr, int i10, cg.w0 w0Var) {
        byte b10;
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            w0Var.f3442b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b11 = bArr[i11];
        long j11 = (j10 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b11 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (b10 & Byte.MAX_VALUE) << i13;
            b11 = bArr[i12];
            i12 = i14;
        }
        w0Var.f3442b = j11;
        return i12;
    }

    public static int j(Object obj, com.google.android.gms.internal.play_billing.s2 s2Var, byte[] bArr, int i10, int i11, int i12, cg.w0 w0Var) {
        com.google.android.gms.internal.play_billing.m2 m2Var = (com.google.android.gms.internal.play_billing.m2) s2Var;
        int i13 = w0Var.f3443c + 1;
        w0Var.f3443c = i13;
        if (i13 < 100) {
            int q6 = m2Var.q(obj, bArr, i10, i11, i12, w0Var);
            w0Var.f3443c--;
            w0Var.d = obj;
            return q6;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static int k(Object obj, com.google.android.gms.internal.play_billing.s2 s2Var, byte[] bArr, int i10, int i11, cg.w0 w0Var) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = g(i13, bArr, i12, w0Var);
            i13 = w0Var.f3441a;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = w0Var.f3443c + 1;
            w0Var.f3443c = i15;
            if (i15 < 100) {
                int i16 = i14 + i13;
                s2Var.a(obj, bArr, i14, i16, w0Var);
                w0Var.f3443c--;
                w0Var.d = obj;
                return i16;
            }
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static long l(int i10, byte[] bArr) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
