package defpackage;
public abstract class uef implements Cloneable {
    public final vef a;
    public vef b;

    public uef(vef vefVar) {
        this.a = vefVar;
        if (!vefVar.g()) {
            this.b = (vef) vefVar.h(4, null);
        } else {
            w26.j("Default instance must be immutable.");
            throw null;
        }
    }

    public final defpackage.vef a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uef.a():vef");
    }

    public final vef b() {
        boolean g = this.b.g();
        vef vefVar = this.b;
        if (!g) {
            return vefVar;
        }
        vefVar.getClass();
        qgf.c.a(vefVar.getClass()).a(vefVar);
        vefVar.d();
        return this.b;
    }

    public final void c() {
        if (!this.b.g()) {
            vef vefVar = (vef) this.a.h(4, null);
            qgf.c.a(vefVar.getClass()).d(vefVar, this.b);
            this.b = vefVar;
        }
    }

    public final Object clone() {
        uef uefVar = (uef) this.a.h(5, null);
        uefVar.b = b();
        return uefVar;
    }
}
