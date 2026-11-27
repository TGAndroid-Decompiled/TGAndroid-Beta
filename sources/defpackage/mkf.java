package defpackage;
public final class mkf extends okf {
    @Override
    public final void a(long j, Object obj) {
        bif bifVar = (bif) ((tjf) wlf.g(obj, j));
        if (bifVar.a) {
            bifVar.a = false;
        }
    }

    @Override
    public final void b(long j, Object obj, Object obj2) {
        tjf tjfVar = (tjf) wlf.g(obj, j);
        tjf tjfVar2 = (tjf) wlf.g(obj2, j);
        int size = tjfVar.size();
        int size2 = tjfVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((bif) tjfVar).a) {
                tjfVar = tjfVar.zzg(size2 + size);
            }
            tjfVar.addAll(tjfVar2);
        }
        if (size > 0) {
            tjfVar2 = tjfVar;
        }
        wlf.i(obj, j, tjfVar2);
    }
}
