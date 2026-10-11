package m;
public final class o2 {
    public int f15819a;
    public int f15820b;
    public int f15821c;
    public int d;
    public int f15822e;
    public int f15823f;
    public boolean f15824g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f15821c = i10;
        this.d = i11;
        this.h = true;
        if (this.f15824g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f15819a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f15820b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f15819a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f15820b = i11;
        }
    }
}
