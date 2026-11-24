package defpackage;
public final class reb extends veb {
    public int d;

    @Override
    public final int a(efb efbVar, xeb xebVar, qeb qebVar, int i, boolean z) {
        return Math.max(0, this.a - qebVar.a(xebVar, i));
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
