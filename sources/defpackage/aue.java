package defpackage;
public final class aue extends cte {
    @Override
    public final void a(qpe qpeVar, qpe qpeVar2, long j) {
        nre nreVar = (nre) k2f.l(qpeVar, j);
        nre nreVar2 = (nre) k2f.l(qpeVar2, j);
        int size = nreVar.size();
        int size2 = nreVar2.size();
        if (size > 0 && size2 > 0) {
            if (!nreVar.zza()) {
                nreVar = nreVar.zza(size2 + size);
            }
            nreVar.addAll(nreVar2);
        }
        if (size > 0) {
            nreVar2 = nreVar;
        }
        k2f.d(qpeVar, j, nreVar2);
    }

    @Override
    public final void b(Object obj, long j) {
        ((nre) k2f.l(obj, j)).zzb();
    }
}
