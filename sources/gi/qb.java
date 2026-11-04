package gi;

import android.content.Context;
import android.content.Intent;
public final class qb implements org.telegram.ui.ActionBar.p1 {
    public final int f13457a;
    public final Context f13458b;

    public qb(Context context, int i3) {
        this.f13457a = i3;
        this.f13458b = context;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f13457a) {
            case 0:
                try {
                    this.f13458b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f13458b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
