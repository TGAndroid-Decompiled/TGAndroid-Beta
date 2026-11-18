package m;
public final class o2 {
    public int f20155a;
    public int f20156b;
    public int f20157c;
    public int d;
    public int f20158e;
    public int f20159f;
    public boolean f20160g;
    public boolean h;

    public final void a(int i7, int i10) {
        this.f20157c = i7;
        this.d = i10;
        this.h = true;
        if (this.f20160g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f20155a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f20156b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f20155a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f20156b = i10;
        }
    }
}
