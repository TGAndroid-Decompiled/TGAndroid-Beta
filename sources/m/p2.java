package m;
public final class p2 {
    public int f16289a;
    public int f16290b;
    public int f16291c;
    public int d;
    public int e;
    public int f16292f;
    public boolean f16293g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f16291c = i10;
        this.d = i11;
        this.h = true;
        if (this.f16293g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f16289a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f16290b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f16289a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f16290b = i11;
        }
    }
}
