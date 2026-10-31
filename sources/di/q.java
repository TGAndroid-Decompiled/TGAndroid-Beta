package di;
public final class q {
    public final String f5981a;
    public final String f5982b;
    public final int f5983c;

    public q(String str, String str2) {
        this.f5981a = str;
        this.f5982b = str2;
        this.f5983c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f5981a.equals(qVar.f5981a) || !this.f5982b.equals(qVar.f5982b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5983c;
    }
}
