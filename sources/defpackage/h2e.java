package defpackage;
public abstract class h2e implements Cloneable {
    public final f4e a;
    public f4e b;

    public h2e(f4e f4eVar) {
        this.a = f4eVar;
        if (!f4eVar.m()) {
            this.b = (f4e) f4eVar.d(4);
        } else {
            u36.j("Default instance must be immutable.");
            throw null;
        }
    }

    public final f4e a() {
        boolean m = this.b.m();
        f4e f4eVar = this.b;
        if (m) {
            f4eVar.getClass();
            kce.c.a(f4eVar.getClass()).zzf(f4eVar);
            f4eVar.j();
            f4eVar = this.b;
        }
        f4eVar.getClass();
        if (f4e.c(f4eVar, true)) {
            return f4eVar;
        }
        throw new wfe();
    }

    public final void b() {
        if (!this.b.m()) {
            f4e f4eVar = (f4e) this.a.d(4);
            kce.c.a(f4eVar.getClass()).zzg(f4eVar, this.b);
            this.b = f4eVar;
        }
    }

    public final Object clone() {
        h2e h2eVar = (h2e) this.a.d(5);
        boolean m = this.b.m();
        f4e f4eVar = this.b;
        if (m) {
            f4eVar.getClass();
            kce.c.a(f4eVar.getClass()).zzf(f4eVar);
            f4eVar.j();
            f4eVar = this.b;
        }
        h2eVar.b = f4eVar;
        return h2eVar;
    }
}
