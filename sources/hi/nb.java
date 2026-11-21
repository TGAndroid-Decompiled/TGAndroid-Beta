package hi;

import android.content.Context;
import android.content.Intent;
public final class nb implements org.telegram.ui.ActionBar.q1 {
    public final int f15137a;
    public final Context f15138b;

    public nb(Context context, int i7) {
        this.f15137a = i7;
        this.f15138b = context;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f15137a) {
            case 0:
                try {
                    this.f15138b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f15138b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
