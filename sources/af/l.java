package af;
public final class l {
    public int f592a;
    public boolean f593b;
    public boolean f594c;

    public l(int i10, boolean z10, boolean z11) {
        this.f592a = i10;
        this.f594c = z10;
        this.f593b = z11;
    }

    public l(int i10) {
        switch (i10) {
            case 4:
                this.f592a = 100;
                this.f593b = false;
                return;
            default:
                this.f592a = 0;
                this.f593b = false;
                this.f594c = false;
                return;
        }
    }
}
