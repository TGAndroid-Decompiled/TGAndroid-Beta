package defpackage;

import android.content.DialogInterface;
public final class fw5 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final jw5 b;
    public final boolean c;

    public fw5(jw5 jw5Var, boolean z, byte b) {
        this.a = b;
        this.b = jw5Var;
        this.c = z;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean z = this.c;
        jw5 jw5Var = this.b;
        switch (b) {
            case 0:
                jw5.F0(jw5Var.getContext(), jw5Var.n1, jw5Var.s1, z);
                return;
            default:
                jw5.F0(jw5Var.getContext(), jw5Var.n1, jw5Var.s1, z);
                return;
        }
    }
}
