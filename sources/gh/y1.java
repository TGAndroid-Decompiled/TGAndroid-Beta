package gh;

import kh.mb;
import kh.rb;
import kh.wb;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ho;
public final class y1 implements d5.d {
    public final int f9195a;
    public final long f9196b;
    public final Object f9197c;
    public final Object d;
    public final Object f9198e;

    public y1(ih.v6 v6Var, d5.d dVar, long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.f9195a = 3;
        this.f9197c = v6Var;
        this.f9198e = dVar;
        this.f9196b = j10;
        this.d = tL_premium_boostsStatus;
    }

    @Override
    public final void accept(Object obj) {
        bg.i2 i2Var;
        int i9 = this.f9195a;
        long j10 = this.f9196b;
        Object obj2 = this.d;
        Object obj3 = this.f9198e;
        Object obj4 = this.f9197c;
        switch (i9) {
            case 0:
                k5.C0((k5) obj4, (TL_stories.TL_premium_boostsStatus) obj2, this.f9196b, (MessagesController) obj3, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 1:
                ih.r rVar = (ih.r) obj4;
                ih.q qVar = (ih.q) obj3;
                ((org.telegram.ui.ActionBar.c2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    wb E = wb.E(rVar.f12019a0.getParentActivity(), rVar.f12027f);
                    E.J = j10;
                    mb mbVar = E.Y0;
                    if (mbVar != null) {
                        mbVar.setDialogId(j10);
                    }
                    E.I = false;
                    E.R(rb.c(qVar));
                    return;
                }
                return;
            case 2:
                ih.v6 v6Var = (ih.v6) obj4;
                d5.d dVar = (d5.d) obj2;
                MessagesController messagesController = (MessagesController) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus == null) {
                    dVar.accept(Boolean.FALSE);
                    return;
                }
                ChannelBoostsController boostsController = messagesController.getBoostsController();
                long j11 = this.f9196b;
                boostsController.userCanBoostChannel(j11, tL_premium_boostsStatus, new y1(v6Var, dVar, j11, tL_premium_boostsStatus));
                dVar.accept(Boolean.FALSE);
                return;
            case 3:
                ih.v6 v6Var2 = (ih.v6) obj4;
                d5.d dVar2 = (d5.d) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                if (canApplyBoost == null) {
                    dVar2.accept(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (v6Var2.j(j10)) {
                    i2Var = new bg.i2(v6Var2, j10, 6);
                } else {
                    i2Var = null;
                }
                int i10 = zf.j0.R0;
                if (R != null && tL_premium_boostsStatus2 != null && R.getContext() != null) {
                    zf.j0 j0Var = new zf.j0(18, R.getCurrentAccount(), R.getContext(), R, R.getResourceProvider());
                    j0Var.G1(canApplyBoost);
                    j0Var.F1(tL_premium_boostsStatus2, true);
                    j0Var.H1(j10);
                    j0Var.M0 = i2Var;
                    j0Var.show();
                }
                dVar2.accept(Boolean.FALSE);
                return;
            default:
                ho.X((ho) obj4, (org.telegram.ui.ActionBar.c2) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.f9196b, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }

    public y1(ih.v6 v6Var, d5.d dVar, MessagesController messagesController, long j10) {
        this.f9195a = 2;
        this.f9197c = v6Var;
        this.d = dVar;
        this.f9198e = messagesController;
        this.f9196b = j10;
    }

    public y1(Object obj, Object obj2, long j10, Object obj3, int i9) {
        this.f9195a = i9;
        this.f9197c = obj;
        this.d = obj2;
        this.f9196b = j10;
        this.f9198e = obj3;
    }

    public y1(ho hoVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10) {
        this.f9195a = 4;
        this.f9197c = hoVar;
        this.f9198e = c2Var;
        this.d = tL_premium_boostsStatus;
        this.f9196b = j10;
    }
}
