package m;
public final class o2 {
    public int f12493a;
    public int f12494b;
    public int f12495c;
    public int d;
    public int e;
    public int f12496f;
    public boolean f12497g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f12495c = i10;
        this.d = i11;
        this.h = true;
        if (this.f12497g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f12493a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f12494b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f12493a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f12494b = i11;
        }
    }
}
