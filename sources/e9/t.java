package e9;
public final class t extends v {
    public final int f8500f;
    public final x h;

    public t(x xVar, int i10) {
        super(xVar);
        this.f8500f = i10;
        this.h = xVar;
    }

    @Override
    public final Object a(int i10) {
        switch (this.f8500f) {
            case 0:
                return this.h.j()[i10];
            case 1:
                return new w(this.h, i10);
            default:
                return this.h.k()[i10];
        }
    }
}
