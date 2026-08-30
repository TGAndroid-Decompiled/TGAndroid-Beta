package j3;

import android.content.Context;
import android.content.Intent;
public final class o implements r8.i, org.telegram.ui.ActionBar.c2 {
    public final int f8759a;
    public final Context f8760b;

    public o(Context context, int i10) {
        this.f8759a = i10;
        this.f8760b = context;
    }

    @Override
    public Object get() {
        switch (this.f8759a) {
            case 0:
                return new l(this.f8760b);
            case 1:
                return new ab.a(this.f8760b, new Object());
            case 2:
                return new f5.p(this.f8760b, new db.a(6));
            default:
                return g5.s.b(this.f8760b);
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f8759a) {
            case 4:
                try {
                    this.f8760b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f8760b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
