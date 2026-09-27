package m;
public final class o2 {
    public int f14525a;
    public int f14526b;
    public int f14527c;
    public int d;
    public int e;
    public int f14528f;
    public boolean f14529g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f14527c = i10;
        this.d = i11;
        this.h = true;
        if (this.f14529g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14525a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14526b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14525a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14526b = i11;
        }
    }
}
