package di;

import android.content.Context;
import android.content.Intent;
public final class gd implements org.telegram.ui.ActionBar.z1 {
    public final int f6980a;
    public final Context f6981b;

    public gd(Context context, int i10) {
        this.f6980a = i10;
        this.f6981b = context;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f6980a) {
            case 0:
                try {
                    this.f6981b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f6981b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
