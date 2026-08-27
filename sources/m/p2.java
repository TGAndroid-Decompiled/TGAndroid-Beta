package m;

public final class p2 {

    public int f17406a;

    public int f17407b;

    public int f17408c;
    public int d;

    public int f17409e;

    public int f17410f;

    public boolean f17411g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f17408c = i10;
        this.d = i11;
        this.h = true;
        if (this.f17411g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f17406a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f17407b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f17406a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f17407b = i11;
        }
    }
}
