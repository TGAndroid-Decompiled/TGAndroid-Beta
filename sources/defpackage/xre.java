package defpackage;
public final class xre extends zqe {
    @Override
    public final void a(nne nneVar, nne nneVar2, long j) {
        kpe kpeVar = (kpe) i0f.l(nneVar, j);
        kpe kpeVar2 = (kpe) i0f.l(nneVar2, j);
        int size = kpeVar.size();
        int size2 = kpeVar2.size();
        if (size > 0 && size2 > 0) {
            if (!kpeVar.zza()) {
                kpeVar = kpeVar.zza(size2 + size);
            }
            kpeVar.addAll(kpeVar2);
        }
        if (size > 0) {
            kpeVar2 = kpeVar;
        }
        i0f.d(nneVar, j, kpeVar2);
    }

    @Override
    public final void b(Object obj, long j) {
        ((kpe) i0f.l(obj, j)).zzb();
    }
}
