package m;
public final class o2 {
    public int f20180a;
    public int f20181b;
    public int f20182c;
    public int d;
    public int f20183e;
    public int f20184f;
    public boolean f20185g;
    public boolean h;

    public final void a(int i7, int i10) {
        this.f20182c = i7;
        this.d = i10;
        this.h = true;
        if (this.f20185g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f20180a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f20181b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f20180a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f20181b = i10;
        }
    }
}
