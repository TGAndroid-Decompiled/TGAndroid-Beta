package m;
public final class p2 {
    public int f15528a;
    public int f15529b;
    public int f15530c;
    public int d;
    public int f15531e;
    public int f15532f;
    public boolean f15533g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f15530c = i10;
        this.d = i11;
        this.h = true;
        if (this.f15533g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f15528a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f15529b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f15528a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f15529b = i11;
        }
    }
}
