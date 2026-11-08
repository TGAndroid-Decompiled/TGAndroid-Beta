package ni;
public final class q {
    public final String f20643a;
    public final String f20644b;
    public final int f20645c;

    public q(String str, String str2) {
        this.f20643a = str;
        this.f20644b = str2;
        this.f20645c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f20643a.equals(qVar.f20643a) || !this.f20644b.equals(qVar.f20644b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f20645c;
    }
}
