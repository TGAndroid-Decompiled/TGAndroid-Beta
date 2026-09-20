package ci;

import android.content.Context;
import android.content.Intent;
public final class ld implements org.telegram.ui.ActionBar.a2 {
    public final int f4986a;
    public final Context f4987b;

    public ld(Context context, int i10) {
        this.f4986a = i10;
        this.f4987b = context;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f4986a) {
            case 0:
                try {
                    this.f4987b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f4987b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
