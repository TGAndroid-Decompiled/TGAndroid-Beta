package oh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.xi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
import org.telegram.ui.fc;
import org.telegram.ui.ke;
import org.telegram.ui.lo;
import org.telegram.ui.p81;
import org.telegram.ui.rc;
import org.telegram.ui.sc;
import org.telegram.ui.xn;
import qh.ca;
public final class a2 implements h5.d {
    public final int f16837a;
    public final Object f16838b;
    public final Object f16839c;

    public a2(int i10, Object obj, Object obj2) {
        this.f16837a = i10;
        this.f16838b = obj;
        this.f16839c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        switch (this.f16837a) {
            case 0:
                f4 f4Var = (f4) this.f16838b;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                f4Var.H3 = canApplyBoost;
                fg.v0.C1(new fg.x1(f4Var, 4), (TL_stories.TL_premium_boostsStatus) this.f16839c, canApplyBoost, f4Var.f17128y1, true);
                i9 i9Var = f4Var.G0;
                if (i9Var != null) {
                    i9Var.f17272h1 = false;
                    i9Var.P();
                    return;
                }
                return;
            case 1:
                bd bdVar = (bd) this.f16838b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f16839c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                bdVar.f35424c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    bdVar.f35422b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                bdVar.X0(true);
                qh.d dVar = bdVar.M;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 2:
                sc scVar = (sc) this.f16838b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f16839c;
                View view = (View) obj;
                scVar.getClass();
                if (view instanceof rc) {
                    rc rcVar = (rc) view;
                    rcVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, scVar.f41224a));
                    scVar.f41225b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        rcVar.a(peerColors.colors.get(R));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                fg.v0 v0Var = (fg.v0) this.f16839c;
                v0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                ((ke) this.f16838b).f38376t0.showDialog(v0Var);
                return;
            case 4:
                Boolean bool = (Boolean) obj;
                ((xn) this.f16838b).f43202gb = true;
                ((fc) this.f16839c).run();
                return;
            case 5:
                mi miVar = (mi) this.f16838b;
                fi fiVar = (fi) this.f16839c;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = miVar.G1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(fiVar.f26924c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new lo(5, miVar, fiVar), 66);
                return;
            case 6:
                xi xiVar = (xi) this.f16838b;
                MessagesController messagesController = (MessagesController) this.f16839c;
                Long l10 = (Long) obj;
                boolean z4 = false;
                xiVar.f33109g0 = false;
                if (l10 == null) {
                    user = null;
                } else {
                    user = messagesController.getUser(l10);
                }
                xiVar.f33108f0 = user;
                if (user == null) {
                    z4 = true;
                }
                xiVar.f33110h0 = z4;
                if (user != null) {
                    xiVar.O();
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f16838b;
                ((org.telegram.ui.ActionBar.d2) this.f16839c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ca E = ca.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.K = a2;
                    qh.r9 r9Var = E.Z0;
                    if (r9Var != null) {
                        r9Var.setDialogId(a2);
                    }
                    E.R(null);
                    return;
                }
                return;
            default:
                Boolean bool3 = (Boolean) obj;
                p81.f0((p81) this.f16838b, (TLRPC.TL_attachMenuBot) this.f16839c);
                return;
        }
    }
}
