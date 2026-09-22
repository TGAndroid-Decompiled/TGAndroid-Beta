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
import org.telegram.ui.ad;
import org.telegram.ui.bo;
import org.telegram.ui.f91;
import org.telegram.ui.je;
import org.telegram.ui.qo;
public final class g3 implements e2.h {
    public final int f892a;
    public final Object f893b;
    public final Object f894c;

    public g3(int i10, Object obj, Object obj2) {
        this.f892a = i10;
        this.f893b = obj;
        this.f894c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        switch (this.f892a) {
            case 0:
                f6 f6Var = (f6) this.f893b;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                f6Var.K3 = canApplyBoost;
                rg.j0.C1(new y3(f6Var, 0), (TL_stories.TL_premium_boostsStatus) this.f894c, canApplyBoost, f6Var.B1, true);
                jc jcVar = f6Var.J0;
                if (jcVar != null) {
                    jcVar.f1089k1 = false;
                    jcVar.P();
                    return;
                }
                return;
            case 1:
                m4.g1 g1Var = (m4.g1) this.f893b;
                b2.q1 q1Var = (b2.q1) this.f894c;
                m4.k1 k1Var = (m4.k1) obj;
                g1Var.getClass();
                e9.k0 k0Var = q1Var.D;
                if (!k0Var.isEmpty()) {
                    b2.p1 c10 = q1Var.a().c();
                    e9.o1 it = k0Var.values().iterator();
                    while (it.hasNext()) {
                        b2.m1 m1Var = (b2.m1) it.next();
                        b2.l1 l1Var = (b2.l1) g1Var.d.f8148n.get(m1Var.f3115a.f3089b);
                        if (l1Var != null && m1Var.f3115a.f3088a == l1Var.f3088a) {
                            c10.a(new b2.m1(l1Var, m1Var.f3116b));
                        } else {
                            c10.a(m1Var);
                        }
                    }
                    q1Var = c10.b();
                }
                k1Var.q(q1Var);
                return;
            case 2:
                m4.r rVar = (m4.r) this.f894c;
                m4.k1 k1Var2 = (m4.k1) obj;
                m4.a0 a0Var = (m4.a0) ((m4.g1) this.f893b).f14535a.get();
                if (a0Var != null && !a0Var.j()) {
                    a0Var.g(rVar, false);
                    return;
                }
                return;
            case 3:
                ad adVar = (ad) this.f893b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f894c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                adVar.f31739c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    adVar.f31737b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                adVar.X0(true);
                ci.d dVar = adVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.rc rcVar = (org.telegram.ui.rc) this.f893b;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) this.f894c;
                View view = (View) obj;
                rcVar.getClass();
                if (view instanceof org.telegram.ui.qc) {
                    org.telegram.ui.qc qcVar = (org.telegram.ui.qc) view;
                    qcVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18834d6, rcVar.f37099a));
                    rcVar.f37100b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        qcVar.a(peerColors.colors.get(R));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                rg.j0 j0Var = (rg.j0) this.f894c;
                j0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                ((je) this.f893b).f34891w0.showDialog(j0Var);
                return;
            case 6:
                Boolean bool = (Boolean) obj;
                ((bo) this.f893b).f32342ib = true;
                ((org.telegram.ui.l4) this.f894c).run();
                return;
            case 7:
                vi viVar = (vi) this.f893b;
                oi oiVar = (oi) this.f894c;
                Boolean bool2 = (Boolean) obj;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i11 = viVar.J1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i11).getInputUser(oiVar.f26805c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_toggleBotInAttachMenu, new qo(5, viVar, oiVar), 66);
                return;
            case 8:
                gj gjVar = (gj) this.f893b;
                MessagesController messagesController = (MessagesController) this.f894c;
                Long l4 = (Long) obj;
                boolean z10 = false;
                gjVar.f24360j0 = false;
                if (l4 == null) {
                    user = null;
                } else {
                    user = messagesController.getUser(l4);
                }
                gjVar.f24359i0 = user;
                if (user == null) {
                    z10 = true;
                }
                gjVar.f24361k0 = z10;
                if (user != null) {
                    gjVar.O();
                    return;
                }
                return;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.f893b;
                ((org.telegram.ui.ActionBar.b2) this.f894c).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ci.oc E = ci.oc.E(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                    long a2 = profileActivity.a();
                    E.N = a2;
                    ci.ec ecVar = E.f5210c1;
                    if (ecVar != null) {
                        ecVar.setDialogId(a2);
                    }
                    E.R(null);
                    return;
                }
                return;
            case 10:
                Boolean bool3 = (Boolean) obj;
                f91.V((f91) this.f893b, (TLRPC.TL_attachMenuBot) this.f894c);
                return;
            default:
                a5.a aVar = (a5.a) this.f893b;
                ((u2.k0) obj).d(aVar.f277b, (u2.f0) aVar.f278c, (u2.b0) this.f894c);
                return;
        }
    }
}
