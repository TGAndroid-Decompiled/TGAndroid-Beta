package fi;

import android.content.Context;
import android.content.Intent;
public final class nc implements org.telegram.ui.ActionBar.b2 {
    public final int f11325a;
    public final Context f11326b;

    public nc(Context context, int i10) {
        this.f11325a = i10;
        this.f11326b = context;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f11325a) {
            case 0:
                try {
                    this.f11326b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f11326b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
