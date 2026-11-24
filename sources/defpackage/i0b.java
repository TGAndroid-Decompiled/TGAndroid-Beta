package defpackage;

import j$.util.Objects;
public final class i0b {
    public final String a;
    public final String b;
    public final j0b c;

    public i0b(String str, String str2, j0b j0bVar) {
        this.a = str;
        this.b = str2;
        this.c = j0bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i0b) {
                i0b i0bVar = (i0b) obj;
                if (this.a.equals(i0bVar.a) && this.b.equals(i0bVar.b) && this.c.equals(i0bVar.c)) {
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
