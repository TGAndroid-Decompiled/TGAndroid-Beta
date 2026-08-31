package hg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.x21;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
public final class y0 implements Runnable {
    public final int f7672a;
    public final long f7673b;
    public final xn f7674c;

    public y0(long j10, xn xnVar) {
        this.f7672a = 1;
        this.f7673b = j10;
        this.f7674c = xnVar;
    }

    @Override
    public final void run() {
        switch (this.f7672a) {
            case 0:
                qc.a0(this.f7674c).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f7673b)), R.raw.stars_topup).k(true);
                return;
            case 1:
                this.f7674c.presentFragment(new ProfileActivity(l.d.g(this.f7673b, "user_id"), null));
                return;
            case 2:
                r0.getMediaDataController().loadBotInfo(this.f7673b, r1, true, this.f7674c.classGuid);
                return;
            case 3:
                this.f7674c.getMessagesController().loadFullChat(this.f7673b, 0, true);
                return;
            case 4:
                xn xnVar = this.f7674c;
                LongSparseIntArray longSparseIntArray = xnVar.J5;
                long j10 = this.f7673b;
                longSparseIntArray.put(j10, 0);
                x21 x21Var = xnVar.O1;
                if (x21Var != null) {
                    x21Var.setAllTopicsHidden(false);
                }
                if (j10 == xnVar.f43116a4) {
                    xnVar.f43403x0.O(false);
                    return;
                }
                return;
            case 5:
                xn xnVar2 = this.f7674c;
                xnVar2.getClass();
                xnVar2.presentFragment(xn.R9(this.f7673b));
                return;
            case 6:
                xn xnVar3 = this.f7674c;
                xnVar3.getClass();
                xnVar3.presentFragment(ProfileActivity.m4(this.f7673b));
                return;
            default:
                xn xnVar4 = this.f7674c;
                ic v = qc.v(xnVar4.getParentActivity(), xnVar4, null, 1, this.f7673b, 1, xnVar4.getThemedColor(k6.Fi), xnVar4.getThemedColor(k6.Hi), 5000, true, null);
                v.f27746k = true;
                v.k(true);
                return;
        }
    }

    public y0(xn xnVar, long j10, int i10) {
        this.f7672a = i10;
        this.f7674c = xnVar;
        this.f7673b = j10;
    }
}
