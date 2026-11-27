package defpackage;
public final class owe extends qve {
    @Override
    public final void a(ese eseVar, ese eseVar2, long j) {
        bue bueVar = (bue) a5f.l(eseVar, j);
        bue bueVar2 = (bue) a5f.l(eseVar2, j);
        int size = bueVar.size();
        int size2 = bueVar2.size();
        if (size > 0 && size2 > 0) {
            if (!bueVar.zza()) {
                bueVar = bueVar.zza(size2 + size);
            }
            bueVar.addAll(bueVar2);
        }
        if (size > 0) {
            bueVar2 = bueVar;
        }
        a5f.d(j, eseVar, bueVar2);
    }

    @Override
    public final void b(long j, Object obj) {
        ((bue) a5f.l(obj, j)).zzb();
    }
}
