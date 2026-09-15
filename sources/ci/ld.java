package ci;

import android.content.Context;
import android.content.Intent;
public final class ld implements org.telegram.ui.ActionBar.a2 {
    public final int f4980a;
    public final Context f4981b;

    public ld(Context context, int i10) {
        this.f4980a = i10;
        this.f4981b = context;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f4980a) {
            case 0:
                try {
                    this.f4981b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f4981b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
