package ei;

import android.content.Context;
import android.content.Intent;
public final class rc implements org.telegram.ui.ActionBar.a2 {
    public final int f9757a;
    public final Context f9758b;

    public rc(Context context, int i10) {
        this.f9757a = i10;
        this.f9758b = context;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f9757a) {
            case 0:
                try {
                    this.f9758b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f9758b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
