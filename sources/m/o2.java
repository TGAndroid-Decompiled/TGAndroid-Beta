package m;
public final class o2 {
    public int f15783a;
    public int f15784b;
    public int f15785c;
    public int d;
    public int f15786e;
    public int f15787f;
    public boolean f15788g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f15785c = i10;
        this.d = i11;
        this.h = true;
        if (this.f15788g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f15783a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f15784b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f15783a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f15784b = i11;
        }
    }
}
