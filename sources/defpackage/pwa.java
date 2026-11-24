package defpackage;
public final class pwa implements jm7 {
    public final boolean[] a;
    public final my0[] b;

    public pwa(boolean[] zArr, my0[] my0VarArr) {
        this.a = zArr;
        this.b = my0VarArr;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        my0 my0Var;
        if (i == nm7.C3 && this.a[0] && (my0Var = this.b[0]) != null) {
            my0Var.dismiss();
        }
    }
}
