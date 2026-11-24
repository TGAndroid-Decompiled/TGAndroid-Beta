package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class cq1 extends o72 {
    public final mu1 B0;

    public cq1(mu1 mu1Var, Context context, mu1 mu1Var2, boolean z, wjb wjbVar) {
        super(context, mu1Var2, z, wjbVar);
        this.B0 = mu1Var;
    }

    @Override
    public final boolean a() {
        boolean z;
        mu1 mu1Var = this.B0;
        if (!mu1Var.mb && !mu1Var.isInPreviewMode()) {
            z = ((d) mu1Var).inBubbleMode;
            if (!z && mu1Var.k0 != null && !mu1Var.H3) {
                if (!mu1Var.Y7() || mu1Var.x4) {
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
        mu1 mu1Var = this.B0;
        TLRPC.User user = mu1Var.f;
        if (user != null && user.linked_community_id != 0) {
            mu1Var.showDialog(new eo2(mu1Var, mu1Var.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = mu1Var.e;
        if (chat != null && chat.linked_community_id != 0) {
            mu1Var.showDialog(new eo2(mu1Var, mu1Var.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        mu1 mu1Var = this.B0;
        if (mu1Var.X7()) {
            str = "";
        } else {
            str = null;
        }
        mu1Var.pa(str);
    }

    @Override
    public final boolean o() {
        if (this.B0.g4 == 3) {
            return true;
        }
        return false;
    }
}
