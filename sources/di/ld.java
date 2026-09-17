package di;

import android.content.Context;
import android.content.Intent;
public final class ld implements org.telegram.ui.ActionBar.a2 {
    public final int f7582a;
    public final Context f7583b;

    public ld(Context context, int i10) {
        this.f7582a = i10;
        this.f7583b = context;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f7582a) {
            case 0:
                try {
                    this.f7583b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f7583b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
