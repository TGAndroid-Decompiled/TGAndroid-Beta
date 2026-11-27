package defpackage;
public final class nsd extends krd {
    @Override
    public final void a(long j, Object obj) {
        ((wed) ((dpd) k4e.l(j, obj))).a = false;
    }

    @Override
    public final void b(mnd mndVar, mnd mndVar2, long j) {
        dpd dpdVar = (dpd) k4e.l(j, mndVar);
        dpd dpdVar2 = (dpd) k4e.l(j, mndVar2);
        int size = dpdVar.size();
        int size2 = dpdVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((wed) dpdVar).a) {
                dpdVar = dpdVar.f(size2 + size);
            }
            dpdVar.addAll(dpdVar2);
        }
        if (size > 0) {
            dpdVar2 = dpdVar;
        }
        k4e.d(j, mndVar, dpdVar2);
    }
}
