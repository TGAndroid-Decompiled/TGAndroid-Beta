package ci;

import android.content.Context;
import android.content.Intent;
public final class id implements org.telegram.ui.ActionBar.z1 {
    public final int f5213a;
    public final Context f5214b;

    public id(Context context, int i10) {
        this.f5213a = i10;
        this.f5214b = context;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f5213a) {
            case 0:
                try {
                    this.f5214b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f5214b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
