package defpackage;

import org.telegram.ui.PrivacyControlActivity;
public final class qj8 implements ed {
    public final byte a;
    public final PrivacyControlActivity b;

    public qj8(PrivacyControlActivity privacyControlActivity, byte b) {
        this.a = b;
        this.b = privacyControlActivity;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        PrivacyControlActivity privacyControlActivity = this.b;
        switch (b) {
            case 0:
                privacyControlActivity.I0();
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
