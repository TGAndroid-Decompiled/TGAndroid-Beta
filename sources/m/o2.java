package m;
public final class o2 {
    public int f14483a;
    public int f14484b;
    public int f14485c;
    public int d;
    public int e;
    public int f14486f;
    public boolean f14487g;
    public boolean h;

    public final void a(int i10, int i11) {
        this.f14485c = i10;
        this.d = i11;
        this.h = true;
        if (this.f14487g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f14483a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f14484b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f14483a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f14484b = i11;
        }
    }
}
