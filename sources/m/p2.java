package m;
public final class p2 {
    public int f19203a;
    public int f19204b;
    public int f19205c;
    public int d;
    public int f19206e;
    public int f19207f;
    public boolean f19208g;
    public boolean h;

    public final void a(int i7, int i10) {
        this.f19205c = i7;
        this.d = i10;
        this.h = true;
        if (this.f19208g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f19203a = i10;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f19204b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f19203a = i7;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f19204b = i10;
        }
    }
}
