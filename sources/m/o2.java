package m;
public final class o2 {
    public int f20246a;
    public int f20247b;
    public int f20248c;
    public int d;
    public int f20249e;
    public int f20250f;
    public boolean f20251g;
    public boolean h;

    public final void a(int i7, int i10) {
        this.f20248c = i7;
        this.d = i10;
        this.h = true;
        if (this.f20251g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f20246a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f20247b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f20246a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f20247b = i10;
        }
    }
}
