package defpackage;
public final class wff extends yff {
    @Override
    public final void a(Object obj, long j) {
        ldf ldfVar = (ldf) ((dff) ghf.g(obj, j));
        if (ldfVar.a) {
            ldfVar.a = false;
        }
    }

    @Override
    public final void b(Object obj, long j, Object obj2) {
        dff dffVar = (dff) ghf.g(obj, j);
        dff dffVar2 = (dff) ghf.g(obj2, j);
        int size = dffVar.size();
        int size2 = dffVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((ldf) dffVar).a) {
                dffVar = dffVar.zzg(size2 + size);
            }
            dffVar.addAll(dffVar2);
        }
        if (size > 0) {
            dffVar2 = dffVar;
        }
        ghf.i(obj, j, dffVar2);
    }
}
