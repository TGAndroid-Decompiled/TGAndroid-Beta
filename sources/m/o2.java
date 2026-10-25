package m;
public final class o2 {
    public int f17800a;
    public int f17801b;
    public int f17802c;
    public int d;
    public int e;
    public int f17803f;
    public boolean f17804g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f17802c = i10;
        this.d = i11;
        this.h = true;
        if (this.f17804g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f17800a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f17801b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f17800a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f17801b = i11;
        }
    }
}
