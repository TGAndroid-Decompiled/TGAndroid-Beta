package ci;

import android.content.Context;
import android.content.Intent;
public final class ld implements org.telegram.ui.ActionBar.a2 {
    public final int f4984a;
    public final Context f4985b;

    public ld(Context context, int i10) {
        this.f4984a = i10;
        this.f4985b = context;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f4984a) {
            case 0:
                try {
                    this.f4985b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f4985b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
