package m;
public final class o2 {
    public int f14442a;
    public int f14443b;
    public int f14444c;
    public int d;
    public int e;
    public int f14445f;
    public boolean f14446g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f14444c = i10;
        this.d = i11;
        this.h = true;
        if (this.f14446g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14442a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14443b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14442a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14443b = i11;
        }
    }
}
