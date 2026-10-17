package m;
public final class p2 {
    public int f16284a;
    public int f16285b;
    public int f16286c;
    public int d;
    public int e;
    public int f16287f;
    public boolean f16288g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f16286c = i10;
        this.d = i11;
        this.h = true;
        if (this.f16288g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f16284a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f16285b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f16284a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f16285b = i11;
        }
    }
}
