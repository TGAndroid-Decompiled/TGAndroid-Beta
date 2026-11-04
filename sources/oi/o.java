package oi;
public final class o {
    public final String f21157a;
    public final String f21158b;
    public final int f21159c;

    public o(String str, String str2) {
        this.f21157a = str;
        this.f21158b = str2;
        this.f21159c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f21157a.equals(oVar.f21157a) || !this.f21158b.equals(oVar.f21158b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f21159c;
    }
}
