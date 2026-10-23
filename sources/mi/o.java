package mi;
public final class o {
    public final String f17031a;
    public final String f17032b;
    public final int f17033c;

    public o(String str, String str2) {
        this.f17031a = str;
        this.f17032b = str2;
        this.f17033c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f17031a.equals(oVar.f17031a) || !this.f17032b.equals(oVar.f17032b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17033c;
    }
}
