package m;
public final class p2 {
    public int f13597a;
    public int f13598b;
    public int f13599c;
    public int d;
    public int e;
    public int f13600f;
    public boolean f13601g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f13599c = i10;
        this.d = i11;
        this.h = true;
        if (this.f13601g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f13597a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f13598b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f13597a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f13598b = i11;
        }
    }
}
