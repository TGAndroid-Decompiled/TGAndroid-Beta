package defpackage;
public final class mib extends qib {
    public int d;

    @Override
    public final int a(zib zibVar, sib sibVar, lib libVar, int i, boolean z) {
        return Math.max(0, this.a - libVar.a(sibVar, i));
    }

    @Override
    public final void b(int i, int i2) {
        super.b(i, i2);
        this.d = Math.max(this.d, i + i2);
    }

    @Override
    public final void c() {
        super.c();
        this.d = Integer.MIN_VALUE;
    }

    @Override
    public final int d(boolean z) {
        return Math.max(super.d(z), this.d);
    }
}
