package defpackage;
public final class swc extends c6 {
    public final uwc a;

    public swc(uwc uwcVar) {
        this.a = uwcVar;
    }

    @Override
    public final void b(int i) {
        uwc uwcVar = this.a;
        k47 k47Var = uwcVar.n;
        if (i == -1) {
            uwcVar.finishFragment();
        } else if (i == 1) {
            if (k47Var != null) {
                k47Var.k.with_my_score = false;
                uwcVar.showDialog(tca.G0(uwcVar.getParentActivity(), k47Var, null, false, uwcVar.h));
            }
        } else if (i == 2) {
            uwc.a0(uwcVar.d, k47Var, uwcVar.getParentActivity(), uwcVar.r, uwcVar.e);
        }
    }
}
