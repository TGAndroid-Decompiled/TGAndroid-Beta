package defpackage;
public final class wp3 implements sp3 {
    public long a;
    public long b;
    public final String c;
    public final xp3 d;

    public wp3(xp3 xp3Var, String str) {
        this.d = xp3Var;
        this.c = str;
    }

    @Override
    public final int getObserverTag() {
        return 0;
    }

    @Override
    public final void i(long j, long j2) {
        this.b = j;
        this.a = j2;
        this.d.b();
    }

    @Override
    public final void B(boolean z) {
    }

    @Override
    public final void N(String str) {
    }

    @Override
    public final void l(long j, long j2) {
    }
}
