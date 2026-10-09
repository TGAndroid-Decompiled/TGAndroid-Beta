package m;
public final class o2 {
    public int f15758a;
    public int f15759b;
    public int f15760c;
    public int d;
    public int f15761e;
    public int f15762f;
    public boolean f15763g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f15760c = i10;
        this.d = i11;
        this.h = true;
        if (this.f15763g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f15758a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f15759b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f15758a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f15759b = i11;
        }
    }
}
