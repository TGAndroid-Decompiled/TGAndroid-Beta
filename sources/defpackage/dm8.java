package defpackage;

import org.telegram.ui.PrivacySettingsActivity;
public final class dm8 implements Runnable {
    public final byte a;
    public final PrivacySettingsActivity b;

    public dm8(PrivacySettingsActivity privacySettingsActivity, byte b) {
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
                b31 b31Var = new b31(privacySettingsActivity.getParentActivity(), null);
                b31Var.d(2131624009, new String[0]);
                b31Var.b.setText(jb6.M0(2131742474, null));
                u31.g(privacySettingsActivity, b31Var, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                return;
        }
    }
}
