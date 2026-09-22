package m;
public final class o2 {
    public int f14255a;
    public int f14256b;
    public int f14257c;
    public int d;
    public int e;
    public int f14258f;
    public boolean f14259g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f14257c = i10;
        this.d = i11;
        this.h = true;
        if (this.f14259g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14255a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14256b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14255a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14256b = i11;
        }
    }
}
