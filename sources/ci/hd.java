package ci;

import android.content.Context;
import android.content.Intent;
public final class hd implements org.telegram.ui.ActionBar.a2 {
    public final int f5146a;
    public final Context f5147b;

    public hd(Context context, int i10) {
        this.f5146a = i10;
        this.f5147b = context;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f5146a) {
            case 0:
                try {
                    this.f5147b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f5147b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
