package n7;

import java.util.Arrays;
public final class w0 extends d1 {
    public final s0 f16692a;

    public w0(s0 s0Var) {
        this.f16692a = s0Var;
    }

    @Override
    public final int compareTo(Object obj) {
        d1 d1Var = (d1) obj;
        int zza = d1Var.zza();
        int c10 = d1.c((byte) 64);
        if (c10 != zza) {
            return c10 - d1Var.zza();
        }
        s0 s0Var = ((w0) d1Var).f16692a;
        s0 s0Var2 = this.f16692a;
        byte[] bArr = s0Var2.f16682b;
        int length = bArr.length;
        byte[] bArr2 = s0Var.f16682b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return p0.f16673a.compare(s0Var2.u(), s0Var.u());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        return this.f16692a.equals(((w0) obj).f16692a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c((byte) 64)), this.f16692a});
    }

    public final String toString() {
        j0 j0Var;
        int i10;
        boolean z10;
        k0 k0Var = m0.d;
        m0 m0Var = k0Var.f16662c;
        if (m0Var == null) {
            j0 j0Var2 = k0Var.f16660a;
            char[] cArr = j0Var2.f16647b;
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
                            j0Var = new j0(j0Var2.f16646a.concat(".upperCase()"), cArr2);
                            byte[] bArr = j0Var.f16651g;
                            if (j0Var2.h && !j0Var.h) {
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
                                j0Var = new j0(j0Var.f16646a.concat(".ignoreCase()"), j0Var.f16647b, copyOf, true);
                            }
                        } else {
                            throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                        }
                    } else {
                        i11++;
                    }
                } else {
                    j0Var = j0Var2;
                    break;
                }
            }
            if (j0Var == j0Var2) {
                m0Var = k0Var;
            } else {
                m0Var = new k0(j0Var);
            }
            k0Var.f16662c = m0Var;
        }
        byte[] u10 = this.f16692a.u();
        return a4.a.p("h'", m0Var.c(u10.length, u10), "'");
    }

    @Override
    public final int zza() {
        return d1.c((byte) 64);
    }
}
