package hi;

import android.content.Context;
import android.content.Intent;
public final class ic implements org.telegram.ui.ActionBar.q1 {
    public final int f14713a;
    public final Context f14714b;

    public ic(Context context, int i7) {
        this.f14713a = i7;
        this.f14714b = context;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f14713a) {
            case 0:
                try {
                    this.f14714b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f14714b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
