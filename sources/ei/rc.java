package ei;

import android.content.Context;
import android.content.Intent;
public final class rc implements org.telegram.ui.ActionBar.z1 {
    public final int f9771a;
    public final Context f9772b;

    public rc(Context context, int i10) {
        this.f9771a = i10;
        this.f9772b = context;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f9771a) {
            case 0:
                try {
                    this.f9772b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f9772b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
