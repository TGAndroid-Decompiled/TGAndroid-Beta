package m4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.ce;
import bi.qd;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.yi;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cd;
import org.telegram.ui.eo;
import org.telegram.ui.k91;
import org.telegram.ui.le;
import org.telegram.ui.sc;
import org.telegram.ui.tc;
import zh.a3;
import zh.u7;
public final class q0 implements e2.h {
    public final int f13477a;
    public final Object f13478b;
    public final Object f13479c;

    public q0(int i10, Object obj, Object obj2) {
        this.f13477a = i10;
        this.f13478b = obj;
        this.f13479c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        switch (this.f13477a) {
            case 0:
                h1 h1Var = (h1) this.f13478b;
                b2.q1 q1Var = (b2.q1) this.f13479c;
                l1 l1Var = (l1) obj;
                h1Var.getClass();
                e9.k0 k0Var = q1Var.D;
                if (!k0Var.isEmpty()) {
                    b2.p1 c10 = q1Var.a().c();
                    e9.o1 it = k0Var.values().iterator();
                    while (it.hasNext()) {
                        b2.m1 m1Var = (b2.m1) it.next();
                        b2.l1 l1Var2 = (b2.l1) h1Var.d.f7451n.get(m1Var.f1811a.f1785b);
                        if (l1Var2 != null && m1Var.f1811a.f1784a == l1Var2.f1784a) {
                            c10.a(new b2.m1(l1Var2, m1Var.f1812b));
                        } else {
                            c10.a(m1Var);
                        }
                    }
                    q1Var = c10.b();
                }
                l1Var.q(q1Var);
                return;
            case 1:
                r rVar = (r) this.f13479c;
                l1 l1Var3 = (l1) obj;
                b0 b0Var = (b0) ((h1) this.f13478b).f13375a.get();
                if (b0Var != null && !b0Var.j()) {
                    b0Var.g(rVar, false);
                    return;
                }
                return;
            case 2:
                cd cdVar = (cd) this.f13478b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f13479c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                cdVar.f31612c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    cdVar.f31610b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                cdVar.X0(true);
                bi.d dVar = cdVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 3:
                tc tcVar = (tc) this.f13478b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f13479c;
                View view = (View) obj;
                tcVar.getClass();
                if (view instanceof sc) {
                    sc scVar = (sc) view;
                    scVar.setBackgroundColor(j6.v0(j6.f17928d6, tcVar.f36899a));
                    tcVar.f36900b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        scVar.a(peerColors.colors.get(R));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                qg.k0 k0Var2 = (qg.k0) this.f13479c;
                k0Var2.G1((ChannelBoostsController.CanApplyBoost) obj);
                ((le) this.f13478b).f34683w0.showDialog(k0Var2);
                return;
            case 5:
                Boolean bool = (Boolean) obj;
                ((eo) this.f13478b).f32377jb = true;
                ((org.telegram.ui.n) this.f13479c).run();
                return;
            case 6:
                yi yiVar = (yi) this.f13478b;
                ri riVar = (ri) this.f13479c;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = yiVar.J1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(riVar.f26672c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new th(0, yiVar, riVar), 66);
                return;
            case 7:
                jj jjVar = (jj) this.f13478b;
                MessagesController messagesController = (MessagesController) this.f13479c;
                Long l4 = (Long) obj;
                boolean z10 = false;
                jjVar.f24418j0 = false;
                if (l4 == null) {
                    user = null;
                } else {
                    user = messagesController.getUser(l4);
                }
                jjVar.f24417i0 = user;
                if (user == null) {
                    z10 = true;
                }
                jjVar.f24419k0 = z10;
                if (user != null) {
                    jjVar.O();
                    return;
                }
                return;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.f13478b;
                ((d2) this.f13479c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ce E = ce.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.N = a2;
                    qd qdVar = E.f2439c1;
                    if (qdVar != null) {
                        qdVar.setDialogId(a2);
                    }
                    E.R(null);
                    return;
                }
                return;
            case 9:
                Boolean bool3 = (Boolean) obj;
                k91.V((k91) this.f13478b, (TLRPC.TL_attachMenuBot) this.f13479c);
                return;
            case 10:
                a5.a aVar = (a5.a) this.f13478b;
                ((u2.m0) obj).d(aVar.f275b, (u2.g0) aVar.f276c, (u2.c0) this.f13479c);
                return;
            default:
                a3 a3Var = (a3) this.f13478b;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                a3Var.K3 = canApplyBoost;
                qg.k0.C1(new bi.o1(a3Var, 11), (TL_stories.TL_premium_boostsStatus) this.f13479c, canApplyBoost, a3Var.B1, true);
                u7 u7Var = a3Var.J0;
                if (u7Var != null) {
                    u7Var.f48943k1 = false;
                    u7Var.P();
                    return;
                }
                return;
        }
    }
}
