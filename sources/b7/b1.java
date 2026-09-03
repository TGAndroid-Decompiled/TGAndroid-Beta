package b7;

import java.util.Arrays;
public final class b1 extends h1 {
    public final w0 f1682a;

    public b1(w0 w0Var) {
        this.f1682a = w0Var;
    }

    @Override
    public final int compareTo(Object obj) {
        h1 h1Var = (h1) obj;
        int zza = h1Var.zza();
        int c3 = h1.c((byte) 64);
        if (c3 != zza) {
            return c3 - h1Var.zza();
        }
        w0 w0Var = ((b1) h1Var).f1682a;
        w0 w0Var2 = this.f1682a;
        byte[] bArr = w0Var2.f1749b;
        int length = bArr.length;
        byte[] bArr2 = w0Var.f1749b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return t0.f1741a.compare(w0Var2.u(), w0Var.u());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        return this.f1682a.equals(((b1) obj).f1682a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(h1.c((byte) 64)), this.f1682a});
    }

    public final String toString() {
        n0 n0Var;
        int i10;
        boolean z4;
        o0 o0Var = q0.d;
        q0 q0Var = o0Var.f1733c;
        if (q0Var == null) {
            n0 n0Var2 = o0Var.f1731a;
            char[] cArr = n0Var2.f1719b;
            int i11 = 0;
            while (true) {
                if (i11 < cArr.length) {
                    char c3 = cArr[i11];
                    if (c3 >= 'a' && c3 <= 'z') {
                        int i12 = 0;
                        while (true) {
                            if (i12 < cArr.length) {
                                char c10 = cArr[i12];
                                if (c10 >= 'A' && c10 <= 'Z') {
                                    z4 = true;
                                    break;
                                }
                                i12++;
                            } else {
                                z4 = false;
                                break;
                            }
                        }
                        if (!z4) {
                            char[] cArr2 = new char[cArr.length];
                            for (int i13 = 0; i13 < cArr.length; i13++) {
                                char c11 = cArr[i13];
                                if (c11 >= 97 && c11 <= 122) {
                                    c11 ^= 32;
                                }
                                cArr2[i13] = (char) c11;
                            }
                            n0Var = new n0(n0Var2.f1718a.concat(".upperCase()"), cArr2);
                            byte[] bArr = n0Var.f1722g;
                            if (n0Var2.h && !n0Var.h) {
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i10 = 65; i10 <= 90; i10++) {
                                    int i14 = i10 | 32;
                                    byte b10 = bArr[i10];
                                    byte b11 = bArr[i14];
                                    if (b10 == -1) {
                                        copyOf[i10] = b11;
                                    } else {
                                        char c12 = (char) i10;
                                        char c13 = (char) i14;
                                        if (b11 == -1) {
                                            copyOf[i14] = b10;
                                        } else {
                                            throw new IllegalStateException(b.d("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c12), Character.valueOf(c13)));
                                        }
                                    }
                                }
                                n0Var = new n0(n0Var.f1718a.concat(".ignoreCase()"), n0Var.f1719b, copyOf, true);
                            }
                        } else {
                            throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                        }
                    } else {
                        i11++;
                    }
                } else {
                    n0Var = n0Var2;
                    break;
                }
            }
            if (n0Var == n0Var2) {
                q0Var = o0Var;
            } else {
                q0Var = new o0(n0Var);
            }
            o0Var.f1733c = q0Var;
        }
        byte[] u10 = this.f1682a.u();
        return android.support.v4.media.a.o("h'", q0Var.c(u10.length, u10), "'");
    }

    @Override
    public final int zza() {
        return h1.c((byte) 64);
    }
}
