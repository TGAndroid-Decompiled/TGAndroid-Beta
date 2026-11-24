package defpackage;

import android.content.DialogInterface;
public final class bu5 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final Object b;
    public final boolean c;

    public bu5(byte b, Object obj, boolean z) {
        this.a = b;
        this.b = obj;
        this.c = z;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean z = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                fu5 fu5Var = (fu5) obj;
                fu5.E0(fu5Var.getContext(), fu5Var.n1, fu5Var.s1, z);
                return;
            case 1:
                fu5 fu5Var2 = (fu5) obj;
                fu5.E0(fu5Var2.getContext(), fu5Var2.n1, fu5Var2.s1, z);
                return;
            default:
                t7b t7bVar = (t7b) obj;
                t7bVar.A2 = false;
                t7bVar.Y0.x(7, true);
                if (z) {
                    t7bVar.o(true);
                    return;
                }
                return;
        }
    }
}
