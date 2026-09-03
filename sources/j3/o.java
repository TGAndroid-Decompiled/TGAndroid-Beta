package j3;

import android.content.Context;
import android.content.Intent;
public final class o implements r8.i, org.telegram.ui.ActionBar.c2 {
    public final int f8741a;
    public final Context f8742b;

    public o(Context context, int i10) {
        this.f8741a = i10;
        this.f8742b = context;
    }

    @Override
    public Object get() {
        switch (this.f8741a) {
            case 0:
                return new l(this.f8742b);
            case 1:
                return new z9.d(this.f8742b, new Object());
            case 2:
                return new f5.p(this.f8742b, new cb.b(6));
            default:
                return g5.s.b(this.f8742b);
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f8741a) {
            case 4:
                try {
                    this.f8742b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f8742b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
