package defpackage;
public final class yue implements xwe {
    public final qde a;
    public final mze b;
    public final wke c;

    public yue(mze mzeVar, wke wkeVar, qde qdeVar) {
        this.b = mzeVar;
        wkeVar.getClass();
        this.c = wkeVar;
        this.a = qdeVar;
    }

    @Override
    public final boolean a(Object obj) {
        this.c.getClass();
        ir2.u(obj);
        throw null;
    }

    @Override
    public final void b(Object obj) {
        this.b.getClass();
        ((nne) obj).zzb.e = false;
        this.c.getClass();
        ir2.u(obj);
        throw null;
    }

    @Override
    public final void c(Object obj, byte[] bArr, int i, int i2, sad sadVar) {
        nne nneVar = (nne) obj;
        if (nneVar.zzb == qze.f) {
            nneVar.zzb = qze.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final void d(Object obj, g6e g6eVar) {
        this.c.getClass();
        ir2.u(obj);
        throw null;
    }

    @Override
    public final void e(nne nneVar, nne nneVar2) {
        fxe.h(this.b, nneVar, nneVar2);
    }

    @Override
    public final boolean f(nne nneVar, nne nneVar2) {
        this.b.getClass();
        if (!nneVar.zzb.equals(nneVar2.zzb)) {
            return false;
        }
        return true;
    }

    @Override
    public final int g(nne nneVar) {
        this.b.getClass();
        return nneVar.zzb.hashCode();
    }

    @Override
    public final Object zza() {
        return ((jne) ((nne) this.a).d(5)).e();
    }

    @Override
    public final int zzb(Object obj) {
        this.b.getClass();
        qze qzeVar = ((nne) obj).zzb;
        int i = qzeVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < qzeVar.a; i3++) {
            i2 += lje.i(3, (sie) qzeVar.c[i3]) + lje.s(2, qzeVar.b[i3] >>> 3) + (lje.t(8) << 1);
        }
        qzeVar.d = i2;
        return i2;
    }
}
