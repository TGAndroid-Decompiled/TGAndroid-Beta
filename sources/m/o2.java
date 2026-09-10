package m;
public final class o2 {
    public int f13093a;
    public int f13094b;
    public int f13095c;
    public int d;
    public int e;
    public int f13096f;
    public boolean f13097g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f13095c = i10;
        this.d = i11;
        this.h = true;
        if (this.f13097g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f13093a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f13094b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f13093a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f13094b = i11;
        }
    }
}
