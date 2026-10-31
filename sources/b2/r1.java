package b2;
public final class r1 {
    public int f2221a;
    public boolean f2222b;
    public boolean f2223c;

    public r1(int i10, boolean z10, boolean z11) {
        this.f2221a = i10;
        this.f2223c = z10;
        this.f2222b = z11;
    }

    public r1(int i10) {
        switch (i10) {
            case 2:
                this.f2221a = 100;
                this.f2222b = false;
                return;
            default:
                this.f2221a = 0;
                this.f2222b = false;
                this.f2223c = false;
                return;
        }
    }
}
