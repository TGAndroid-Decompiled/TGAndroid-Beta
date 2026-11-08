package m;
public final class p2 {
    public int f19198a;
    public int f19199b;
    public int f19200c;
    public int d;
    public int f19201e;
    public int f19202f;
    public boolean f19203g;
    public boolean h;

    public final void a(int i7, int i10) {
        this.f19200c = i7;
        this.d = i10;
        this.h = true;
        if (this.f19203g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f19198a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f19199b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f19198a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f19199b = i10;
        }
    }
}
