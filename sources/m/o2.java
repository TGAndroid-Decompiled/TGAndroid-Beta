package m;
public final class o2 {
    public int f14498a;
    public int f14499b;
    public int f14500c;
    public int d;
    public int e;
    public int f14501f;
    public boolean f14502g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f14500c = i10;
        this.d = i11;
        this.h = true;
        if (this.f14502g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14498a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14499b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14498a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14499b = i11;
        }
    }
}
