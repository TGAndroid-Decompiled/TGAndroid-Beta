package j3;
public final class m implements g {
    public final int f9250a;
    public final int f9251b;
    public final int f9252c;
    public final String d = null;

    static {
        new e8.a(0).a();
        int i10 = h5.d0.f7237a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public m(e8.a aVar) {
        this.f9250a = aVar.f4995a;
        this.f9251b = aVar.f4996b;
        this.f9252c = aVar.f4997c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f9250a == mVar.f9250a && this.f9251b == mVar.f9251b && this.f9252c == mVar.f9252c && h5.d0.a(this.d, mVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = (((((527 + this.f9250a) * 31) + this.f9251b) * 31) + this.f9252c) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i10 + hashCode;
    }
}
