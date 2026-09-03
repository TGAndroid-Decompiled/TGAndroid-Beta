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
import org.telegram.ui.zn;
public final class y0 implements Runnable {
    public final int f6801a;
    public final long f6802b;
    public final zn f6803c;

    public y0(long j10, zn znVar) {
        this.f6801a = 1;
        this.f6802b = j10;
        this.f6803c = znVar;
    }

    @Override
    public final void run() {
        switch (this.f6801a) {
            case 0:
                qc.a0(this.f6803c).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f6802b)), R.raw.stars_topup).k(true);
                return;
            case 1:
                this.f6803c.presentFragment(new ProfileActivity(kf.k0.g(this.f6802b, "user_id"), null));
                return;
            case 2:
                r0.getMediaDataController().loadBotInfo(this.f6802b, r1, true, this.f6803c.classGuid);
                return;
            case 3:
                this.f6803c.getMessagesController().loadFullChat(this.f6802b, 0, true);
                return;
            case 4:
                zn znVar = this.f6803c;
                LongSparseIntArray longSparseIntArray = znVar.J5;
                long j10 = this.f6802b;
                longSparseIntArray.put(j10, 0);
                w21 w21Var = znVar.O1;
                if (w21Var != null) {
                    w21Var.setAllTopicsHidden(false);
                }
                if (j10 == znVar.f40514a4) {
                    znVar.f40800x0.O(false);
                    return;
                }
                return;
            case 5:
                zn znVar2 = this.f6803c;
                znVar2.getClass();
                znVar2.presentFragment(zn.R9(this.f6802b));
                return;
            case 6:
                zn znVar3 = this.f6803c;
                znVar3.getClass();
                znVar3.presentFragment(ProfileActivity.m4(this.f6802b));
                return;
            default:
                zn znVar4 = this.f6803c;
                ic v = qc.v(znVar4.getParentActivity(), znVar4, null, 1, this.f6802b, 1, znVar4.getThemedColor(j6.Fi), znVar4.getThemedColor(j6.Hi), 5000, true, null);
                v.f25672k = true;
                v.k(true);
                return;
        }
    }

    public y0(zn znVar, long j10, int i10) {
        this.f6801a = i10;
        this.f6803c = znVar;
        this.f6802b = j10;
    }
}
