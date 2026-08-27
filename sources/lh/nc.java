package lh;

import android.content.Context;
import android.content.Intent;

public final class nc implements org.telegram.ui.ActionBar.a2 {

    public final int f16459a;

    public final Context f16460b;

    public nc(Context context, int i10) {
        this.f16459a = i10;
        this.f16460b = context;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f16459a) {
            case 0:
                try {
                    this.f16460b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    this.f16460b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
