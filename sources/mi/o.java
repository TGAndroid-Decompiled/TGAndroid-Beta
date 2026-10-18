package mi;
public final class o {
    public final String f16969a;
    public final String f16970b;
    public final int f16971c;

    public o(String str, String str2) {
        this.f16969a = str;
        this.f16970b = str2;
        this.f16971c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f16969a.equals(oVar.f16969a) || !this.f16970b.equals(oVar.f16970b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16971c;
    }
}
