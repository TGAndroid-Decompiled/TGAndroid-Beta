package m;
public final class o2 {
    public int f14267a;
    public int f14268b;
    public int f14269c;
    public int d;
    public int e;
    public int f14270f;
    public boolean f14271g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f14269c = i10;
        this.d = i11;
        this.h = true;
        if (this.f14271g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14267a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14268b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14267a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14268b = i11;
        }
    }
}
