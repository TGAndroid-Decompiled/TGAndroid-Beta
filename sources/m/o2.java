package m;
public final class o2 {
    public int f20183a;
    public int f20184b;
    public int f20185c;
    public int d;
    public int f20186e;
    public int f20187f;
    public boolean f20188g;
    public boolean h;

    public final void a(int i7, int i10) {
        this.f20185c = i7;
        this.d = i10;
        this.h = true;
        if (this.f20188g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f20183a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f20184b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f20183a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f20184b = i10;
        }
    }
}
