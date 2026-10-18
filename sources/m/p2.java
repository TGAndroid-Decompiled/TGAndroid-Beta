package m;
public final class p2 {
    public int f16291a;
    public int f16292b;
    public int f16293c;
    public int d;
    public int e;
    public int f16294f;
    public boolean f16295g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f16293c = i10;
        this.d = i11;
        this.h = true;
        if (this.f16295g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f16291a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f16292b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f16291a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f16292b = i11;
        }
    }
}
