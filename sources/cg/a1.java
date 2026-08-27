package cg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rn;

public final class a1 implements Runnable {

    public final int f2598a;

    public final long f2599b;

    public final rn f2600c;

    public a1(long j10, rn rnVar) {
        this.f2598a = 1;
        this.f2599b = j10;
        this.f2600c = rnVar;
    }

    @Override
    public final void run() {
        switch (this.f2598a) {
            case 0:
                mc.a0(this.f2600c).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f2599b)), R.raw.stars_topup).k(true);
                break;
            case 1:
                this.f2600c.presentFragment(new ProfileActivity(com.google.android.recaptcha.internal.a.h(this.f2599b, "user_id"), null));
                break;
            case 2:
                rn rnVar = this.f2600c;
                long j10 = this.f2599b;
                rnVar.getMediaDataController().loadBotInfo(j10, j10, true, rnVar.classGuid);
                break;
            case 3:
                this.f2600c.getMessagesController().loadFullChat(this.f2599b, 0, true);
                break;
            case 4:
                rn rnVar2 = this.f2600c;
                LongSparseIntArray longSparseIntArray = rnVar2.I5;
                long j11 = this.f2599b;
                longSparseIntArray.put(j11, 0);
                d21 d21Var = rnVar2.N1;
                if (d21Var != null) {
                    d21Var.setAllTopicsHidden(false);
                }
                if (j11 == rnVar2.Z3) {
                    rnVar2.f42252w0.O(false);
                }
                break;
            case 5:
                rn rnVar3 = this.f2600c;
                rnVar3.getClass();
                rnVar3.presentFragment(rn.R9(this.f2599b));
                break;
            case 6:
                rn rnVar4 = this.f2600c;
                rnVar4.getClass();
                rnVar4.presentFragment(ProfileActivity.m4(this.f2599b));
                break;
            default:
                rn rnVar5 = this.f2600c;
                ec ecVarV = mc.v(rnVar5.getParentActivity(), rnVar5, null, 1, this.f2599b, 1, rnVar5.getThemedColor(g6.Fi), rnVar5.getThemedColor(g6.Hi), 5000, true, null);
                ecVarV.f28021k = true;
                ecVarV.k(true);
                break;
        }
    }

    public a1(rn rnVar, long j10, int i10) {
        this.f2598a = i10;
        this.f2600c = rnVar;
        this.f2599b = j10;
    }
}
