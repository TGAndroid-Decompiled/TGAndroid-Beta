package m;
public final class o2 {
    public int f20152a;
    public int f20153b;
    public int f20154c;
    public int d;
    public int f20155e;
    public int f20156f;
    public boolean f20157g;
    public boolean h;

    public final void a(int i7, int i10) {
        this.f20154c = i7;
        this.d = i10;
        this.h = true;
        if (this.f20157g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f20152a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f20153b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f20152a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f20153b = i10;
        }
    }
}
