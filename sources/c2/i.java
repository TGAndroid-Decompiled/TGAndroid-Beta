package c2;
public final class i extends r {
    public final String f2179a;
    public final h f2180b;

    public i(String str, h hVar) {
        this.f2179a = str;
        this.f2180b = hVar;
    }

    @Override
    public final void f(int i9) {
        h hVar;
        String str = this.f2179a;
        if (str != null && (hVar = this.f2180b) != null) {
            hVar.q(i9, str);
        }
    }

    @Override
    public final void i(int i9) {
        h hVar;
        String str = this.f2179a;
        if (str != null && (hVar = this.f2180b) != null) {
            hVar.r(i9, str);
        }
    }
}
