package m;
public final class o2 {
    public int f15825a;
    public int f15826b;
    public int f15827c;
    public int d;
    public int f15828e;
    public int f15829f;
    public boolean f15830g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f15827c = i10;
        this.d = i11;
        this.h = true;
        if (this.f15830g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f15825a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f15826b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f15825a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f15826b = i11;
        }
    }
}
