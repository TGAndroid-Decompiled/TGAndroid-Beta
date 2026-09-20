package m;
public final class o2 {
    public int f14478a;
    public int f14479b;
    public int f14480c;
    public int d;
    public int e;
    public int f14481f;
    public boolean f14482g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f14480c = i10;
        this.d = i11;
        this.h = true;
        if (this.f14482g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14478a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14479b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14478a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14479b = i11;
        }
    }
}
