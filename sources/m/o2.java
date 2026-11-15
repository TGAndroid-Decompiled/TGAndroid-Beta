package m;
public final class o2 {
    public int f19788a;
    public int f19789b;
    public int f19790c;
    public int d;
    public int f19791e;
    public int f19792f;
    public boolean f19793g;
    public boolean h;

    public final void a(int i7, int i10) {
        this.f19790c = i7;
        this.d = i10;
        this.h = true;
        if (this.f19793g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f19788a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f19789b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f19788a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f19789b = i10;
        }
    }
}
