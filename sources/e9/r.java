package e9;
public final class r extends t {
    public final int f9024f;
    public final v h;

    public r(v vVar, int i10) {
        super(vVar);
        this.f9024f = i10;
        this.h = vVar;
    }

    @Override
    public final Object a(int i10) {
        switch (this.f9024f) {
            case 0:
                return this.h.i()[i10];
            case 1:
                return new u(this.h, i10);
            default:
                return this.h.j()[i10];
        }
    }
}
