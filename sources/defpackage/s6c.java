package defpackage;

import j$.util.Objects;
public final class s6c extends uj5 {
    public final String b;
    public final String c;

    public s6c(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s6c.class == obj.getClass()) {
                s6c s6cVar = (s6c) obj;
                if (this.a.equals(s6cVar.a) && Objects.equals(this.b, s6cVar.b) && this.c.equals(s6cVar.c)) {
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
        int j = ir2.j(527, 31, this.a);
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
