package defpackage;
public final class nif implements uif {
    public final kff a;
    public final ejf b;

    public nif(ejf ejfVar, pgf pgfVar, kff kffVar) {
        this.b = ejfVar;
        this.a = kffVar;
    }

    @Override
    public final void a(Object obj) {
        this.b.getClass();
        djf djfVar = ((wgf) obj).zzc;
        if (djfVar.d) {
            djfVar.d = false;
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final boolean b(wgf wgfVar, wgf wgfVar2) {
        this.b.getClass();
        if (!wgfVar.zzc.equals(wgfVar2.zzc)) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(Object obj, Object obj2) {
        vif.o(this.b, obj, obj2);
    }

    @Override
    public final void d(Object obj, hoe hoeVar) {
        ts2.t(obj);
        throw null;
    }

    @Override
    public final int e(wgf wgfVar) {
        this.b.getClass();
        djf djfVar = wgfVar.zzc;
        int i = djfVar.c;
        if (i == -1) {
            djfVar.c = 0;
            return 0;
        }
        return i;
    }

    @Override
    public final int f(wgf wgfVar) {
        this.b.getClass();
        wgfVar.zzc.getClass();
        return 506991;
    }

    @Override
    public final boolean g(Object obj) {
        ts2.t(obj);
        throw null;
    }

    @Override
    public final wgf zzc() {
        kff kffVar = this.a;
        if (kffVar instanceof wgf) {
            return (wgf) ((wgf) kffVar).h(4, null);
        }
        return ((vgf) ((wgf) kffVar).h(5, null)).b();
    }
}
