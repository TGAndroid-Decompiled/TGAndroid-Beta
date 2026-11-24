package defpackage;

import org.telegram.ui.PrivacySettingsActivity;
public final class ak8 implements Runnable {
    public final byte a;
    public final PrivacySettingsActivity b;

    public ak8(PrivacySettingsActivity privacySettingsActivity, byte b) {
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
                t11 t11Var = new t11(privacySettingsActivity.getParentActivity(), null);
                t11Var.d(2131624009, new String[0]);
                t11Var.b.setText(k96.M0(2131742548, null));
                m21.g(privacySettingsActivity, t11Var, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.D0();
                return;
        }
    }
}
