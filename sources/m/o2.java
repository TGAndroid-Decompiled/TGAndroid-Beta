package m;
public final class o2 {
    public int f15762a;
    public int f15763b;
    public int f15764c;
    public int d;
    public int f15765e;
    public int f15766f;
    public boolean f15767g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f15764c = i10;
        this.d = i11;
        this.h = true;
        if (this.f15767g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f15762a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f15763b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f15762a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f15763b = i11;
        }
    }
}
