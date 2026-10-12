package di;

import android.content.Context;
import android.content.Intent;
public final class gd implements org.telegram.ui.ActionBar.z1 {
    public final int f6977a;
    public final Context f6978b;

    public gd(Context context, int i10) {
        this.f6977a = i10;
        this.f6978b = context;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f6977a) {
            case 0:
                try {
                    this.f6978b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f6978b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
