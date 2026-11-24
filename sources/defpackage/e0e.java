package defpackage;
public abstract class e0e implements Cloneable {
    public final c2e a;
    public c2e b;

    public e0e(c2e c2eVar) {
        this.a = c2eVar;
        if (!c2eVar.m()) {
            this.b = (c2e) c2eVar.d(4);
        } else {
            w26.j("Default instance must be immutable.");
            throw null;
        }
    }

    public final c2e a() {
        boolean m = this.b.m();
        c2e c2eVar = this.b;
        if (m) {
            c2eVar.getClass();
            jae.c.a(c2eVar.getClass()).zzf(c2eVar);
            c2eVar.j();
            c2eVar = this.b;
        }
        c2eVar.getClass();
        if (c2e.c(c2eVar, true)) {
            return c2eVar;
        }
        throw new vde();
    }

    public final void b() {
        if (!this.b.m()) {
            c2e c2eVar = (c2e) this.a.d(4);
            jae.c.a(c2eVar.getClass()).zzg(c2eVar, this.b);
            this.b = c2eVar;
        }
    }

    public final Object clone() {
        e0e e0eVar = (e0e) this.a.d(5);
        boolean m = this.b.m();
        c2e c2eVar = this.b;
        if (m) {
            c2eVar.getClass();
            jae.c.a(c2eVar.getClass()).zzf(c2eVar);
            c2eVar.j();
            c2eVar = this.b;
        }
        e0eVar.b = c2eVar;
        return e0eVar;
    }
}
