package mi;
public final class o {
    public final String f16970a;
    public final String f16971b;
    public final int f16972c;

    public o(String str, String str2) {
        this.f16970a = str;
        this.f16971b = str2;
        this.f16972c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f16970a.equals(oVar.f16970a) || !this.f16971b.equals(oVar.f16971b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16972c;
    }
}
