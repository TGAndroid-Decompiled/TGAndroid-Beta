package m;
public final class o2 {
    public int f15820a;
    public int f15821b;
    public int f15822c;
    public int d;
    public int f15823e;
    public int f15824f;
    public boolean f15825g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f15822c = i10;
        this.d = i11;
        this.h = true;
        if (this.f15825g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f15820a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f15821b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f15820a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f15821b = i11;
        }
    }
}
