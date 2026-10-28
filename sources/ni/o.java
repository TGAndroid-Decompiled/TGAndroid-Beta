package ni;
public final class o {
    public final String f18893a;
    public final String f18894b;
    public final int f18895c;

    public o(String str, String str2) {
        this.f18893a = str;
        this.f18894b = str2;
        this.f18895c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f18893a.equals(oVar.f18893a) || !this.f18894b.equals(oVar.f18894b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18895c;
    }
}
