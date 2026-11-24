package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ga2 implements View.OnClickListener {
    public final byte a;
    public final qa2 b;

    public ga2(qa2 qa2Var, byte b) {
        this.a = b;
        this.b = qa2Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        qa2 qa2Var = this.b;
        switch (b) {
            case 0:
                TLRPC.Chat currentChannel = ((jb) view.getParent()).getCurrentChannel();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qa2Var.getParentActivity());
                String M0 = jb6.M0(2131689472, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                if (qa2Var.b0) {
                    heVar.U = gm.S2(jb6.a0("RevokeLinkAlertChannel", null, 2131745754, qa2Var.getMessagesController().N2 + "/" + sd2.K(currentChannel, false), currentChannel.title));
                } else {
                    heVar.U = gm.S2(jb6.a0("RevokeLinkAlert", null, 2131745755, qa2Var.getMessagesController().N2 + "/" + sd2.K(currentChannel, false), currentChannel.title));
                }
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.j(jb6.M0(2131745757, null), new x92(qa2Var, currentChannel, (byte) 1));
                qa2Var.showDialog(heVar);
                return;
            case 1:
                if (!qa2Var.W) {
                    qa2Var.W = true;
                    qa2Var.h0();
                    return;
                }
                return;
            case 2:
                if (qa2Var.W) {
                    if (!qa2Var.d0) {
                        qa2Var.f0();
                        return;
                    }
                    qa2Var.W = false;
                    qa2Var.h0();
                    return;
                }
                return;
            case 3:
                ak6 ak6Var = new ak6(qa2Var.a0, 0, 0L);
                ak6Var.m0(qa2Var.Z, qa2Var.m0);
                qa2Var.presentFragment(ak6Var);
                return;
            default:
                boolean z = !qa2Var.c0;
                qa2Var.c0 = z;
                ((bjb) view).setChecked(z);
                return;
        }
    }
}
