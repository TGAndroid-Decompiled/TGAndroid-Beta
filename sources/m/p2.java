package m;
public final class p2 {
    public int f15529a;
    public int f15530b;
    public int f15531c;
    public int d;
    public int f15532e;
    public int f15533f;
    public boolean f15534g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f15531c = i10;
        this.d = i11;
        this.h = true;
        if (this.f15534g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f15529a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f15530b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f15529a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f15530b = i11;
        }
    }
}
