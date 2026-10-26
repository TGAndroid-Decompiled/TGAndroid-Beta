package ag;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
public final class o0 implements Runnable {
    public final int f1358a;
    public final un f1359b;
    public final long f1360c;

    public o0(long j10, un unVar) {
        this.f1358a = 0;
        this.f1360c = j10;
        this.f1359b = unVar;
    }

    @Override
    public final void run() {
        switch (this.f1358a) {
            case 0:
                this.f1359b.presentFragment(new ProfileActivity(a1.g.h(this.f1360c, "user_id"), null));
                return;
            case 1:
                this.f1359b.getMessagesController().loadFullChat(this.f1360c, 0, true);
                return;
            case 2:
                un unVar = this.f1359b;
                LongSparseIntArray longSparseIntArray = unVar.Y5;
                long j10 = this.f1360c;
                longSparseIntArray.put(j10, 0);
                e41 e41Var = unVar.f44222d2;
                if (e41Var != null) {
                    e41Var.setAllTopicsHidden(false);
                }
                if (j10 == unVar.f44373p4) {
                    unVar.A0.O(false);
                    return;
                }
                return;
            case 3:
                un unVar2 = this.f1359b;
                qc v = wc.v(unVar2.getParentActivity(), unVar2, null, 1, this.f1360c, 1, unVar2.getThemedColor(y6.Fi), unVar2.getThemedColor(y6.Hi), 5000, true, null);
                v.f31890k = true;
                v.k(true);
                return;
            case 4:
                un unVar3 = this.f1359b;
                unVar3.getClass();
                unVar3.presentFragment(un.ba(this.f1360c));
                return;
            case 5:
                un unVar4 = this.f1359b;
                unVar4.getClass();
                unVar4.presentFragment(ProfileActivity.t4(this.f1360c));
                return;
            case 6:
                r0.getMediaDataController().loadBotInfo(this.f1360c, r1, true, this.f1359b.classGuid);
                return;
            default:
                wc.b0(this.f1359b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f1360c)), R.raw.stars_topup).k(true);
                return;
        }
    }

    public o0(un unVar, long j10, int i10) {
        this.f1358a = i10;
        this.f1359b = unVar;
        this.f1360c = j10;
    }
}
