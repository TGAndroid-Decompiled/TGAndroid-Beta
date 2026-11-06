package m;
public final class p2 {
    public int f19195a;
    public int f19196b;
    public int f19197c;
    public int d;
    public int f19198e;
    public int f19199f;
    public boolean f19200g;
    public boolean h;

    public final void a(int i7, int i10) {
        this.f19197c = i7;
        this.d = i10;
        this.h = true;
        if (this.f19200g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f19195a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f19196b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f19195a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f19196b = i10;
        }
    }
}
