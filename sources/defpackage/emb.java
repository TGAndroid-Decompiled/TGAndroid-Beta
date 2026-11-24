package defpackage;

import android.content.Intent;
import org.telegram.ui.ThemeActivity;
public final class emb implements c59, ee {
    public final byte a;
    public final ThemeActivity b;

    public emb(ThemeActivity themeActivity, byte b) {
        this.a = b;
        this.b = themeActivity;
    }

    @Override
    public final void r(he heVar, int i) {
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
                ik.T(themeActivity, 0, null, null);
                return;
        }
    }

    @Override
    public final int run() {
        return this.b.A0();
    }
}
