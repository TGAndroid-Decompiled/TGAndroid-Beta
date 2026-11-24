package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class ma2 extends iw5 {
    public final Context x;
    public final qa2 y;

    public ma2(qa2 qa2Var, Context context, TLRPC.Chat chat, Context context2) {
        super(context, chat);
        this.y = qa2Var;
        this.x = context2;
    }

    @Override
    public final boolean a(final boolean z, gw5 gw5Var) {
        TLRPC.ChatFull chatFull;
        int i;
        String str;
        ylb ylbVar;
        qa2 qa2Var = this.y;
        if (!qa2Var.W || (chatFull = qa2Var.Z) == null || (i = chatFull.invitesCount) == 0) {
            return true;
        }
        if (qa2Var.b0) {
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
        ylbVar = ((d) qa2Var).resourceProvider;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        String M0 = jb6.M0(2131754169, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = gm.S2(jb6.G(i, str, new Object[0]));
        alertDialog$Builder.j(jb6.M0(2131754171, null), new ee(this) {
            public final ma2 b;

            {
                this.b = this;
            }

            @Override
            public final void r(he heVar2, int i2) {
                byte b = r3;
                boolean z2 = z;
                ma2 ma2Var = this.b;
                switch (b) {
                    case 0:
                        ma2Var.setJoinRequest(z2);
                        ma2Var.y.X = true;
                        return;
                    default:
                        ma2Var.setJoinRequest(z2);
                        ma2Var.y.X = false;
                        return;
                }
            }
        });
        alertDialog$Builder.g(jb6.M0(2131754170, null), new ee(this) {
            public final ma2 b;

            {
                this.b = this;
            }

            @Override
            public final void r(he heVar2, int i2) {
                byte b = r3;
                boolean z2 = z;
                ma2 ma2Var = this.b;
                switch (b) {
                    case 0:
                        ma2Var.setJoinRequest(z2);
                        ma2Var.y.X = true;
                        return;
                    default:
                        ma2Var.setJoinRequest(z2);
                        ma2Var.y.X = false;
                        return;
                }
            }
        });
        qa2Var.showDialog(heVar);
        return false;
    }
}
