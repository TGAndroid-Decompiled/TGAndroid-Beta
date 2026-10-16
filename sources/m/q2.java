package m;
public final class q2 {
    public int f14939a;
    public int f14940b;
    public int f14941c;
    public int d;
    public int e;
    public int f14942f;
    public boolean f14943g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f14941c = i10;
        this.d = i11;
        this.h = true;
        if (this.f14943g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14939a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14940b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14939a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14940b = i11;
        }
    }
}
