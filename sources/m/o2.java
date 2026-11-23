package m;
public final class o2 {
    public int f20149a;
    public int f20150b;
    public int f20151c;
    public int d;
    public int f20152e;
    public int f20153f;
    public boolean f20154g;
    public boolean h;

    public final void a(int i7, int i10) {
        this.f20151c = i7;
        this.d = i10;
        this.h = true;
        if (this.f20154g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f20149a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f20150b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f20149a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f20150b = i10;
        }
    }
}
