package ki;
public final class o {
    public final String f14901a;
    public final String f14902b;
    public final int f14903c;

    public o(String str, String str2) {
        this.f14901a = str;
        this.f14902b = str2;
        this.f14903c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f14901a.equals(oVar.f14901a) || !this.f14902b.equals(oVar.f14902b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14903c;
    }
}
