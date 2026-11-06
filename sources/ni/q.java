package ni;
public final class q {
    public final String f20640a;
    public final String f20641b;
    public final int f20642c;

    public q(String str, String str2) {
        this.f20640a = str;
        this.f20641b = str2;
        this.f20642c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f20640a.equals(qVar.f20640a) || !this.f20641b.equals(qVar.f20641b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f20642c;
    }
}
