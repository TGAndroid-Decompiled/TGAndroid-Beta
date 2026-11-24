package defpackage;

import java.util.Arrays;
public final class dee extends sfe {
    public final qae a;

    public dee(qae qaeVar) {
        this.a = qaeVar;
    }

    @Override
    public final int compareTo(Object obj) {
        sfe sfeVar = (sfe) obj;
        int zza = sfeVar.zza();
        int c = sfe.c((byte) 64);
        if (c != zza) {
            return c - sfeVar.zza();
        }
        qae qaeVar = ((dee) sfeVar).a;
        qae qaeVar2 = this.a;
        byte[] bArr = qaeVar2.b;
        int length = bArr.length;
        byte[] bArr2 = qaeVar.b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return r8e.a.compare(qaeVar2.p(), qaeVar.p());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dee.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((dee) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(sfe.c((byte) 64)), this.a});
    }

    public final String toString() {
        p6e p6eVar;
        int i;
        boolean z;
        v6e v6eVar = m7e.d;
        m7e m7eVar = v6eVar.c;
        if (m7eVar == null) {
            p6e p6eVar2 = v6eVar.a;
            char[] cArr = p6eVar2.b;
            int i2 = 0;
            while (true) {
                if (i2 < cArr.length) {
                    char c = cArr[i2];
                    if (c >= 'a' && c <= 'z') {
                        int i3 = 0;
                        while (true) {
                            if (i3 < cArr.length) {
                                char c2 = cArr[i3];
                                if (c2 >= 'A' && c2 <= 'Z') {
                                    z = true;
                                    break;
                                }
                                i3++;
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (!z) {
                            char[] cArr2 = new char[cArr.length];
                            for (int i4 = 0; i4 < cArr.length; i4++) {
                                char c3 = cArr[i4];
                                if (c3 >= 97 && c3 <= 122) {
                                    c3 ^= 32;
                                }
                                cArr2[i4] = (char) c3;
                            }
                            p6eVar = new p6e(p6eVar2.a.concat(".upperCase()"), cArr2);
                            byte[] bArr = p6eVar.g;
                            if (p6eVar2.h && !p6eVar.h) {
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i = 65; i <= 90; i++) {
                                    int i5 = i | 32;
                                    byte b = bArr[i];
                                    byte b2 = bArr[i5];
                                    if (b == -1) {
                                        copyOf[i] = b2;
                                    } else {
                                        char c4 = (char) i;
                                        char c5 = (char) i5;
                                        if (b2 == -1) {
                                            copyOf[i5] = b;
                                        } else {
                                            sc8.j(l0f.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                            return null;
                                        }
                                    }
                                }
                                p6eVar = new p6e(p6eVar.a.concat(".ignoreCase()"), p6eVar.b, copyOf, true);
                            }
                        } else {
                            sc8.j("Cannot call upperCase() on a mixed-case alphabet");
                            return null;
                        }
                    } else {
                        i2++;
                    }
                } else {
                    p6eVar = p6eVar2;
                    break;
                }
            }
            if (p6eVar == p6eVar2) {
                m7eVar = v6eVar;
            } else {
                m7eVar = new v6e(p6eVar);
            }
            v6eVar.c = m7eVar;
        }
        byte[] p = this.a.p();
        return tb4.y("h'", m7eVar.c(p.length, p), "'");
    }

    @Override
    public final int zza() {
        return sfe.c((byte) 64);
    }
}
