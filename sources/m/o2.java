package m;
public final class o2 {
    public int f14499a;
    public int f14500b;
    public int f14501c;
    public int d;
    public int e;
    public int f14502f;
    public boolean f14503g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f14501c = i10;
        this.d = i11;
        this.h = true;
        if (this.f14503g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14499a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14500b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14499a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14500b = i11;
        }
    }
}
