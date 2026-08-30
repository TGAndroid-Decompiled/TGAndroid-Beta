package gg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w21;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class y0 implements Runnable {
    public final int f6814a;
    public final long f6815b;
    public final xn f6816c;

    public y0(long j10, xn xnVar) {
        this.f6814a = 1;
        this.f6815b = j10;
        this.f6816c = xnVar;
    }

    @Override
    public final void run() {
        switch (this.f6814a) {
            case 0:
                qc.a0(this.f6816c).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f6815b)), R.raw.stars_topup).k(true);
                return;
            case 1:
                this.f6816c.presentFragment(new ProfileActivity(kh.a2.g(this.f6815b, "user_id"), null));
                return;
            case 2:
                r0.getMediaDataController().loadBotInfo(this.f6815b, r1, true, this.f6816c.classGuid);
                return;
            case 3:
                this.f6816c.getMessagesController().loadFullChat(this.f6815b, 0, true);
                return;
            case 4:
                xn xnVar = this.f6816c;
                LongSparseIntArray longSparseIntArray = xnVar.J5;
                long j10 = this.f6815b;
                longSparseIntArray.put(j10, 0);
                w21 w21Var = xnVar.O1;
                if (w21Var != null) {
                    w21Var.setAllTopicsHidden(false);
                }
                if (j10 == xnVar.f39948a4) {
                    xnVar.f40234x0.O(false);
                    return;
                }
                return;
            case 5:
                xn xnVar2 = this.f6816c;
                xnVar2.getClass();
                xnVar2.presentFragment(xn.R9(this.f6815b));
                return;
            case 6:
                xn xnVar3 = this.f6816c;
                xnVar3.getClass();
                xnVar3.presentFragment(ProfileActivity.m4(this.f6815b));
                return;
            default:
                xn xnVar4 = this.f6816c;
                ic v = qc.v(xnVar4.getParentActivity(), xnVar4, null, 1, this.f6815b, 1, xnVar4.getThemedColor(j6.Fi), xnVar4.getThemedColor(j6.Hi), 5000, true, null);
                v.f25673k = true;
                v.k(true);
                return;
        }
    }

    public y0(xn xnVar, long j10, int i10) {
        this.f6814a = i10;
        this.f6816c = xnVar;
        this.f6815b = j10;
    }
}
