package n7;

import java.util.Arrays;
public final class x0 extends e1 {
    public final t0 f14008a;

    public x0(t0 t0Var) {
        this.f14008a = t0Var;
    }

    @Override
    public final int compareTo(Object obj) {
        e1 e1Var = (e1) obj;
        int zza = e1Var.zza();
        int c10 = e1.c((byte) 64);
        if (c10 != zza) {
            return c10 - e1Var.zza();
        }
        t0 t0Var = ((x0) e1Var).f14008a;
        t0 t0Var2 = this.f14008a;
        byte[] bArr = t0Var2.f13998b;
        int length = bArr.length;
        byte[] bArr2 = t0Var.f13998b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return q0.f13992a.compare(t0Var2.u(), t0Var.u());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0.class != obj.getClass()) {
            return false;
        }
        return this.f14008a.equals(((x0) obj).f14008a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(e1.c((byte) 64)), this.f14008a});
    }

    public final String toString() {
        k0 k0Var;
        int i10;
        boolean z10;
        l0 l0Var = n0.d;
        n0 n0Var = l0Var.f13981c;
        if (n0Var == null) {
            k0 k0Var2 = l0Var.f13979a;
            char[] cArr = k0Var2.f13969b;
            int i11 = 0;
            while (true) {
                if (i11 < cArr.length) {
                    char c10 = cArr[i11];
                    if (c10 >= 'a' && c10 <= 'z') {
                        int i12 = 0;
                        while (true) {
                            if (i12 < cArr.length) {
                                char c11 = cArr[i12];
                                if (c11 >= 'A' && c11 <= 'Z') {
                                    z10 = true;
                                    break;
                                }
                                i12++;
                            } else {
                                z10 = false;
                                break;
                            }
                        }
                        if (!z10) {
                            char[] cArr2 = new char[cArr.length];
                            for (int i13 = 0; i13 < cArr.length; i13++) {
                                char c12 = cArr[i13];
                                if (c12 >= 97 && c12 <= 122) {
                                    c12 ^= 32;
                                }
                                cArr2[i13] = (char) c12;
                            }
                            k0Var = new k0(k0Var2.f13968a.concat(".upperCase()"), cArr2);
                            byte[] bArr = k0Var.f13972g;
                            if (k0Var2.h && !k0Var.h) {
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i10 = 65; i10 <= 90; i10++) {
                                    int i14 = i10 | 32;
                                    byte b10 = bArr[i10];
                                    byte b11 = bArr[i14];
                                    if (b10 == -1) {
                                        copyOf[i10] = b11;
                                    } else {
                                        char c13 = (char) i10;
                                        char c14 = (char) i14;
                                        if (b11 == -1) {
                                            copyOf[i14] = b10;
                                        } else {
                                            throw new IllegalStateException(a.c("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c13), Character.valueOf(c14)));
                                        }
                                    }
                                }
                                k0Var = new k0(k0Var.f13968a.concat(".ignoreCase()"), k0Var.f13969b, copyOf, true);
                            }
                        } else {
                            throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                        }
                    } else {
                        i11++;
                    }
                } else {
                    k0Var = k0Var2;
                    break;
                }
            }
            if (k0Var == k0Var2) {
                n0Var = l0Var;
            } else {
                n0Var = new l0(k0Var);
            }
            l0Var.f13981c = n0Var;
        }
        byte[] u10 = this.f14008a.u();
        return a4.a.p("h'", n0Var.c(u10.length, u10), "'");
    }

    @Override
    public final int zza() {
        return e1.c((byte) 64);
    }
}
