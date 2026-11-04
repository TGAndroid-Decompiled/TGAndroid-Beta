package m;
public final class o2 {
    public int f18676a;
    public int f18677b;
    public int f18678c;
    public int d;
    public int f18679e;
    public int f18680f;
    public boolean f18681g;
    public boolean h;

    public final void a(int i3, int i10) {
        this.f18678c = i3;
        this.d = i10;
        this.h = true;
        if (this.f18681g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f18676a = i10;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f18677b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f18676a = i3;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f18677b = i10;
        }
    }
}
