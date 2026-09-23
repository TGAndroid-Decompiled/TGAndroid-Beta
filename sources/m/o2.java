package m;
public final class o2 {
    public int f14245a;
    public int f14246b;
    public int f14247c;
    public int d;
    public int e;
    public int f14248f;
    public boolean f14249g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f14247c = i10;
        this.d = i11;
        this.h = true;
        if (this.f14249g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14245a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14246b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14245a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14246b = i11;
        }
    }
}
