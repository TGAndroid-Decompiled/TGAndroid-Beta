package defpackage;
public final class a3c implements ez5, dz5 {
    public final String a;
    public final String b;
    public final icc c;

    public a3c(icc iccVar, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = iccVar;
    }

    @Override
    public final void a(String str) {
        r3c.E0(this.a, str, this.b, this.c);
    }

    @Override
    public final void l(Exception exc) {
        r3c.E0(this.a, "en", this.b, this.c);
    }
}
