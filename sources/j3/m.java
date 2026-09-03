package j3;
public final class m implements g {
    public final int f8652a;
    public final int f8653b;
    public final int f8654c;
    public final String d = null;

    static {
        new e8.a(0).a();
        int i10 = h5.d0.f6924a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public m(e8.a aVar) {
        this.f8652a = aVar.f5162a;
        this.f8653b = aVar.f5163b;
        this.f8654c = aVar.f5164c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f8652a == mVar.f8652a && this.f8653b == mVar.f8653b && this.f8654c == mVar.f8654c && h5.d0.a(this.d, mVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = (((((527 + this.f8652a) * 31) + this.f8653b) * 31) + this.f8654c) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i10 + hashCode;
    }
}
