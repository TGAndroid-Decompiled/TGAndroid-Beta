package m;
public final class p2 {
    public int f16641a;
    public int f16642b;
    public int f16643c;
    public int d;
    public int f16644e;
    public int f16645f;
    public boolean f16646g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f16643c = i10;
        this.d = i11;
        this.h = true;
        if (this.f16646g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f16641a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f16642b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f16641a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f16642b = i11;
        }
    }
}
