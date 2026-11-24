package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class u82 implements View.OnClickListener {
    public final byte a;
    public final f92 b;

    public u82(f92 f92Var, byte b) {
        this.a = b;
        this.b = f92Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        f92 f92Var = this.b;
        switch (b) {
            case 0:
                TLRPC.Chat currentChannel = ((jb) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f92Var.getParentActivity());
                String M0 = k96.M0(2131689472, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                if (f92Var.b0) {
                    hdVar.U = gl.T2(k96.a0("RevokeLinkAlertChannel", null, 2131745828, f92Var.getMessagesController().N2 + "/" + hc2.K(currentChannel, false), currentChannel.title));
                } else {
                    hdVar.U = gl.T2(k96.a0("RevokeLinkAlert", null, 2131745829, f92Var.getMessagesController().N2 + "/" + hc2.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.j(k96.M0(2131745831, null), new v82(f92Var, currentChannel, (byte) 0));
                f92Var.showDialog(hdVar);
                return;
            case 1:
                if (!f92Var.W) {
                    f92Var.W = true;
                    f92Var.g0();
                    return;
                }
                return;
            case 2:
                if (f92Var.W) {
                    if (!f92Var.d0) {
                        f92Var.e0();
                        return;
                    }
                    f92Var.W = false;
                    f92Var.g0();
                    return;
                }
                return;
            case 3:
                yh6 yh6Var = new yh6(f92Var.a0, 0, 0L);
                yh6Var.l0(f92Var.Z, f92Var.m0);
                f92Var.presentFragment(yh6Var);
                return;
            default:
                boolean z = !f92Var.c0;
                f92Var.c0 = z;
                ((ahb) view).setChecked(z);
                return;
        }
    }
}
