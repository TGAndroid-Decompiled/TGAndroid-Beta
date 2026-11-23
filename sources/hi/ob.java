package hi;

import android.content.Context;
import android.content.Intent;
public final class ob implements org.telegram.ui.ActionBar.q1 {
    public final int f15162a;
    public final Context f15163b;

    public ob(Context context, int i7) {
        this.f15162a = i7;
        this.f15163b = context;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f15162a) {
            case 0:
                try {
                    this.f15163b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f15163b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
