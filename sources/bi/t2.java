package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.fc;
import di.pc;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.vi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
import org.telegram.ui.co;
import org.telegram.ui.i91;
import org.telegram.ui.ke;
import org.telegram.ui.rc;
import org.telegram.ui.ro;
import org.telegram.ui.sc;
public final class t2 implements e2.h {
    public final int f3726a;
    public final Object f3727b;
    public final Object f3728c;

    public t2(int i10, Object obj, Object obj2) {
        this.f3726a = i10;
        this.f3727b = obj;
        this.f3728c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        switch (this.f3726a) {
            case 0:
                o5 o5Var = (o5) this.f3727b;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                o5Var.K3 = canApplyBoost;
                sg.k0.C1(new l3(o5Var, 0), (TL_stories.TL_premium_boostsStatus) this.f3728c, canApplyBoost, o5Var.B1, true);
                pb pbVar = o5Var.J0;
                if (pbVar != null) {
                    pbVar.f3557k1 = false;
                    pbVar.P();
                    return;
                }
                return;
            case 1:
                m4.f1 f1Var = (m4.f1) this.f3727b;
                b2.q1 q1Var = (b2.q1) this.f3728c;
                m4.j1 j1Var = (m4.j1) obj;
                f1Var.getClass();
                e9.k0 k0Var = q1Var.D;
                if (!k0Var.isEmpty()) {
                    b2.p1 c10 = q1Var.a().c();
                    e9.o1 it = k0Var.values().iterator();
                    while (it.hasNext()) {
                        b2.m1 m1Var = (b2.m1) it.next();
                        b2.l1 l1Var = (b2.l1) f1Var.d.f9031n.get(m1Var.f2171a.f2143b);
                        if (l1Var != null && m1Var.f2171a.f2142a == l1Var.f2142a) {
                            c10.a(new b2.m1(l1Var, m1Var.f2172b));
                        } else {
                            c10.a(m1Var);
                        }
                    }
                    q1Var = c10.b();
                }
                j1Var.q(q1Var);
                return;
            case 2:
                m4.r rVar = (m4.r) this.f3728c;
                m4.j1 j1Var2 = (m4.j1) obj;
                m4.a0 a0Var = (m4.a0) ((m4.f1) this.f3727b).f15890a.get();
                if (a0Var != null && !a0Var.j()) {
                    a0Var.g(rVar, false);
                    return;
                }
                return;
            case 3:
                bd bdVar = (bd) this.f3727b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f3728c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                bdVar.f34738c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    bdVar.f34736b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                bdVar.X0(true);
                di.d dVar = bdVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 4:
                sc scVar = (sc) this.f3727b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f3728c;
                View view = (View) obj;
                scVar.getClass();
                if (view instanceof rc) {
                    rc rcVar = (rc) view;
                    rcVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, scVar.f40407a));
                    scVar.f40408b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        rcVar.a(peerColors.colors.get(R));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                sg.k0 k0Var2 = (sg.k0) this.f3728c;
                k0Var2.G1((ChannelBoostsController.CanApplyBoost) obj);
                ((ke) this.f3727b).f38034w0.showDialog(k0Var2);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((co) this.f3727b).f35308jb = true;
                ((org.telegram.ui.ActionBar.c6) this.f3728c).run();
                return;
            case 7:
                vi viVar = (vi) this.f3727b;
                oi oiVar = (oi) this.f3728c;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = viVar.J1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(oiVar.f29075c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new ro(5, viVar, oiVar), 66);
                return;
            case 8:
                gj gjVar = (gj) this.f3727b;
                MessagesController messagesController = (MessagesController) this.f3728c;
                Long l4 = (Long) obj;
                boolean z10 = false;
                gjVar.f26402j0 = false;
                if (l4 == null) {
                    user = null;
                } else {
                    user = messagesController.getUser(l4);
                }
                gjVar.f26401i0 = user;
                if (user == null) {
                    z10 = true;
                }
                gjVar.f26403k0 = z10;
                if (user != null) {
                    gjVar.O();
                    return;
                }
                return;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.f3727b;
                ((org.telegram.ui.ActionBar.b2) this.f3728c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    pc E = pc.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.N = a2;
                    fc fcVar = E.f7850c1;
                    if (fcVar != null) {
                        fcVar.setDialogId(a2);
                    }
                    E.R(null);
                    return;
                }
                return;
            case 10:
                Boolean bool3 = (Boolean) obj;
                i91.V((i91) this.f3727b, (TLRPC.TL_attachMenuBot) this.f3728c);
                return;
            default:
                a5.a aVar = (a5.a) this.f3727b;
                ((u2.k0) obj).d(aVar.f285b, (u2.f0) aVar.f286c, (u2.b0) this.f3728c);
                return;
        }
    }
}
