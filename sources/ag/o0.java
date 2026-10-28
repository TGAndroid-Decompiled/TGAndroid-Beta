package ag;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;
public final class o0 implements Runnable {
    public final int f1358a;
    public final wn f1359b;
    public final long f1360c;

    public o0(long j10, wn wnVar) {
        this.f1358a = 0;
        this.f1360c = j10;
        this.f1359b = wnVar;
    }

    @Override
    public final void run() {
        switch (this.f1358a) {
            case 0:
                this.f1359b.presentFragment(new ProfileActivity(a1.g.h(this.f1360c, "user_id"), null));
                return;
            case 1:
                r0.getMediaDataController().loadBotInfo(this.f1360c, r1, true, this.f1359b.classGuid);
                return;
            case 2:
                this.f1359b.getMessagesController().loadFullChat(this.f1360c, 0, true);
                return;
            case 3:
                wn wnVar = this.f1359b;
                LongSparseIntArray longSparseIntArray = wnVar.f45079c6;
                long j10 = this.f1360c;
                longSparseIntArray.put(j10, 0);
                f41 f41Var = wnVar.f45089d2;
                if (f41Var != null) {
                    f41Var.setAllTopicsHidden(false);
                }
                if (j10 == wnVar.f45241p4) {
                    wnVar.A0.O(false);
                    return;
                }
                return;
            case 4:
                wn wnVar2 = this.f1359b;
                wnVar2.getClass();
                wnVar2.presentFragment(wn.ea(this.f1360c));
                return;
            case 5:
                wn wnVar3 = this.f1359b;
                wnVar3.getClass();
                wnVar3.presentFragment(ProfileActivity.t4(this.f1360c));
                return;
            case 6:
                wn wnVar4 = this.f1359b;
                qc v = wc.v(wnVar4.getParentActivity(), wnVar4, null, 1, this.f1360c, 1, wnVar4.getThemedColor(y6.Fi), wnVar4.getThemedColor(y6.Hi), 5000, true, null);
                v.f31862k = true;
                v.k(true);
                return;
            default:
                wc.b0(this.f1359b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f1360c)), R.raw.stars_topup).k(true);
                return;
        }
    }

    public o0(wn wnVar, long j10, int i10) {
        this.f1358a = i10;
        this.f1359b = wnVar;
        this.f1360c = j10;
    }
}
