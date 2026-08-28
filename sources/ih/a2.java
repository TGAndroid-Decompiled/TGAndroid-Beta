package ih;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kh.mb;
import kh.wb;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.vi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fe;
import org.telegram.ui.mc;
import org.telegram.ui.nc;
import org.telegram.ui.qn;
import org.telegram.ui.rc;
import org.telegram.ui.rd;
import org.telegram.ui.xc;
import org.telegram.ui.z71;
public final class a2 implements d5.d {
    public final int f11213a;
    public final Object f11214b;
    public final Object f11215c;

    public a2(int i9, Object obj, Object obj2) {
        this.f11213a = i9;
        this.f11214b = obj;
        this.f11215c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        switch (this.f11213a) {
            case 0:
                i4 i4Var = (i4) this.f11214b;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                i4Var.G3 = canApplyBoost;
                zf.j0.C1(new bg.i1(i4Var, 3), (TL_stories.TL_premium_boostsStatus) this.f11215c, canApplyBoost, i4Var.f11604x1, true);
                m9 m9Var = i4Var.F0;
                if (m9Var != null) {
                    m9Var.f11801g1 = false;
                    m9Var.P();
                    return;
                }
                return;
            case 1:
                xc xcVar = (xc) this.f11214b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f11215c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                xcVar.f44464c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i9 = tL_premium_boostsStatus.level;
                    xcVar.f44462b = i9;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i9;
                    }
                }
                xcVar.X0(true);
                kh.d dVar = xcVar.L;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 2:
                nc ncVar = (nc) this.f11214b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f11215c;
                View view = (View) obj;
                ncVar.getClass();
                if (view instanceof mc) {
                    mc mcVar = (mc) view;
                    mcVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, ncVar.f40692a));
                    ncVar.f40693b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        mcVar.a(peerColors.colors.get(R));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                zf.j0 j0Var = (zf.j0) this.f11215c;
                j0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                ((fe) this.f11214b).f38235s0.showDialog(j0Var);
                return;
            case 4:
                Boolean bool = (Boolean) obj;
                ((qn) this.f11214b).f41915fb = true;
                ((rd) this.f11215c).run();
                return;
            case 5:
                ki kiVar = (ki) this.f11214b;
                di diVar = (di) this.f11215c;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i10 = kiVar.F1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i10).getInputUser(diVar.f27740c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_toggleBotInAttachMenu, new rc(12, kiVar, diVar), 66);
                return;
            case 6:
                vi viVar = (vi) this.f11214b;
                MessagesController messagesController = (MessagesController) this.f11215c;
                Long l10 = (Long) obj;
                boolean z10 = false;
                viVar.f33374f0 = false;
                if (l10 == null) {
                    user = null;
                } else {
                    user = messagesController.getUser(l10);
                }
                viVar.f33373e0 = user;
                if (user == null) {
                    z10 = true;
                }
                viVar.f33375g0 = z10;
                if (user != null) {
                    viVar.N();
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.f11214b;
                ((org.telegram.ui.ActionBar.c2) this.f11215c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    wb E = wb.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.J = a2;
                    mb mbVar = E.Y0;
                    if (mbVar != null) {
                        mbVar.setDialogId(a2);
                    }
                    E.R(null);
                    return;
                }
                return;
            default:
                Boolean bool3 = (Boolean) obj;
                z71.e0((z71) this.f11214b, (TLRPC.TL_attachMenuBot) this.f11215c);
                return;
        }
    }
}
