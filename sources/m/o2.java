package m;
public final class o2 {
    public int f12492a;
    public int f12493b;
    public int f12494c;
    public int d;
    public int e;
    public int f12495f;
    public boolean f12496g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f12494c = i10;
        this.d = i11;
        this.h = true;
        if (this.f12496g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f12492a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f12493b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f12492a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f12493b = i11;
        }
    }
}
