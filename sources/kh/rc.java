package kh;

import android.content.Context;
import android.content.Intent;
public final class rc implements org.telegram.ui.ActionBar.b2 {
    public final int f15977a;
    public final Context f15978b;

    public rc(Context context, int i9) {
        this.f15977a = i9;
        this.f15978b = context;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f15977a) {
            case 0:
                try {
                    this.f15978b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f15978b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
