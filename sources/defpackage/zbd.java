package defpackage;
public final class zbd implements fg1 {
    public final r8d a;

    public zbd(r8d r8dVar) {
        this.a = r8dVar;
    }

    @Override
    public final void a(oed oedVar) {
        fre.i(oedVar, "channel must not be null");
    }

    @Override
    public final void b(oed oedVar) {
        fre.i(oedVar, "channel must not be null");
    }

    @Override
    public final void c(oed oedVar) {
        fre.i(oedVar, "channel must not be null");
    }

    @Override
    public final void d(oed oedVar) {
        fre.i(oedVar, "channel must not be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zbd.class == obj.getClass() && this.a == ((zbd) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
