package ci;

import android.content.Context;
import android.content.Intent;
public final class ld implements org.telegram.ui.ActionBar.b2 {
    public final int f4985a;
    public final Context f4986b;

    public ld(Context context, int i10) {
        this.f4985a = i10;
        this.f4986b = context;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f4985a) {
            case 0:
                try {
                    this.f4986b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f4986b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
