package m;
public final class o2 {
    public int f15605a;
    public int f15606b;
    public int f15607c;
    public int d;
    public int f15608e;
    public int f15609f;
    public boolean f15610g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f15607c = i10;
        this.d = i11;
        this.h = true;
        if (this.f15610g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f15605a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f15606b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f15605a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f15606b = i11;
        }
    }
}
