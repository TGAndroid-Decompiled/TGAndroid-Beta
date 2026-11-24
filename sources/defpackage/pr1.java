package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class pr1 extends z82 {
    public final yv1 B0;

    public pr1(yv1 yv1Var, Context context, yv1 yv1Var2, boolean z, ylb ylbVar) {
        super(context, yv1Var2, z, ylbVar);
        this.B0 = yv1Var;
    }

    @Override
    public final boolean a() {
        boolean z;
        yv1 yv1Var = this.B0;
        if (!yv1Var.mb && !yv1Var.isInPreviewMode()) {
            z = ((d) yv1Var).inBubbleMode;
            if (!z && yv1Var.k0 != null && !yv1Var.H3) {
                if (!yv1Var.j8() || yv1Var.x4) {
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
        yv1 yv1Var = this.B0;
        TLRPC.User user = yv1Var.f;
        if (user != null && user.linked_community_id != 0) {
            yv1Var.showDialog(new pp2(yv1Var, yv1Var.f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = yv1Var.e;
        if (chat != null && chat.linked_community_id != 0) {
            yv1Var.showDialog(new pp2(yv1Var, yv1Var.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        yv1 yv1Var = this.B0;
        if (yv1Var.i8()) {
            str = "";
        } else {
            str = null;
        }
        yv1Var.Ba(str);
    }

    @Override
    public final boolean o() {
        if (this.B0.g4 == 3) {
            return true;
        }
        return false;
    }
}
