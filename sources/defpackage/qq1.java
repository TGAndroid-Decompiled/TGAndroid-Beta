package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class qq1 extends f82 {
    public final zu1 B0;

    public qq1(zu1 zu1Var, Context context, zu1 zu1Var2, boolean z, vnb vnbVar) {
        super(context, zu1Var2, z, vnbVar);
        this.B0 = zu1Var;
    }

    @Override
    public final boolean a() {
        boolean z;
        zu1 zu1Var = this.B0;
        if (!zu1Var.mb && !zu1Var.isInPreviewMode()) {
            z = ((e) zu1Var).inBubbleMode;
            if (!z && zu1Var.k0 != null && !zu1Var.H3) {
                if (!zu1Var.k8() || zu1Var.x4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean d() {
        zu1 zu1Var = this.B0;
        TLRPC.User user = zu1Var.f;
        if (user != null && user.linked_community_id != 0) {
            zu1Var.showDialog(new xo2(zu1Var, zu1Var.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = zu1Var.e;
        if (chat != null && chat.linked_community_id != 0) {
            zu1Var.showDialog(new xo2(zu1Var, zu1Var.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        zu1 zu1Var = this.B0;
        if (zu1Var.j8()) {
            str = "";
        } else {
            str = null;
        }
        zu1Var.Ca(str);
    }

    @Override
    public final boolean o() {
        if (this.B0.g4 == 3) {
            return true;
        }
        return false;
    }
}
