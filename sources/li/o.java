package li;
public final class o {
    public final String f14768a;
    public final String f14769b;
    public final int f14770c;

    public o(String str, String str2) {
        this.f14768a = str;
        this.f14769b = str2;
        this.f14770c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f14768a.equals(oVar.f14768a) || !this.f14769b.equals(oVar.f14769b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14770c;
    }
}
