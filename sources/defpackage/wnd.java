package defpackage;
public final class wnd extends tmd {
    @Override
    public final void a(Object obj, long j) {
        ((dad) ((mkd) uzd.l(obj, j))).a = false;
    }

    @Override
    public final void b(vid vidVar, vid vidVar2, long j) {
        mkd mkdVar = (mkd) uzd.l(vidVar, j);
        mkd mkdVar2 = (mkd) uzd.l(vidVar2, j);
        int size = mkdVar.size();
        int size2 = mkdVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((dad) mkdVar).a) {
                mkdVar = mkdVar.f(size2 + size);
            }
            mkdVar.addAll(mkdVar2);
        }
        if (size > 0) {
            mkdVar2 = mkdVar;
        }
        uzd.d(vidVar, j, mkdVar2);
    }
}
