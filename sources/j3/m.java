package j3;
public final class m implements g {
    public final int f8670a;
    public final int f8671b;
    public final int f8672c;
    public final String d = null;

    static {
        new e8.a(0).a();
        int i10 = h5.d0.f6937a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public m(e8.a aVar) {
        this.f8670a = aVar.f5156a;
        this.f8671b = aVar.f5157b;
        this.f8672c = aVar.f5158c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f8670a == mVar.f8670a && this.f8671b == mVar.f8671b && this.f8672c == mVar.f8672c && h5.d0.a(this.d, mVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = (((((527 + this.f8670a) * 31) + this.f8671b) * 31) + this.f8672c) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i10 + hashCode;
    }
}
