package defpackage;

import j$.util.Objects;
public final class t8c extends tl5 {
    public final String b;
    public final String c;

    public t8c(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t8c.class == obj.getClass()) {
                t8c t8cVar = (t8c) obj;
                if (this.a.equals(t8cVar.a) && Objects.equals(this.b, t8cVar.b) && this.c.equals(t8cVar.c)) {
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
        int j = ts2.j(527, 31, this.a);
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
