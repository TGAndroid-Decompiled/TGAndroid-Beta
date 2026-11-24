package defpackage;
public final class xhf extends zhf {
    @Override
    public final void a(Object obj, long j) {
        mff mffVar = (mff) ((ehf) hjf.g(obj, j));
        if (mffVar.a) {
            mffVar.a = false;
        }
    }

    @Override
    public final void b(Object obj, long j, Object obj2) {
        ehf ehfVar = (ehf) hjf.g(obj, j);
        ehf ehfVar2 = (ehf) hjf.g(obj2, j);
        int size = ehfVar.size();
        int size2 = ehfVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((mff) ehfVar).a) {
                ehfVar = ehfVar.zzg(size2 + size);
            }
            ehfVar.addAll(ehfVar2);
        }
        if (size > 0) {
            ehfVar2 = ehfVar;
        }
        hjf.i(obj, j, ehfVar2);
    }
}
