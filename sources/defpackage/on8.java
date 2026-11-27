package defpackage;

import org.telegram.ui.PrivacySettingsActivity;
public final class on8 implements Runnable {
    public final byte a;
    public final PrivacySettingsActivity b;

    public on8(PrivacySettingsActivity privacySettingsActivity, byte b) {
        this.a = b;
        this.b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        PrivacySettingsActivity privacySettingsActivity = this.b;
        switch (b) {
            case 0:
                privacySettingsActivity.a.f();
                privacySettingsActivity.S = true;
                return;
            case 1:
                privacySettingsActivity.c.dismiss();
                return;
            default:
                privacySettingsActivity.getClass();
                c21 c21Var = new c21(privacySettingsActivity.getParentActivity(), null);
                c21Var.h(2131624009, new String[0]);
                c21Var.b.setText(ob6.M0(2131742442, null));
                v21.g(privacySettingsActivity, c21Var, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                return;
        }
    }
}
