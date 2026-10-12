package m;
public final class o2 {
    public int f15186a;
    public int f15187b;
    public int f15188c;
    public int d;
    public int e;
    public int f15189f;
    public boolean f15190g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f15188c = i10;
        this.d = i11;
        this.h = true;
        if (this.f15190g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f15186a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f15187b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f15186a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f15187b = i11;
        }
    }
}
