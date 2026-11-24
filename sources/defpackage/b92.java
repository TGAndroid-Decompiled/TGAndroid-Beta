package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class b92 extends ju5 {
    public final Context x;
    public final f92 y;

    public b92(f92 f92Var, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.y = f92Var;
        this.x = context2;
    }

    @Override
    public final boolean a(final boolean z, hu5 hu5Var) {
        TLRPC.ChatFull chatFull;
        int i;
        String str;
        wjb wjbVar;
        f92 f92Var = this.y;
        if (!f92Var.W || (chatFull = f92Var.Z) == null || (i = chatFull.invitesCount) == 0) {
            return true;
        }
        if (f92Var.b0) {
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
        wjbVar = ((d) f92Var).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        String M0 = k96.M0(2131754201, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = gl.S2(k96.G(i, str, new Object[0]));
        alertDialog$Builder.j(k96.M0(2131754203, null), new ed(this) {
            public final b92 b;

            {
                this.b = this;
            }

            @Override
            public final void u(hd hdVar2, int i2) {
                byte b = r3;
                boolean z2 = z;
                b92 b92Var = this.b;
                switch (b) {
                    case 0:
                        b92Var.setJoinRequest(z2);
                        b92Var.y.X = true;
                        return;
                    default:
                        b92Var.setJoinRequest(z2);
                        b92Var.y.X = false;
                        return;
                }
            }
        });
        alertDialog$Builder.g(k96.M0(2131754202, null), new ed(this) {
            public final b92 b;

            {
                this.b = this;
            }

            @Override
            public final void u(hd hdVar2, int i2) {
                byte b = r3;
                boolean z2 = z;
                b92 b92Var = this.b;
                switch (b) {
                    case 0:
                        b92Var.setJoinRequest(z2);
                        b92Var.y.X = true;
                        return;
                    default:
                        b92Var.setJoinRequest(z2);
                        b92Var.y.X = false;
                        return;
                }
            }
        });
        f92Var.showDialog(hdVar);
        return false;
    }
}
