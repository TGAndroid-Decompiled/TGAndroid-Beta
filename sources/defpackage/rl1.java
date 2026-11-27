package defpackage;

import android.content.DialogInterface;
public final class rl1 implements DialogInterface.OnShowListener {
    public final byte a;
    public final zu1 b;

    public rl1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.pc(false);
                return;
            default:
                zu1Var.pc(false);
                return;
        }
    }
}
