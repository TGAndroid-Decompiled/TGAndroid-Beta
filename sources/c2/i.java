package c2;

public final class i extends r {

    public final String f2293a;

    public final h f2294b;

    public i(String str, h hVar) {
        this.f2293a = str;
        this.f2294b = hVar;
    }

    @Override
    public final void f(int i10) {
        h hVar;
        String str = this.f2293a;
        if (str == null || (hVar = this.f2294b) == null) {
            return;
        }
        hVar.q(i10, str);
    }

    @Override
    public final void i(int i10) {
        h hVar;
        String str = this.f2293a;
        if (str == null || (hVar = this.f2294b) == null) {
            return;
        }
        hVar.r(i10, str);
    }
}
