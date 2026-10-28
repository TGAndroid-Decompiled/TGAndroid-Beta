package m;
public final class o2 {
    public int f17799a;
    public int f17800b;
    public int f17801c;
    public int d;
    public int e;
    public int f17802f;
    public boolean f17803g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f17801c = i10;
        this.d = i11;
        this.h = true;
        if (this.f17803g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f17799a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f17800b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f17799a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f17800b = i11;
        }
    }
}
