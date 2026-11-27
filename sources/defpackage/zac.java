package defpackage;

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.UserInfoActivity;
public final class zac implements Runnable {
    public final byte a;
    public final UserInfoActivity b;

    public zac(UserInfoActivity userInfoActivity, byte b) {
        this.a = b;
        this.b = userInfoActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        UserInfoActivity userInfoActivity = this.b;
        switch (b) {
            case 0:
                userInfoActivity.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                wa waVar = userInfoActivity.y;
                if (waVar != null) {
                    waVar.g3.O(true);
                    return;
                }
                return;
            case 2:
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                userInfoActivity.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
