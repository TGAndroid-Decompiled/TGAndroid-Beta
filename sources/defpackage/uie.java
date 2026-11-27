package defpackage;

import java.util.Arrays;
public final class uie extends jke {
    public final gfe a;

    public uie(gfe gfeVar) {
        this.a = gfeVar;
    }

    @Override
    public final int compareTo(Object obj) {
        jke jkeVar = (jke) obj;
        int zza = jkeVar.zza();
        int c = jke.c((byte) 64);
        if (c != zza) {
            return c - jkeVar.zza();
        }
        gfe gfeVar = ((uie) jkeVar).a;
        gfe gfeVar2 = this.a;
        byte[] bArr = gfeVar2.b;
        int length = bArr.length;
        byte[] bArr2 = gfeVar.b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return hde.a.compare(gfeVar2.p(), gfeVar.p());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uie.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((uie) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(jke.c((byte) 64)), this.a});
    }

    public final String toString() {
        fbe fbeVar;
        int i;
        boolean z;
        lbe lbeVar = cce.d;
        cce cceVar = lbeVar.c;
        if (cceVar == null) {
            fbe fbeVar2 = lbeVar.a;
            char[] cArr = fbeVar2.b;
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
                            fbeVar = new fbe(fbeVar2.a.concat(".upperCase()"), cArr2);
                            byte[] bArr = fbeVar.g;
                            if (fbeVar2.h && !fbeVar.h) {
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
                                            grb.i(d5f.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                            return null;
                                        }
                                    }
                                }
                                fbeVar = new fbe(fbeVar.a.concat(".ignoreCase()"), fbeVar.b, copyOf, true);
                            }
                        } else {
                            grb.i("Cannot call upperCase() on a mixed-case alphabet");
                            return null;
                        }
                    } else {
                        i2++;
                    }
                } else {
                    fbeVar = fbeVar2;
                    break;
                }
            }
            if (fbeVar == fbeVar2) {
                cceVar = lbeVar;
            } else {
                cceVar = new lbe(fbeVar);
            }
            lbeVar.c = cceVar;
        }
        byte[] p = this.a.p();
        return qd4.y("h'", cceVar.c(p.length, p), "'");
    }

    @Override
    public final int zza() {
        return jke.c((byte) 64);
    }
}
