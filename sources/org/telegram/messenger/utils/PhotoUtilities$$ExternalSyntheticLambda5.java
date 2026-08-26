package org.telegram.messenger.utils;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.ProfileActivity;

public final class PhotoUtilities$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId = 0;
    public final long f$0;
    public final ChatActivity f$1;

    public PhotoUtilities$$ExternalSyntheticLambda5(long j, ChatActivity chatActivity) {
        this.f$0 = j;
        this.f$1 = chatActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$1.presentFragment(new ProfileActivity(FBool.m(this.f$0, "user_id")));
                break;
            default:
                BulletinFactory.of(this.f$1).createSimpleBulletin(R.raw.stars_topup, LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f$0))).show(true);
                break;
        }
    }

    public PhotoUtilities$$ExternalSyntheticLambda5(ChatActivity chatActivity, long j) {
        this.f$1 = chatActivity;
        this.f$0 = j;
    }
}
