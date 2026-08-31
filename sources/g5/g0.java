package g5;
public final class g0 {
    public final int f6854a;
    public final int f6855b;
    public final int f6856c;
    public final int d;

    public g0(int i10, int i11, int i12, int i13) {
        this.f6854a = i10;
        this.f6855b = i11;
        this.f6856c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f6854a - this.f6855b <= 1) {
                return false;
            }
        } else if (this.f6856c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
