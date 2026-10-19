package m;
public final class p2 {
    public int f16290a;
    public int f16291b;
    public int f16292c;
    public int d;
    public int e;
    public int f16293f;
    public boolean f16294g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f16292c = i10;
        this.d = i11;
        this.h = true;
        if (this.f16294g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f16290a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f16291b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f16290a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f16291b = i11;
        }
    }
}
