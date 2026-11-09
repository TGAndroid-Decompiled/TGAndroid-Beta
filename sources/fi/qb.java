package fi;

import android.content.Context;
import android.content.Intent;
public final class qb implements org.telegram.ui.ActionBar.r1 {
    public final int f12691a;
    public final Context f12692b;

    public qb(Context context, int i7) {
        this.f12691a = i7;
        this.f12692b = context;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f12691a) {
            case 0:
                try {
                    this.f12692b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f12692b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
