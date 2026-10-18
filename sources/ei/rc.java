package ei;

import android.content.Context;
import android.content.Intent;
public final class rc implements org.telegram.ui.ActionBar.a2 {
    public final int f9758a;
    public final Context f9759b;

    public rc(Context context, int i10) {
        this.f9758a = i10;
        this.f9759b = context;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f9758a) {
            case 0:
                try {
                    this.f9759b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f9759b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
