package defpackage;

import org.telegram.ui.PrivacyControlActivity;
public final class en8 implements fd {
    public final byte a;
    public final PrivacyControlActivity b;

    public en8(PrivacyControlActivity privacyControlActivity, byte b) {
        this.a = b;
        this.b = privacyControlActivity;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        PrivacyControlActivity privacyControlActivity = this.b;
        switch (b) {
            case 0:
                privacyControlActivity.J0();
                return;
            case 1:
                privacyControlActivity.finishFragment();
                return;
            default:
                privacyControlActivity.finishFragment();
                return;
        }
    }
}
