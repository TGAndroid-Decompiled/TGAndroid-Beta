package m;
public final class o2 {
    public int f14493a;
    public int f14494b;
    public int f14495c;
    public int d;
    public int e;
    public int f14496f;
    public boolean f14497g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f14495c = i10;
        this.d = i11;
        this.h = true;
        if (this.f14497g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14493a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14494b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14493a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14494b = i11;
        }
    }
}
