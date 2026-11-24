package defpackage;

import android.content.Intent;
import org.telegram.ui.ThemeActivity;
public final class dkb implements z29, ed {
    public final byte a;
    public final ThemeActivity b;

    public dkb(ThemeActivity themeActivity, byte b) {
        this.a = b;
        this.b = themeActivity;
    }

    @Override
    public final int run() {
        return this.b.z0();
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        ThemeActivity themeActivity = this.b;
        switch (b) {
            case 1:
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                ij.T(themeActivity, 0, null, null);
                return;
        }
    }
}
