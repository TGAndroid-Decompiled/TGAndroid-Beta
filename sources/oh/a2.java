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
import org.telegram.ui.ke;
import org.telegram.ui.lo;
import org.telegram.ui.qc;
import org.telegram.ui.rc;
import org.telegram.ui.v81;
import org.telegram.ui.xc;
import org.telegram.ui.xn;
import qh.ba;
public final class a2 implements h5.d {
    public final int f16839a;
    public final Object f16840b;
    public final Object f16841c;

    public a2(int i10, Object obj, Object obj2) {
        this.f16839a = i10;
        this.f16840b = obj;
        this.f16841c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        switch (this.f16839a) {
            case 0:
                f4 f4Var = (f4) this.f16840b;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                f4Var.H3 = canApplyBoost;
                fg.v0.C1(new fg.x1(f4Var, 4), (TL_stories.TL_premium_boostsStatus) this.f16841c, canApplyBoost, f4Var.f17130y1, true);
                i9 i9Var = f4Var.G0;
                if (i9Var != null) {
                    i9Var.f17274h1 = false;
                    i9Var.P();
                    return;
                }
                return;
            case 1:
                bd bdVar = (bd) this.f16840b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f16841c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                bdVar.f35440c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    bdVar.f35438b = i10;
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
                rc rcVar = (rc) this.f16840b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f16841c;
                View view = (View) obj;
                rcVar.getClass();
                if (view instanceof qc) {
                    qc qcVar = (qc) view;
                    qcVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, rcVar.f40809a));
                    rcVar.f40810b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        qcVar.a(peerColors.colors.get(R));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                fg.v0 v0Var = (fg.v0) this.f16841c;
                v0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                ((ke) this.f16840b).f38279t0.showDialog(v0Var);
                return;
            case 4:
                Boolean bool = (Boolean) obj;
                ((xn) this.f16840b).f43180gb = true;
                ((xc) this.f16841c).run();
                return;
            case 5:
                mi miVar = (mi) this.f16840b;
                fi fiVar = (fi) this.f16841c;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = miVar.G1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(fiVar.f26923c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new lo(5, miVar, fiVar), 66);
                return;
            case 6:
                xi xiVar = (xi) this.f16840b;
                MessagesController messagesController = (MessagesController) this.f16841c;
                Long l10 = (Long) obj;
                boolean z4 = false;
                xiVar.f33103g0 = false;
                if (l10 == null) {
                    user = null;
                } else {
                    user = messagesController.getUser(l10);
                }
                xiVar.f33102f0 = user;
                if (user == null) {
                    z4 = true;
                }
                xiVar.f33104h0 = z4;
                if (user != null) {
                    xiVar.O();
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f16840b;
                ((org.telegram.ui.ActionBar.d2) this.f16841c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ba E = ba.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.K = a2;
                    qh.q9 q9Var = E.Z0;
                    if (q9Var != null) {
                        q9Var.setDialogId(a2);
                    }
                    E.R(null);
                    return;
                }
                return;
            default:
                Boolean bool3 = (Boolean) obj;
                v81.f0((v81) this.f16840b, (TLRPC.TL_attachMenuBot) this.f16841c);
                return;
        }
    }
}
