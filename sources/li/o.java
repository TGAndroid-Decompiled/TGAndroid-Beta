package li;
public final class o {
    public final String f15667a;
    public final String f15668b;
    public final int f15669c;

    public o(String str, String str2) {
        this.f15667a = str;
        this.f15668b = str2;
        this.f15669c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f15667a.equals(oVar.f15667a) || !this.f15668b.equals(oVar.f15668b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15669c;
    }
}
