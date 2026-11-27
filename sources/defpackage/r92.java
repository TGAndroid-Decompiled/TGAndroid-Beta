package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class r92 extends nw5 {
    public final Context x;
    public final v92 y;

    public r92(v92 v92Var, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.y = v92Var;
        this.x = context2;
    }

    @Override
    public final boolean a(final boolean z, lw5 lw5Var) {
        TLRPC.ChatFull chatFull;
        int i;
        String str;
        vnb vnbVar;
        v92 v92Var = this.y;
        if (!v92Var.W || (chatFull = v92Var.Z) == null || (i = chatFull.invitesCount) == 0) {
            return true;
        }
        if (v92Var.b0) {
            if (z) {
                str = "ApproveNewMembersEnableForLinksChannel";
            } else {
                str = "ApproveNewMembersDisableForLinksChannel";
            }
        } else if (z) {
            str = "ApproveNewMembersEnableForLinks";
        } else {
            str = "ApproveNewMembersDisableForLinks";
        }
        Context context = this.x;
        vnbVar = ((e) v92Var).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        String M0 = ob6.M0(2131754197, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = hl.S2(ob6.G(i, str, new Object[0]));
        alertDialog$Builder.j(ob6.M0(2131754199, null), new fd(this) {
            public final r92 b;

            {
                this.b = this;
            }

            @Override
            public final void w(id idVar2, int i2) {
                byte b = r3;
                boolean z2 = z;
                r92 r92Var = this.b;
                switch (b) {
                    case 0:
                        r92Var.setJoinRequest(z2);
                        r92Var.y.X = true;
                        return;
                    default:
                        r92Var.setJoinRequest(z2);
                        r92Var.y.X = false;
                        return;
                }
            }
        });
        alertDialog$Builder.g(ob6.M0(2131754198, null), new fd(this) {
            public final r92 b;

            {
                this.b = this;
            }

            @Override
            public final void w(id idVar2, int i2) {
                byte b = r3;
                boolean z2 = z;
                r92 r92Var = this.b;
                switch (b) {
                    case 0:
                        r92Var.setJoinRequest(z2);
                        r92Var.y.X = true;
                        return;
                    default:
                        r92Var.setJoinRequest(z2);
                        r92Var.y.X = false;
                        return;
                }
            }
        });
        v92Var.showDialog(idVar);
        return false;
    }
}
