package m;
public final class p2 {
    public int f13581a;
    public int f13582b;
    public int f13583c;
    public int d;
    public int e;
    public int f13584f;
    public boolean f13585g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f13583c = i10;
        this.d = i11;
        this.h = true;
        if (this.f13585g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f13581a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f13582b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f13581a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f13582b = i11;
        }
    }
}
