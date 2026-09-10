package bi;

import android.content.Context;
import android.content.Intent;
public final class bf implements org.telegram.ui.ActionBar.c2 {
    public final int f2388a;
    public final Context f2389b;

    public bf(Context context, int i10) {
        this.f2388a = i10;
        this.f2389b = context;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f2388a) {
            case 0:
                try {
                    this.f2389b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f2389b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
