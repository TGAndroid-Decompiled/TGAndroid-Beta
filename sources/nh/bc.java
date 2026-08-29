package nh;

import android.content.Context;
import android.content.Intent;
public final class bc implements org.telegram.ui.ActionBar.b2 {
    public final int f17449a;
    public final Context f17450b;

    public bc(Context context, int i10) {
        this.f17449a = i10;
        this.f17450b = context;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f17449a) {
            case 0:
                try {
                    this.f17450b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f17450b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
