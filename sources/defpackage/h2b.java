package defpackage;

import j$.util.Objects;
public final class h2b {
    public final String a;
    public final String b;
    public final i2b c;

    public h2b(String str, String str2, i2b i2bVar) {
        this.a = str;
        this.b = str2;
        this.c = i2bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h2b) {
                h2b h2bVar = (h2b) obj;
                if (this.a.equals(h2bVar.a) && this.b.equals(h2bVar.b) && this.c.equals(h2bVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
