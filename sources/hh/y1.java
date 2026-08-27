package hh;

import lh.nb;
import lh.sb;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jo;

public final class y1 implements d5.d {

    public final int f10357a;

    public final long f10358b;

    public final Object f10359c;
    public final Object d;

    public final Object f10360e;

    public y1(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f10357a = i10;
        this.f10359c = obj;
        this.d = obj2;
        this.f10358b = j10;
        this.f10360e = obj3;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f10357a;
        long j10 = this.f10358b;
        Object obj2 = this.d;
        Object obj3 = this.f10360e;
        Object obj4 = this.f10359c;
        switch (i10) {
            case 0:
                i5.D0((i5) obj4, (TL_stories.TL_premium_boostsStatus) obj2, this.f10358b, (MessagesController) obj3, (ChannelBoostsController.CanApplyBoost) obj);
                break;
            case 1:
                jh.p pVar = (jh.p) obj4;
                jh.o oVar = (jh.o) obj3;
                ((org.telegram.ui.ActionBar.b2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    sb sbVarE = sb.E(pVar.f13772a0.getParentActivity(), pVar.f13780f);
                    sbVarE.J = j10;
                    lh.ib ibVar = sbVarE.Y0;
                    if (ibVar != null) {
                        ibVar.setDialogId(j10);
                    }
                    sbVarE.I = false;
                    sbVarE.R(nb.c(oVar));
                }
                break;
            case 2:
                jh.s6 s6Var = (jh.s6) obj4;
                d5.d dVar = (d5.d) obj2;
                MessagesController messagesController = (MessagesController) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    ChannelBoostsController boostsController = messagesController.getBoostsController();
                    long j11 = this.f10358b;
                    boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new y1(s6Var, dVar, j11, tL_premium_boostsStatus));
                    dVar.accept(Boolean.FALSE);
                } else {
                    dVar.accept(Boolean.FALSE);
                }
                break;
            case 3:
                jh.s6 s6Var2 = (jh.s6) obj4;
                d5.d dVar2 = (d5.d) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost != null) {
                    org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                    cg.b2 b2Var = s6Var2.j(j10) ? new cg.b2(s6Var2, j10, 7) : null;
                    int i11 = ag.i1.R0;
                    if (n2VarR != null && tL_premium_boostsStatus2 != null && n2VarR.getContext() != null) {
                        ag.i1 i1Var = new ag.i1(18, n2VarR.getCurrentAccount(), n2VarR.getContext(), n2VarR, n2VarR.getResourceProvider());
                        i1Var.G1(canApplyBoost);
                        i1Var.F1(tL_premium_boostsStatus2, true);
                        i1Var.H1(j10);
                        i1Var.M0 = b2Var;
                        i1Var.show();
                    }
                    dVar2.accept(Boolean.FALSE);
                } else {
                    dVar2.accept(Boolean.FALSE);
                }
                break;
            default:
                jo.Y((jo) obj4, (org.telegram.ui.ActionBar.b2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f10358b, (ChannelBoostsController.CanApplyBoost) obj);
                break;
        }
    }

    public y1(jh.s6 s6Var, d5.d dVar, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.f10357a = 3;
        this.f10359c = s6Var;
        this.f10360e = dVar;
        this.f10358b = j10;
        this.d = tL_premium_boostsStatus;
    }

    public y1(jh.s6 s6Var, d5.d dVar, MessagesController messagesController, long j10) {
        this.f10357a = 2;
        this.f10359c = s6Var;
        this.d = dVar;
        this.f10360e = messagesController;
        this.f10358b = j10;
    }

    public y1(jo joVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10) {
        this.f10357a = 4;
        this.f10359c = joVar;
        this.f10360e = b2Var;
        this.d = tL_premium_boostsStatus;
        this.f10358b = j10;
    }
}
