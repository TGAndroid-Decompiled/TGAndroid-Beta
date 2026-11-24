package defpackage;
public final class r9e implements bbe {
    public final rrd a;
    public final y5d b;

    public r9e(y5d y5dVar, rrd rrdVar) {
        gcd gcdVar = byd.a;
        this.b = y5dVar;
        this.a = rrdVar;
    }

    @Override
    public final void a(Object obj, byte[] bArr, int i, int i2, kj6 kj6Var) {
        c2e c2eVar = (c2e) obj;
        if (c2eVar.zzc == iee.f) {
            c2eVar.zzc = iee.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final boolean b(c2e c2eVar, c2e c2eVar2) {
        if (!c2eVar.zzc.equals(c2eVar2.zzc)) {
            return false;
        }
        return true;
    }

    @Override
    public final int c(c2e c2eVar) {
        return c2eVar.zzc.hashCode();
    }

    @Override
    public final boolean d(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final int e(c2e c2eVar) {
        iee ieeVar = c2eVar.zzc;
        int i = ieeVar.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < ieeVar.a; i3++) {
                int b = cwd.b(ieeVar.b[i3] >>> 3) + cwd.b(16);
                int b2 = cwd.b(24);
                int j = ((zud) ieeVar.c[i3]).j();
                i2 += (cwd.b(8) << 1) + b + yjb.g(j, j, b2);
            }
            ieeVar.d = i2;
            return i2;
        }
        return i;
    }

    @Override
    public final void f(Object obj, xdd xddVar) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final c2e zze() {
        rrd rrdVar = this.a;
        if (rrdVar instanceof c2e) {
            return (c2e) ((c2e) rrdVar).d(4);
        }
        e0e e0eVar = (e0e) ((c2e) rrdVar).d(5);
        boolean m = e0eVar.b.m();
        c2e c2eVar = e0eVar.b;
        if (!m) {
            return c2eVar;
        }
        c2eVar.getClass();
        jae.c.a(c2eVar.getClass()).zzf(c2eVar);
        c2eVar.j();
        return e0eVar.b;
    }

    @Override
    public final void zzf(Object obj) {
        this.b.getClass();
        iee ieeVar = ((c2e) obj).zzc;
        if (ieeVar.e) {
            ieeVar.e = false;
        }
        gcd gcdVar = byd.a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final void zzg(Object obj, Object obj2) {
        pbe.o(obj, obj2);
    }
}
