package c2;
public final class i extends s {
    public final String f2853a;
    public final h f2854b;

    public i(String str, h hVar) {
        this.f2853a = str;
        this.f2854b = hVar;
    }

    @Override
    public final void f(int i10) {
        h hVar;
        String str = this.f2853a;
        if (str != null && (hVar = this.f2854b) != null) {
            hVar.q(i10, str);
        }
    }

    @Override
    public final void i(int i10) {
        h hVar;
        String str = this.f2853a;
        if (str != null && (hVar = this.f2854b) != null) {
            hVar.r(i10, str);
        }
    }
}
