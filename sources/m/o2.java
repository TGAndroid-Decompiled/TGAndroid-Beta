package m;
public final class o2 {
    public int f15830a;
    public int f15831b;
    public int f15832c;
    public int d;
    public int f15833e;
    public int f15834f;
    public boolean f15835g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f15832c = i10;
        this.d = i11;
        this.h = true;
        if (this.f15835g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f15830a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f15831b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f15830a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f15831b = i11;
        }
    }
}
