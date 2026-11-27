package defpackage;
public final class hzc extends d6 {
    public final jzc a;

    public hzc(jzc jzcVar) {
        this.a = jzcVar;
    }

    @Override
    public final void b(int i) {
        jzc jzcVar = this.a;
        r47 r47Var = jzcVar.n;
        if (i == -1) {
            jzcVar.finishFragment();
        } else if (i == 1) {
            if (r47Var != null) {
                r47Var.k.with_my_score = false;
                jzcVar.showDialog(kea.H0(jzcVar.getParentActivity(), r47Var, null, false, jzcVar.h));
            }
        } else if (i == 2) {
            jzc.Z(jzcVar.d, r47Var, jzcVar.getParentActivity(), jzcVar.r, jzcVar.e);
        }
    }
}
