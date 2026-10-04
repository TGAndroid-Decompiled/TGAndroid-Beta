package m;
public final class o2 {
    public int f15821a;
    public int f15822b;
    public int f15823c;
    public int d;
    public int f15824e;
    public int f15825f;
    public boolean f15826g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f15823c = i10;
        this.d = i11;
        this.h = true;
        if (this.f15826g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f15821a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f15822b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f15821a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f15822b = i11;
        }
    }
}
