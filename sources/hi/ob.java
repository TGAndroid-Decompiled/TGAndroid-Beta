package hi;

import android.content.Context;
import android.content.Intent;
public final class ob implements org.telegram.ui.ActionBar.r1 {
    public final int f15207a;
    public final Context f15208b;

    public ob(Context context, int i7) {
        this.f15207a = i7;
        this.f15208b = context;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f15207a) {
            case 0:
                try {
                    this.f15208b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f15208b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
