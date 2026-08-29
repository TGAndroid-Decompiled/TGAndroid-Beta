package lh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import nh.gb;
import nh.wa;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b81;
import org.telegram.ui.de;
import org.telegram.ui.lc;
import org.telegram.ui.mc;
import org.telegram.ui.tn;
import org.telegram.ui.vc;
import org.telegram.ui.vf;
import org.telegram.ui.zg;
public final class y1 implements f5.d {
    public final int f16412a;
    public final Object f16413b;
    public final Object f16414c;

    public y1(int i10, Object obj, Object obj2) {
        this.f16412a = i10;
        this.f16413b = obj;
        this.f16414c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        switch (this.f16412a) {
            case 0:
                d4 d4Var = (d4) this.f16413b;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                d4Var.G3 = canApplyBoost;
                cg.v0.C1(new cg.z1(d4Var, 4), (TL_stories.TL_premium_boostsStatus) this.f16414c, canApplyBoost, d4Var.f15540x1, true);
                i9 i9Var = d4Var.F0;
                if (i9Var != null) {
                    i9Var.f15760g1 = false;
                    i9Var.P();
                    return;
                }
                return;
            case 1:
                vc vcVar = (vc) this.f16413b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f16414c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                vcVar.f43506c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    vcVar.f43504b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                vcVar.X0(true);
                nh.d dVar = vcVar.L;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 2:
                mc mcVar = (mc) this.f16413b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f16414c;
                View view = (View) obj;
                mcVar.getClass();
                if (view instanceof lc) {
                    lc lcVar = (lc) view;
                    lcVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, mcVar.f40519a));
                    mcVar.f40520b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        lcVar.a(peerColors.colors.get(R));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                cg.v0 v0Var = (cg.v0) this.f16414c;
                v0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                ((de) this.f16413b).f37521s0.showDialog(v0Var);
                return;
            case 4:
                Boolean bool = (Boolean) obj;
                ((tn) this.f16413b).f42812fb = true;
                ((vf) this.f16414c).run();
                return;
            case 5:
                ni niVar = (ni) this.f16413b;
                gi giVar = (gi) this.f16414c;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = niVar.F1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(giVar.f28890c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new zg(8, niVar, giVar), 66);
                return;
            case 6:
                yi yiVar = (yi) this.f16413b;
                MessagesController messagesController = (MessagesController) this.f16414c;
                Long l10 = (Long) obj;
                boolean z10 = false;
                yiVar.f35070f0 = false;
                if (l10 == null) {
                    user = null;
                } else {
                    user = messagesController.getUser(l10);
                }
                yiVar.f35069e0 = user;
                if (user == null) {
                    z10 = true;
                }
                yiVar.f35071g0 = z10;
                if (user != null) {
                    yiVar.O();
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f16413b;
                ((org.telegram.ui.ActionBar.c2) this.f16414c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    gb E = gb.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.J = a2;
                    wa waVar = E.Y0;
                    if (waVar != null) {
                        waVar.setDialogId(a2);
                    }
                    E.R(null);
                    return;
                }
                return;
            default:
                Boolean bool3 = (Boolean) obj;
                b81.f0((b81) this.f16413b, (TLRPC.TL_attachMenuBot) this.f16414c);
                return;
        }
    }
}
