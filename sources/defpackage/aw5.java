package defpackage;

import android.content.DialogInterface;
public final class aw5 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final Object b;
    public final boolean c;

    public aw5(byte b, Object obj, boolean z) {
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
                ew5 ew5Var = (ew5) obj;
                ew5.E0(ew5Var.getContext(), ew5Var.n1, ew5Var.s1, z);
                return;
            case 1:
                ew5 ew5Var2 = (ew5) obj;
                ew5.E0(ew5Var2.getContext(), ew5Var2.n1, ew5Var2.s1, z);
                return;
            default:
                v9b v9bVar = (v9b) obj;
                v9bVar.A2 = false;
                v9bVar.Y0.x(7, true);
                if (z) {
                    v9bVar.o(true);
                    return;
                }
                return;
        }
    }
}
