package g5;
public final class g0 {
    public final int f6374a;
    public final int f6375b;
    public final int f6376c;
    public final int d;

    public g0(int i10, int i11, int i12, int i13) {
        this.f6374a = i10;
        this.f6375b = i11;
        this.f6376c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f6374a - this.f6375b <= 1) {
                return false;
            }
        } else if (this.f6376c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
