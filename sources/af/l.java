package af;
public final class l {
    public int f588a;
    public boolean f589b;
    public boolean f590c;

    public l(int i10, boolean z10, boolean z11) {
        this.f588a = i10;
        this.f590c = z10;
        this.f589b = z11;
    }

    public l(int i10) {
        switch (i10) {
            case 4:
                this.f588a = 100;
                this.f589b = false;
                return;
            default:
                this.f588a = 0;
                this.f589b = false;
                this.f590c = false;
                return;
        }
    }
}
