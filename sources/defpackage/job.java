package defpackage;

import android.content.Intent;
import org.telegram.ui.ThemeActivity;
public final class job implements o69, fd {
    public final byte a;
    public final ThemeActivity b;

    public job(ThemeActivity themeActivity, byte b) {
        this.a = b;
        this.b = themeActivity;
    }

    @Override
    public final int run() {
        return this.b.A0();
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        ThemeActivity themeActivity = this.b;
        switch (b) {
            case 1:
                jj.T(themeActivity, 0, null, null);
                return;
            default:
                if (themeActivity.getParentActivity() != null) {
                    try {
                        themeActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
        }
    }
}
