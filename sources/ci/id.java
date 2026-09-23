package ci;

import android.content.Context;
import android.content.Intent;
public final class id implements org.telegram.ui.ActionBar.a2 {
    public final int f4798a;
    public final Context f4799b;

    public id(Context context, int i10) {
        this.f4798a = i10;
        this.f4799b = context;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f4798a) {
            case 0:
                try {
                    this.f4799b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f4799b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
