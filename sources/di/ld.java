package di;

import android.content.Context;
import android.content.Intent;
public final class ld implements org.telegram.ui.ActionBar.a2 {
    public final int f7610a;
    public final Context f7611b;

    public ld(Context context, int i10) {
        this.f7610a = i10;
        this.f7611b = context;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f7610a) {
            case 0:
                try {
                    this.f7611b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f7611b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
