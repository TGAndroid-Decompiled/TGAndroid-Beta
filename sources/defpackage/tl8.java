package defpackage;

import org.telegram.ui.PrivacyControlActivity;
public final class tl8 implements ee {
    public final byte a;
    public final PrivacyControlActivity b;

    public tl8(PrivacyControlActivity privacyControlActivity, byte b) {
        this.a = b;
        this.b = privacyControlActivity;
    }

    @Override
    public final void r(he heVar, int i) {
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
