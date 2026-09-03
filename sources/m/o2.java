package m;
public final class o2 {
    public int f13282a;
    public int f13283b;
    public int f13284c;
    public int d;
    public int f13285e;
    public int f13286f;
    public boolean f13287g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f13284c = i10;
        this.d = i11;
        this.h = true;
        if (this.f13287g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f13282a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f13283b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f13282a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f13283b = i11;
        }
    }
}
