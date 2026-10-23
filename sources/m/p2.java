package m;
public final class p2 {
    public int f16353a;
    public int f16354b;
    public int f16355c;
    public int d;
    public int e;
    public int f16356f;
    public boolean f16357g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f16355c = i10;
        this.d = i11;
        this.h = true;
        if (this.f16357g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f16353a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f16354b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f16353a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f16354b = i11;
        }
    }
}
