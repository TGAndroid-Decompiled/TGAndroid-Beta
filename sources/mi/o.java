package mi;
public final class o {
    public final String f16967a;
    public final String f16968b;
    public final int f16969c;

    public o(String str, String str2) {
        this.f16967a = str;
        this.f16968b = str2;
        this.f16969c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f16967a.equals(oVar.f16967a) || !this.f16968b.equals(oVar.f16968b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16969c;
    }
}
