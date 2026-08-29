package eg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m21;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.tn;
public final class z0 implements Runnable {
    public final int f6202a;
    public final long f6203b;
    public final tn f6204c;

    public z0(long j10, tn tnVar) {
        this.f6202a = 1;
        this.f6203b = j10;
        this.f6204c = tnVar;
    }

    @Override
    public final void run() {
        switch (this.f6202a) {
            case 0:
                tc.a0(this.f6204c).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f6203b)), R.raw.stars_topup).k(true);
                return;
            case 1:
                this.f6204c.presentFragment(new ProfileActivity(j7.l1.g(this.f6203b, "user_id"), null));
                return;
            case 2:
                r0.getMediaDataController().loadBotInfo(this.f6203b, r1, true, this.f6204c.classGuid);
                return;
            case 3:
                this.f6204c.getMessagesController().loadFullChat(this.f6203b, 0, true);
                return;
            case 4:
                tn tnVar = this.f6204c;
                LongSparseIntArray longSparseIntArray = tnVar.I5;
                long j10 = this.f6203b;
                longSparseIntArray.put(j10, 0);
                m21 m21Var = tnVar.N1;
                if (m21Var != null) {
                    m21Var.setAllTopicsHidden(false);
                }
                if (j10 == tnVar.Z3) {
                    tnVar.f43013w0.O(false);
                    return;
                }
                return;
            case 5:
                tn tnVar2 = this.f6204c;
                tnVar2.getClass();
                tnVar2.presentFragment(tn.R9(this.f6203b));
                return;
            case 6:
                tn tnVar3 = this.f6204c;
                tnVar3.getClass();
                tnVar3.presentFragment(ProfileActivity.m4(this.f6203b));
                return;
            default:
                tn tnVar4 = this.f6204c;
                mc v = tc.v(tnVar4.getParentActivity(), tnVar4, null, 1, this.f6203b, 1, tnVar4.getThemedColor(g6.Fi), tnVar4.getThemedColor(g6.Hi), 5000, true, null);
                v.f30653k = true;
                v.k(true);
                return;
        }
    }

    public z0(tn tnVar, long j10, int i10) {
        this.f6202a = i10;
        this.f6204c = tnVar;
        this.f6203b = j10;
    }
}
