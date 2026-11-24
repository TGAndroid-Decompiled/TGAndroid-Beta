package defpackage;
public final class gr3 implements cr3 {
    public long a;
    public long b;
    public final String c;
    public final hr3 d;

    public gr3(hr3 hr3Var, String str) {
        this.d = hr3Var;
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
    public final void A(boolean z) {
    }

    @Override
    public final void N(String str) {
    }

    @Override
    public final void l(long j, long j2) {
    }
}
