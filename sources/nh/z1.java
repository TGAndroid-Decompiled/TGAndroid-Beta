package nh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.wi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dd;
import org.telegram.ui.hc;
import org.telegram.ui.me;
import org.telegram.ui.no;
import org.telegram.ui.tc;
import org.telegram.ui.uc;
import org.telegram.ui.w81;
import org.telegram.ui.zn;
import ph.da;
import ph.t9;
public final class z1 implements h5.d {
    public final int f16087a;
    public final Object f16088b;
    public final Object f16089c;

    public z1(int i10, Object obj, Object obj2) {
        this.f16087a = i10;
        this.f16088b = obj;
        this.f16089c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        switch (this.f16087a) {
            case 0:
                d4 d4Var = (d4) this.f16088b;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                d4Var.H3 = canApplyBoost;
                eg.v0.C1(new eg.y1(d4Var, 4), (TL_stories.TL_premium_boostsStatus) this.f16089c, canApplyBoost, d4Var.f15238y1, true);
                i9 i9Var = d4Var.G0;
                if (i9Var != null) {
                    i9Var.f15447h1 = false;
                    i9Var.P();
                    return;
                }
                return;
            case 1:
                dd ddVar = (dd) this.f16088b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f16089c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ddVar.f33420c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    ddVar.f33418b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                ddVar.X0(true);
                ph.d dVar = ddVar.M;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 2:
                uc ucVar = (uc) this.f16088b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f16089c;
                View view = (View) obj;
                ucVar.getClass();
                if (view instanceof tc) {
                    tc tcVar = (tc) view;
                    tcVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, ucVar.f38771a));
                    ucVar.f38772b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        tcVar.a(peerColors.colors.get(R));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                eg.v0 v0Var = (eg.v0) this.f16089c;
                v0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                ((me) this.f16088b).f36055t0.showDialog(v0Var);
                return;
            case 4:
                Boolean bool = (Boolean) obj;
                ((zn) this.f16088b).f40599gb = true;
                ((hc) this.f16089c).run();
                return;
            case 5:
                li liVar = (li) this.f16088b;
                ei eiVar = (ei) this.f16089c;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = liVar.G1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(eiVar.f24620c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new no(5, liVar, eiVar), 66);
                return;
            case 6:
                wi wiVar = (wi) this.f16088b;
                MessagesController messagesController = (MessagesController) this.f16089c;
                Long l10 = (Long) obj;
                boolean z4 = false;
                wiVar.f30285g0 = false;
                if (l10 == null) {
                    user = null;
                } else {
                    user = messagesController.getUser(l10);
                }
                wiVar.f30284f0 = user;
                if (user == null) {
                    z4 = true;
                }
                wiVar.f30286h0 = z4;
                if (user != null) {
                    wiVar.O();
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f16088b;
                ((org.telegram.ui.ActionBar.d2) this.f16089c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    da E = da.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.K = a2;
                    t9 t9Var = E.Z0;
                    if (t9Var != null) {
                        t9Var.setDialogId(a2);
                    }
                    E.R(null);
                    return;
                }
                return;
            default:
                Boolean bool3 = (Boolean) obj;
                w81.f0((w81) this.f16088b, (TLRPC.TL_attachMenuBot) this.f16089c);
                return;
        }
    }
}
