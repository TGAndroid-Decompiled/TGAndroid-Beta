package m;
public final class o2 {
    public int f14514a;
    public int f14515b;
    public int f14516c;
    public int d;
    public int e;
    public int f14517f;
    public boolean f14518g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f14516c = i10;
        this.d = i11;
        this.h = true;
        if (this.f14518g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14514a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14515b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14514a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14515b = i11;
        }
    }
}
