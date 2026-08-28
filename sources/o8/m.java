package o8;
public final class m extends h7.k {
    public final int f19058f;
    public final p h;

    public m(p pVar, int i9) {
        super(pVar);
        this.f19058f = i9;
        this.h = pVar;
    }

    @Override
    public final Object a(int i9) {
        switch (this.f19058f) {
            case 0:
                return this.h.i()[i9];
            case 1:
                return new o(this.h, i9);
            default:
                return this.h.j()[i9];
        }
    }
}
