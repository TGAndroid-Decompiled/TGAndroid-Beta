package defpackage;

import j$.util.Objects;
public final class sac extends wl5 {
    public final String b;
    public final String c;

    public sac(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sac.class == obj.getClass()) {
                sac sacVar = (sac) obj;
                if (this.a.equals(sacVar.a) && Objects.equals(this.b, sacVar.b) && this.c.equals(sacVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int j = bs2.j(527, 31, this.a);
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + ((j + i) * 31);
    }

    @Override
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
