package f7;

import java.io.IOException;
public abstract class c6 {
    public static int a(byte[] bArr, int i9, com.google.android.gms.internal.play_billing.h1 h1Var) {
        int f10 = f(bArr, i9, h1Var);
        int i10 = h1Var.f3582a;
        if (i10 >= 0) {
            if (i10 <= bArr.length - f10) {
                if (i10 == 0) {
                    h1Var.d = com.google.android.gms.internal.play_billing.l1.f3619c;
                    return f10;
                }
                h1Var.d = com.google.android.gms.internal.play_billing.l1.q(f10, i10, bArr);
                return f10 + i10;
            }
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int b(byte[] bArr, int i9) {
        int i10 = (bArr[i9 + 1] & 255) << 8;
        return ((bArr[i9 + 3] & 255) << 24) | i10 | (bArr[i9] & 255) | ((bArr[i9 + 2] & 255) << 16);
    }

    public static int c(com.google.android.gms.internal.play_billing.t2 t2Var, int i9, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.h1 h1Var) {
        com.google.android.gms.internal.play_billing.v1 zze = t2Var.zze();
        com.google.android.gms.internal.play_billing.t2 t2Var2 = t2Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        com.google.android.gms.internal.play_billing.h1 h1Var2 = h1Var;
        int k10 = k(zze, t2Var2, bArr2, i10, i12, h1Var2);
        t2Var2.zzf(zze);
        h1Var2.d = zze;
        z1Var.add(zze);
        while (k10 < i12) {
            com.google.android.gms.internal.play_billing.h1 h1Var3 = h1Var2;
            int i13 = i12;
            int f10 = f(bArr2, k10, h1Var3);
            if (i9 != h1Var3.f3582a) {
                break;
            }
            byte[] bArr3 = bArr2;
            com.google.android.gms.internal.play_billing.t2 t2Var3 = t2Var2;
            com.google.android.gms.internal.play_billing.v1 zze2 = t2Var3.zze();
            k10 = k(zze2, t2Var3, bArr3, f10, i13, h1Var3);
            t2Var2 = t2Var3;
            bArr2 = bArr3;
            i12 = i13;
            h1Var2 = h1Var3;
            t2Var2.zzf(zze2);
            h1Var2.d = zze2;
            z1Var.add(zze2);
        }
        return k10;
    }

    public static int d(byte[] bArr, int i9, com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.h1 h1Var) {
        com.google.android.gms.internal.play_billing.w1 w1Var = (com.google.android.gms.internal.play_billing.w1) z1Var;
        int f10 = f(bArr, i9, h1Var);
        int i10 = h1Var.f3582a + f10;
        while (f10 < i10) {
            f10 = f(bArr, f10, h1Var);
            w1Var.o(h1Var.f3582a);
        }
        if (f10 == i10) {
            return f10;
        }
        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int e(int i9, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.x2 x2Var, com.google.android.gms.internal.play_billing.h1 h1Var) {
        if ((i9 >>> 3) != 0) {
            int i12 = i9 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                x2Var.c(i9, Integer.valueOf(b(bArr, i10)));
                                return i10 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        int i13 = (i9 & (-8)) | 4;
                        com.google.android.gms.internal.play_billing.x2 b10 = com.google.android.gms.internal.play_billing.x2.b();
                        int i14 = h1Var.f3583b + 1;
                        h1Var.f3583b = i14;
                        if (i14 < 100) {
                            int i15 = 0;
                            while (true) {
                                if (i10 >= i11) {
                                    break;
                                }
                                int f10 = f(bArr, i10, h1Var);
                                int i16 = h1Var.f3582a;
                                if (i16 == i13) {
                                    i15 = i16;
                                    i10 = f10;
                                    break;
                                }
                                i10 = e(i16, bArr, f10, i11, b10, h1Var);
                                i15 = i16;
                            }
                            h1Var.f3583b--;
                            if (i10 <= i11 && i15 == i13) {
                                x2Var.c(i9, b10);
                                return i10;
                            }
                            throw new IOException("Failed to parse the message.");
                        }
                        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    int f11 = f(bArr, i10, h1Var);
                    int i17 = h1Var.f3582a;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - f11) {
                            if (i17 == 0) {
                                x2Var.c(i9, com.google.android.gms.internal.play_billing.l1.f3619c);
                            } else {
                                x2Var.c(i9, com.google.android.gms.internal.play_billing.l1.q(f11, i17, bArr));
                            }
                            return f11 + i17;
                        }
                        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                x2Var.c(i9, Long.valueOf(l(i10, bArr)));
                return i10 + 8;
            }
            int i18 = i(bArr, i10, h1Var);
            x2Var.c(i9, Long.valueOf(h1Var.f3584c));
            return i18;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int f(byte[] bArr, int i9, com.google.android.gms.internal.play_billing.h1 h1Var) {
        int i10 = i9 + 1;
        byte b10 = bArr[i9];
        if (b10 >= 0) {
            h1Var.f3582a = b10;
            return i10;
        }
        return g(b10, bArr, i10, h1Var);
    }

    public static int g(int i9, byte[] bArr, int i10, com.google.android.gms.internal.play_billing.h1 h1Var) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i9 & 127;
        if (b10 >= 0) {
            h1Var.f3582a = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            h1Var.f3582a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            h1Var.f3582a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            h1Var.f3582a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                h1Var.f3582a = i19;
                return i20;
            }
        }
    }

    public static int h(int i9, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.h1 h1Var) {
        com.google.android.gms.internal.play_billing.w1 w1Var = (com.google.android.gms.internal.play_billing.w1) z1Var;
        int f10 = f(bArr, i10, h1Var);
        w1Var.o(h1Var.f3582a);
        while (f10 < i11) {
            int f11 = f(bArr, f10, h1Var);
            if (i9 != h1Var.f3582a) {
                break;
            }
            f10 = f(bArr, f11, h1Var);
            w1Var.o(h1Var.f3582a);
        }
        return f10;
    }

    public static int i(byte[] bArr, int i9, com.google.android.gms.internal.play_billing.h1 h1Var) {
        byte b10;
        long j10 = bArr[i9];
        int i10 = i9 + 1;
        if (j10 >= 0) {
            h1Var.f3584c = j10;
            return i10;
        }
        int i11 = i9 + 2;
        byte b11 = bArr[i10];
        long j11 = (j10 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b11 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j11 |= (b10 & Byte.MAX_VALUE) << i12;
            b11 = bArr[i11];
            i11 = i13;
        }
        h1Var.f3584c = j11;
        return i11;
    }

    public static int j(Object obj, com.google.android.gms.internal.play_billing.t2 t2Var, byte[] bArr, int i9, int i10, int i11, com.google.android.gms.internal.play_billing.h1 h1Var) {
        com.google.android.gms.internal.play_billing.n2 n2Var = (com.google.android.gms.internal.play_billing.n2) t2Var;
        int i12 = h1Var.f3583b + 1;
        h1Var.f3583b = i12;
        if (i12 < 100) {
            int q10 = n2Var.q(obj, bArr, i9, i10, i11, h1Var);
            h1Var.f3583b--;
            h1Var.d = obj;
            return q10;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static int k(Object obj, com.google.android.gms.internal.play_billing.t2 t2Var, byte[] bArr, int i9, int i10, com.google.android.gms.internal.play_billing.h1 h1Var) {
        int i11 = i9 + 1;
        int i12 = bArr[i9];
        if (i12 < 0) {
            i11 = g(i12, bArr, i11, h1Var);
            i12 = h1Var.f3582a;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = h1Var.f3583b + 1;
            h1Var.f3583b = i14;
            if (i14 < 100) {
                int i15 = i13 + i12;
                t2Var.e(obj, bArr, i13, i15, h1Var);
                h1Var.f3583b--;
                h1Var.d = obj;
                return i15;
            }
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static long l(int i9, byte[] bArr) {
        return (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48) | ((bArr[i9 + 7] & 255) << 56);
    }
}
