package defpackage;
public final class pya implements fn7 {
    public final boolean[] a;
    public final nx0[] b;

    public pya(boolean[] zArr, nx0[] nx0VarArr) {
        this.a = zArr;
        this.b = nx0VarArr;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        nx0 nx0Var;
        if (i == jn7.C3 && this.a[0] && (nx0Var = this.b[0]) != null) {
            nx0Var.dismiss();
        }
    }
}
