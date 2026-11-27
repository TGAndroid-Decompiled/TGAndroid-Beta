package defpackage;
public final class hee implements rfe {
    public final hwd a;
    public final rad b;

    public hee(rad radVar, hwd hwdVar) {
        zgd zgdVar = r2e.a;
        this.b = radVar;
        this.a = hwdVar;
    }

    @Override
    public final void a(Object obj, byte[] bArr, int i, int i2, pl6 pl6Var) {
        s6e s6eVar = (s6e) obj;
        if (s6eVar.zzc == zie.f) {
            s6eVar.zzc = zie.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final boolean b(s6e s6eVar, s6e s6eVar2) {
        if (!s6eVar.zzc.equals(s6eVar2.zzc)) {
            return false;
        }
        return true;
    }

    @Override
    public final int c(s6e s6eVar) {
        return s6eVar.zzc.hashCode();
    }

    @Override
    public final boolean d(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final int e(s6e s6eVar) {
        zie zieVar = s6eVar.zzc;
        int i = zieVar.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < zieVar.a; i3++) {
                int b = s0e.b(zieVar.b[i3] >>> 3) + s0e.b(16);
                int b2 = s0e.b(24);
                int j = ((pzd) zieVar.c[i3]).j();
                i2 += (s0e.b(8) << 1) + b + xnb.g(j, j, b2);
            }
            zieVar.d = i2;
            return i2;
        }
        return i;
    }

    @Override
    public final void f(Object obj, oqd oqdVar) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final s6e zze() {
        hwd hwdVar = this.a;
        if (hwdVar instanceof s6e) {
            return (s6e) ((s6e) hwdVar).d(4);
        }
        u4e u4eVar = (u4e) ((s6e) hwdVar).d(5);
        boolean m = u4eVar.b.m();
        s6e s6eVar = u4eVar.b;
        if (!m) {
            return s6eVar;
        }
        s6eVar.getClass();
        zee.c.a(s6eVar.getClass()).zzf(s6eVar);
        s6eVar.j();
        return u4eVar.b;
    }

    @Override
    public final void zzf(Object obj) {
        this.b.getClass();
        zie zieVar = ((s6e) obj).zzc;
        if (zieVar.e) {
            zieVar.e = false;
        }
        zgd zgdVar = r2e.a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final void zzg(Object obj, Object obj2) {
        fge.o(obj, obj2);
    }
}
