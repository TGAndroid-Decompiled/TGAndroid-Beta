package ni;
public final class q {
    public final String f20648a;
    public final String f20649b;
    public final int f20650c;

    public q(String str, String str2) {
        this.f20648a = str;
        this.f20649b = str2;
        this.f20650c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f20648a.equals(qVar.f20648a) || !this.f20649b.equals(qVar.f20649b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f20650c;
    }
}
