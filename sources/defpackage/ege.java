package defpackage;

import java.util.Arrays;
public final class ege extends the {
    public final rce a;

    public ege(rce rceVar) {
        this.a = rceVar;
    }

    @Override
    public final int compareTo(Object obj) {
        the theVar = (the) obj;
        int zza = theVar.zza();
        int c = the.c((byte) 64);
        if (c != zza) {
            return c - theVar.zza();
        }
        rce rceVar = ((ege) theVar).a;
        rce rceVar2 = this.a;
        byte[] bArr = rceVar2.b;
        int length = bArr.length;
        byte[] bArr2 = rceVar.b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return sae.a.compare(rceVar2.p(), rceVar.p());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ege.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ege) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(the.c((byte) 64)), this.a});
    }

    public final String toString() {
        q8e q8eVar;
        int i;
        boolean z;
        w8e w8eVar = n9e.d;
        n9e n9eVar = w8eVar.c;
        if (n9eVar == null) {
            q8e q8eVar2 = w8eVar.a;
            char[] cArr = q8eVar2.b;
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
                            q8eVar = new q8e(q8eVar2.a.concat(".upperCase()"), cArr2);
                            byte[] bArr = q8eVar.g;
                            if (q8eVar2.h && !q8eVar.h) {
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
                                            dq9.m(n2f.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                            return null;
                                        }
                                    }
                                }
                                q8eVar = new q8e(q8eVar.a.concat(".ignoreCase()"), q8eVar.b, copyOf, true);
                            }
                        } else {
                            dq9.m("Cannot call upperCase() on a mixed-case alphabet");
                            return null;
                        }
                    } else {
                        i2++;
                    }
                } else {
                    q8eVar = q8eVar2;
                    break;
                }
            }
            if (q8eVar == q8eVar2) {
                n9eVar = w8eVar;
            } else {
                n9eVar = new w8e(q8eVar);
            }
            w8eVar.c = n9eVar;
        }
        byte[] p = this.a.p();
        return kt6.o("h'", n9eVar.c(p.length, p), "'");
    }

    @Override
    public final int zza() {
        return the.c((byte) 64);
    }
}
