package defpackage;
public final class ruc extends c6 {
    public final tuc a;

    public ruc(tuc tucVar) {
        this.a = tucVar;
    }

    @Override
    public final void b(int i) {
        tuc tucVar = this.a;
        k27 k27Var = tucVar.n;
        if (i == -1) {
            tucVar.finishFragment();
        } else if (i == 1) {
            if (k27Var != null) {
                k27Var.k.with_my_score = false;
                tucVar.showDialog(taa.G0(tucVar.getParentActivity(), k27Var, null, false, tucVar.h));
            }
        } else if (i == 2) {
            tuc.Z(tucVar.d, k27Var, tucVar.getParentActivity(), tucVar.r, tucVar.e);
        }
    }
}
