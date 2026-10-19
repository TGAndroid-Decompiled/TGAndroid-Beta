package mi;
public final class o {
    public final String f16968a;
    public final String f16969b;
    public final int f16970c;

    public o(String str, String str2) {
        this.f16968a = str;
        this.f16969b = str2;
        this.f16970c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f16968a.equals(oVar.f16968a) || !this.f16969b.equals(oVar.f16969b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16970c;
    }
}
