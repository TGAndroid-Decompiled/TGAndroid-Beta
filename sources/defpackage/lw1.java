package defpackage;

import android.content.DialogInterface;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class lw1 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final boolean b;
    public final fn7 c;

    public lw1(fn7 fn7Var, boolean z, byte b) {
        this.a = b;
        this.c = fn7Var;
        this.b = z;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean z = true;
        boolean z2 = this.b;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) fn7Var;
                int i = ChatActivityEnterView.X7;
                if (fc.b(chatActivityEnterView.R, chatActivityEnterView.l()) == null) {
                    z = false;
                }
                if (z || z2) {
                    hl.d3(new vv1(chatActivityEnterView, z, (byte) 0), 180L);
                    return;
                }
                return;
            default:
                sbb sbbVar = (sbb) fn7Var;
                sbbVar.A2 = false;
                sbbVar.Y0.x(7, true);
                if (z2) {
                    sbbVar.o(true);
                    return;
                }
                return;
        }
    }
}
