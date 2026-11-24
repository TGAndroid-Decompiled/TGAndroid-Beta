package defpackage;
public final class sbe implements cde {
    public final utd a;
    public final a8d b;

    public sbe(a8d a8dVar, utd utdVar) {
        ied iedVar = e0e.a;
        this.b = a8dVar;
        this.a = utdVar;
    }

    @Override
    public final void a(Object obj, byte[] bArr, int i, int i2, nl6 nl6Var) {
        f4e f4eVar = (f4e) obj;
        if (f4eVar.zzc == jge.f) {
            f4eVar.zzc = jge.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final boolean b(f4e f4eVar, f4e f4eVar2) {
        if (!f4eVar.zzc.equals(f4eVar2.zzc)) {
            return false;
        }
        return true;
    }

    @Override
    public final int c(f4e f4eVar) {
        return f4eVar.zzc.hashCode();
    }

    @Override
    public final void d(Object obj, cf9 cf9Var) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final boolean e(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final int f(f4e f4eVar) {
        jge jgeVar = f4eVar.zzc;
        int i = jgeVar.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < jgeVar.a; i3++) {
                int b = fyd.b(jgeVar.b[i3] >>> 3) + fyd.b(16);
                int b2 = fyd.b(24);
                int j = ((cxd) jgeVar.c[i3]).j();
                i2 += (fyd.b(8) << 1) + b + mlb.g(j, j, b2);
            }
            jgeVar.d = i2;
            return i2;
        }
        return i;
    }

    @Override
    public final f4e zze() {
        utd utdVar = this.a;
        if (utdVar instanceof f4e) {
            return (f4e) ((f4e) utdVar).d(4);
        }
        h2e h2eVar = (h2e) ((f4e) utdVar).d(5);
        boolean m = h2eVar.b.m();
        f4e f4eVar = h2eVar.b;
        if (!m) {
            return f4eVar;
        }
        f4eVar.getClass();
        kce.c.a(f4eVar.getClass()).zzf(f4eVar);
        f4eVar.j();
        return h2eVar.b;
    }

    @Override
    public final void zzf(Object obj) {
        this.b.getClass();
        jge jgeVar = ((f4e) obj).zzc;
        if (jgeVar.e) {
            jgeVar.e = false;
        }
        ied iedVar = e0e.a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override
    public final void zzg(Object obj, Object obj2) {
        qde.o(obj, obj2);
    }
}
