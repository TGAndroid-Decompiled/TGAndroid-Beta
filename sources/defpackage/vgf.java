package defpackage;
public abstract class vgf implements Cloneable {
    public final wgf a;
    public wgf b;

    public vgf(wgf wgfVar) {
        this.a = wgfVar;
        if (!wgfVar.g()) {
            this.b = (wgf) wgfVar.h(4, null);
        } else {
            u36.j("Default instance must be immutable.");
            throw null;
        }
    }

    public final defpackage.wgf a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vgf.a():wgf");
    }

    public final wgf b() {
        boolean g = this.b.g();
        wgf wgfVar = this.b;
        if (!g) {
            return wgfVar;
        }
        wgfVar.getClass();
        rif.c.a(wgfVar.getClass()).a(wgfVar);
        wgfVar.d();
        return this.b;
    }

    public final void c() {
        if (!this.b.g()) {
            wgf wgfVar = (wgf) this.a.h(4, null);
            rif.c.a(wgfVar.getClass()).c(wgfVar, this.b);
            this.b = wgfVar;
        }
    }

    public final Object clone() {
        vgf vgfVar = (vgf) this.a.h(5, null);
        vgfVar.b = b();
        return vgfVar;
    }
}
