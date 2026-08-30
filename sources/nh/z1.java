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
import org.telegram.ui.bd;
import org.telegram.ui.ke;
import org.telegram.ui.lo;
import org.telegram.ui.o81;
import org.telegram.ui.rc;
import org.telegram.ui.sc;
import org.telegram.ui.xn;
import org.telegram.ui.yb;
import ph.da;
import ph.t9;
public final class z1 implements h5.d {
    public final int f16107a;
    public final Object f16108b;
    public final Object f16109c;

    public z1(int i10, Object obj, Object obj2) {
        this.f16107a = i10;
        this.f16108b = obj;
        this.f16109c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        switch (this.f16107a) {
            case 0:
                d4 d4Var = (d4) this.f16108b;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                d4Var.H3 = canApplyBoost;
                eg.v0.C1(new eg.y1(d4Var, 4), (TL_stories.TL_premium_boostsStatus) this.f16109c, canApplyBoost, d4Var.f15258y1, true);
                i9 i9Var = d4Var.G0;
                if (i9Var != null) {
                    i9Var.f15467h1 = false;
                    i9Var.P();
                    return;
                }
                return;
            case 1:
                bd bdVar = (bd) this.f16108b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f16109c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                bdVar.f32914c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    bdVar.f32912b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                bdVar.X0(true);
                ph.d dVar = bdVar.M;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 2:
                sc scVar = (sc) this.f16108b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f16109c;
                View view = (View) obj;
                scVar.getClass();
                if (view instanceof rc) {
                    rc rcVar = (rc) view;
                    rcVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, scVar.f38291a));
                    scVar.f38292b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        rcVar.a(peerColors.colors.get(R));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                eg.v0 v0Var = (eg.v0) this.f16109c;
                v0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                ((ke) this.f16108b).f35648t0.showDialog(v0Var);
                return;
            case 4:
                Boolean bool = (Boolean) obj;
                ((xn) this.f16108b).f40033gb = true;
                ((yb) this.f16109c).run();
                return;
            case 5:
                li liVar = (li) this.f16108b;
                ei eiVar = (ei) this.f16109c;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = liVar.G1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(eiVar.f24587c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new lo(5, liVar, eiVar), 66);
                return;
            case 6:
                wi wiVar = (wi) this.f16108b;
                MessagesController messagesController = (MessagesController) this.f16109c;
                Long l10 = (Long) obj;
                boolean z4 = false;
                wiVar.f30363g0 = false;
                if (l10 == null) {
                    user = null;
                } else {
                    user = messagesController.getUser(l10);
                }
                wiVar.f30362f0 = user;
                if (user == null) {
                    z4 = true;
                }
                wiVar.f30364h0 = z4;
                if (user != null) {
                    wiVar.O();
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f16108b;
                ((org.telegram.ui.ActionBar.d2) this.f16109c).dismiss();
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
                o81.f0((o81) this.f16108b, (TLRPC.TL_attachMenuBot) this.f16109c);
                return;
        }
    }
}
