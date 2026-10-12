package ki;
public final class o {
    public final String f14900a;
    public final String f14901b;
    public final int f14902c;

    public o(String str, String str2) {
        this.f14900a = str;
        this.f14901b = str2;
        this.f14902c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f14900a.equals(oVar.f14900a) || !this.f14901b.equals(oVar.f14901b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14902c;
    }
}
