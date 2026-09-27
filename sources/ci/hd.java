package ci;

import android.content.Context;
import android.content.Intent;
public final class hd implements org.telegram.ui.ActionBar.b2 {
    public final int f4764a;
    public final Context f4765b;

    public hd(Context context, int i10) {
        this.f4764a = i10;
        this.f4765b = context;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f4764a) {
            case 0:
                try {
                    this.f4765b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f4765b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
