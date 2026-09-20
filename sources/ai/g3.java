package ai;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
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
import org.telegram.ui.i91;
import org.telegram.ui.ke;
import org.telegram.ui.oo;
import org.telegram.ui.zn;
public final class g3 implements e2.h {
    public final int f895a;
    public final Object f896b;
    public final Object f897c;

    public g3(int i10, Object obj, Object obj2) {
        this.f895a = i10;
        this.f896b = obj;
        this.f897c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        switch (this.f895a) {
            case 0:
                f6 f6Var = (f6) this.f896b;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                f6Var.K3 = canApplyBoost;
                rg.j0.C1(new y3(f6Var, 0), (TL_stories.TL_premium_boostsStatus) this.f897c, canApplyBoost, f6Var.B1, true);
                jc jcVar = f6Var.J0;
                if (jcVar != null) {
                    jcVar.f1092k1 = false;
                    jcVar.P();
                    return;
                }
                return;
            case 1:
                m4.f1 f1Var = (m4.f1) this.f896b;
                b2.q1 q1Var = (b2.q1) this.f897c;
                m4.j1 j1Var = (m4.j1) obj;
                f1Var.getClass();
                e9.k0 k0Var = q1Var.D;
                if (!k0Var.isEmpty()) {
                    b2.p1 c10 = q1Var.a().c();
                    e9.o1 it = k0Var.values().iterator();
                    while (it.hasNext()) {
                        b2.m1 m1Var = (b2.m1) it.next();
                        b2.l1 l1Var = (b2.l1) f1Var.d.f8151n.get(m1Var.f3118a.f3092b);
                        if (l1Var != null && m1Var.f3118a.f3091a == l1Var.f3091a) {
                            c10.a(new b2.m1(l1Var, m1Var.f3119b));
                        } else {
                            c10.a(m1Var);
                        }
                    }
                    q1Var = c10.b();
                }
                j1Var.q(q1Var);
                return;
            case 2:
                m4.r rVar = (m4.r) this.f897c;
                m4.j1 j1Var2 = (m4.j1) obj;
                m4.a0 a0Var = (m4.a0) ((m4.f1) this.f896b).f14731a.get();
                if (a0Var != null && !a0Var.j()) {
                    a0Var.g(rVar, false);
                    return;
                }
                return;
            case 3:
                bd bdVar = (bd) this.f896b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f897c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                bdVar.f32358c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    bdVar.f32356b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                bdVar.X0(true);
                ci.d dVar = bdVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.sc scVar = (org.telegram.ui.sc) this.f896b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f897c;
                View view = (View) obj;
                scVar.getClass();
                if (view instanceof org.telegram.ui.rc) {
                    org.telegram.ui.rc rcVar = (org.telegram.ui.rc) view;
                    rcVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, scVar.f37368a));
                    scVar.f37369b.getClass();
                    int S = RecyclerView.S(view);
                    if (peerColors != null && S >= 0 && S < peerColors.colors.size()) {
                        rcVar.a(peerColors.colors.get(S));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                rg.j0 j0Var = (rg.j0) this.f897c;
                j0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                ((ke) this.f896b).f35153w0.showDialog(j0Var);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((zn) this.f896b).f40353ib = true;
                ((org.telegram.ui.ActionBar.c6) this.f897c).run();
                return;
            case 7:
                vi viVar = (vi) this.f896b;
                oi oiVar = (oi) this.f897c;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = viVar.J1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(oiVar.f26941c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new oo(5, viVar, oiVar), 66);
                return;
            case 8:
                gj gjVar = (gj) this.f896b;
                MessagesController messagesController = (MessagesController) this.f897c;
                Long l4 = (Long) obj;
                boolean z10 = false;
                gjVar.f24369j0 = false;
                if (l4 == null) {
                    user = null;
                } else {
                    user = messagesController.getUser(l4);
                }
                gjVar.f24368i0 = user;
                if (user == null) {
                    z10 = true;
                }
                gjVar.f24370k0 = z10;
                if (user != null) {
                    gjVar.O();
                    return;
                }
                return;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.f896b;
                ((org.telegram.ui.ActionBar.b2) this.f897c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ci.oc E = ci.oc.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.N = a2;
                    ci.ec ecVar = E.f5214c1;
                    if (ecVar != null) {
                        ecVar.setDialogId(a2);
                    }
                    E.R(null);
                    return;
                }
                return;
            case 10:
                Boolean bool3 = (Boolean) obj;
                i91.V((i91) this.f896b, (TLRPC.TL_attachMenuBot) this.f897c);
                return;
            default:
                a5.a aVar = (a5.a) this.f896b;
                ((u2.l0) obj).d(aVar.f277b, (u2.f0) aVar.f278c, (u2.b0) this.f897c);
                return;
        }
    }
}
