package defpackage;
public final class fg0 implements eg0 {
    public final eha a;

    public fg0(eha ehaVar) {
        this.a = ehaVar;
    }

    @Override
    public final void a(ds2 ds2Var) {
        boolean c = ds2Var.c();
        eha ehaVar = this.a;
        if (c) {
            ehaVar.j(null, ehaVar.E);
            return;
        }
        v39 v39Var = ehaVar.u;
        if (v39Var != null) {
            ((fy4) v39Var.b).onConnectionFailed(ds2Var);
        }
    }
}
