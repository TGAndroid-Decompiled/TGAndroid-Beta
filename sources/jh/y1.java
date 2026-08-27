package jh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import lh.ib;
import lh.sb;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.zh;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fe;
import org.telegram.ui.gg;
import org.telegram.ui.nc;
import org.telegram.ui.oc;
import org.telegram.ui.rd;
import org.telegram.ui.rn;
import org.telegram.ui.x71;
import org.telegram.ui.xc;

public final class y1 implements d5.d {

    public final int f14147a;

    public final Object f14148b;

    public final Object f14149c;

    public y1(int i10, Object obj, Object obj2) {
        this.f14147a = i10;
        this.f14148b = obj;
        this.f14149c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f14147a) {
            case 0:
                e4 e4Var = (e4) this.f14148b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.f14149c;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                e4Var.G3 = canApplyBoost;
                ag.i1.C1(new ag.r2(e4Var, 4), tL_premium_boostsStatus, canApplyBoost, e4Var.f13291x1, true);
                i9 i9Var = e4Var.F0;
                if (i9Var != null) {
                    i9Var.f13482g1 = false;
                    i9Var.P();
                }
                break;
            case 1:
                xc xcVar = (xc) this.f14148b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f14149c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                xcVar.f44384c = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    int i10 = tL_premium_boostsStatus2.level;
                    xcVar.f44382b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                xcVar.X0(true);
                lh.d dVar = xcVar.L;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                break;
            case 2:
                oc ocVar = (oc) this.f14148b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f14149c;
                View view = (View) obj;
                ocVar.getClass();
                if (view instanceof nc) {
                    nc ncVar = (nc) view;
                    ncVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, ocVar.f41057a));
                    ocVar.f41058b.getClass();
                    int iR = RecyclerView.R(view);
                    if (peerColors != null && iR >= 0 && iR < peerColors.colors.size()) {
                        ncVar.a(peerColors.colors.get(iR));
                        break;
                    }
                }
                break;
            case 3:
                fe feVar = (fe) this.f14148b;
                ag.i1 i1Var = (ag.i1) this.f14149c;
                i1Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                feVar.f38097s0.showDialog(i1Var);
                break;
            case 4:
                rn rnVar = (rn) this.f14148b;
                rd rdVar = (rd) this.f14149c;
                rnVar.f42051fb = true;
                rdVar.run();
                break;
            case 5:
                gi giVar = (gi) this.f14148b;
                zh zhVar = (zh) this.f14149c;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = giVar.F1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(zhVar.f35239c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new gg(9, giVar, zhVar), 66);
                break;
            case 6:
                ri riVar = (ri) this.f14148b;
                MessagesController messagesController = (MessagesController) this.f14149c;
                Long l10 = (Long) obj;
                riVar.f32176f0 = false;
                TLRPC.User user = l10 == null ? null : messagesController.getUser(l10);
                riVar.f32175e0 = user;
                riVar.f32177g0 = user == null;
                if (user != null) {
                    riVar.O();
                }
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f14148b;
                ((org.telegram.ui.ActionBar.b2) this.f14149c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    sb sbVarE = sb.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long jA = profileActivity.a();
                    sbVarE.J = jA;
                    ib ibVar = sbVarE.Y0;
                    if (ibVar != null) {
                        ibVar.setDialogId(jA);
                    }
                    sbVarE.R(null);
                }
                break;
            default:
                x71.f0((x71) this.f14148b, (TLRPC.TL_attachMenuBot) this.f14149c);
                break;
        }
    }
}
