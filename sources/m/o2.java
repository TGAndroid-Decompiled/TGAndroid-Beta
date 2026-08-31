package m;
public final class o2 {
    public int f13280a;
    public int f13281b;
    public int f13282c;
    public int d;
    public int f13283e;
    public int f13284f;
    public boolean f13285g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f13282c = i10;
        this.d = i11;
        this.h = true;
        if (this.f13285g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f13280a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f13281b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f13280a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f13281b = i11;
        }
    }
}
