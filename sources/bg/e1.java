package bg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;
public final class e1 implements Runnable {
    public final int f1742a;
    public final long f1743b;
    public final qn f1744c;

    public e1(long j10, qn qnVar) {
        this.f1742a = 1;
        this.f1743b = j10;
        this.f1744c = qnVar;
    }

    @Override
    public final void run() {
        switch (this.f1742a) {
            case 0:
                oc.a0(this.f1744c).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f1743b)), R.raw.stars_topup).k(true);
                return;
            case 1:
                this.f1744c.presentFragment(new ProfileActivity(e2.c.g(this.f1743b, "user_id"), null));
                return;
            case 2:
                r0.getMediaDataController().loadBotInfo(this.f1743b, r1, true, this.f1744c.classGuid);
                return;
            case 3:
                this.f1744c.getMessagesController().loadFullChat(this.f1743b, 0, true);
                return;
            case 4:
                qn qnVar = this.f1744c;
                LongSparseIntArray longSparseIntArray = qnVar.I5;
                long j10 = this.f1743b;
                longSparseIntArray.put(j10, 0);
                b21 b21Var = qnVar.N1;
                if (b21Var != null) {
                    b21Var.setAllTopicsHidden(false);
                }
                if (j10 == qnVar.Z3) {
                    qnVar.f42114w0.O(false);
                    return;
                }
                return;
            case 5:
                qn qnVar2 = this.f1744c;
                qnVar2.getClass();
                qnVar2.presentFragment(qn.R9(this.f1743b));
                return;
            case 6:
                qn qnVar3 = this.f1744c;
                qnVar3.getClass();
                qnVar3.presentFragment(ProfileActivity.m4(this.f1743b));
                return;
            default:
                qn qnVar4 = this.f1744c;
                gc v = oc.v(qnVar4.getParentActivity(), qnVar4, null, 1, this.f1743b, 1, qnVar4.getThemedColor(f6.Fi), qnVar4.getThemedColor(f6.Hi), 5000, true, null);
                v.f28738k = true;
                v.k(true);
                return;
        }
    }

    public e1(qn qnVar, long j10, int i9) {
        this.f1742a = i9;
        this.f1744c = qnVar;
        this.f1743b = j10;
    }
}
