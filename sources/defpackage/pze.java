package defpackage;
public final class pze implements o1f {
    public final hie a;
    public final d4f b;
    public final npe c;

    public pze(d4f d4fVar, npe npeVar, hie hieVar) {
        this.b = d4fVar;
        npeVar.getClass();
        this.c = npeVar;
        this.a = hieVar;
    }

    @Override
    public final boolean a(Object obj) {
        this.c.getClass();
        bs2.u(obj);
        throw null;
    }

    @Override
    public final void b(Object obj) {
        this.b.getClass();
        ((ese) obj).zzb.e = false;
        this.c.getClass();
        bs2.u(obj);
        throw null;
    }

    @Override
    public final void c(Object obj, byte[] bArr, int i, int i2, lfd lfdVar) {
        ese eseVar = (ese) obj;
        if (eseVar.zzb == h4f.f) {
            eseVar.zzb = h4f.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final void d(ese eseVar, ese eseVar2) {
        w1f.h(this.b, eseVar, eseVar2);
    }

    @Override
    public final void e(Object obj, g9d g9dVar) {
        this.c.getClass();
        bs2.u(obj);
        throw null;
    }

    @Override
    public final boolean f(ese eseVar, ese eseVar2) {
        this.b.getClass();
        if (!eseVar.zzb.equals(eseVar2.zzb)) {
            return false;
        }
        return true;
    }

    @Override
    public final int g(ese eseVar) {
        this.b.getClass();
        return eseVar.zzb.hashCode();
    }

    @Override
    public final Object zza() {
        return ((ase) ((ese) this.a).d(5)).e();
    }

    @Override
    public final int zzb(Object obj) {
        this.b.getClass();
        h4f h4fVar = ((ese) obj).zzb;
        int i = h4fVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < h4fVar.a; i3++) {
            i2 += coe.i(3, (jne) h4fVar.c[i3]) + coe.s(2, h4fVar.b[i3] >>> 3) + (coe.t(8) << 1);
        }
        h4fVar.d = i2;
        return i2;
    }
}
