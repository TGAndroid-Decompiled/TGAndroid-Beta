package m;
public final class p2 {
    public int f16292a;
    public int f16293b;
    public int f16294c;
    public int d;
    public int e;
    public int f16295f;
    public boolean f16296g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f16294c = i10;
        this.d = i11;
        this.h = true;
        if (this.f16296g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f16292a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f16293b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f16292a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f16293b = i11;
        }
    }
}
