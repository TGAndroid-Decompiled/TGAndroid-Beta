package ci;

import android.content.Context;
import android.content.Intent;
public final class id implements org.telegram.ui.ActionBar.a2 {
    public final int f5215a;
    public final Context f5216b;

    public id(Context context, int i10) {
        this.f5215a = i10;
        this.f5216b = context;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f5215a) {
            case 0:
                try {
                    this.f5216b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f5216b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
