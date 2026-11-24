package defpackage;
public final class lua implements gk7 {
    public final boolean[] a;
    public final fx0[] b;

    public lua(boolean[] zArr, fx0[] fx0VarArr) {
        this.a = zArr;
        this.b = fx0VarArr;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        fx0 fx0Var;
        if (i == kk7.B3 && this.a[0] && (fx0Var = this.b[0]) != null) {
            fx0Var.dismiss();
        }
    }
}
