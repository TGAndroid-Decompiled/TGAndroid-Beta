package ci;

import android.content.Context;
import android.content.Intent;
public final class id implements org.telegram.ui.ActionBar.z1 {
    public final int f4806a;
    public final Context f4807b;

    public id(Context context, int i10) {
        this.f4806a = i10;
        this.f4807b = context;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f4806a) {
            case 0:
                try {
                    this.f4807b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f4807b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
