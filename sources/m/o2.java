package m;
public final class o2 {
    public int f15632a;
    public int f15633b;
    public int f15634c;
    public int d;
    public int f15635e;
    public int f15636f;
    public boolean f15637g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f15634c = i10;
        this.d = i11;
        this.h = true;
        if (this.f15637g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f15632a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f15633b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f15632a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f15633b = i11;
        }
    }
}
