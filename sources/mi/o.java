package mi;
public final class o {
    public final String f16962a;
    public final String f16963b;
    public final int f16964c;

    public o(String str, String str2) {
        this.f16962a = str;
        this.f16963b = str2;
        this.f16964c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f16962a.equals(oVar.f16962a) || !this.f16963b.equals(oVar.f16963b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16964c;
    }
}
