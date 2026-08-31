package j3;

import android.content.Context;
import android.content.Intent;
public final class o implements r8.i, org.telegram.ui.ActionBar.c2 {
    public final int f9345a;
    public final Context f9346b;

    public o(Context context, int i10) {
        this.f9345a = i10;
        this.f9346b = context;
    }

    @Override
    public Object get() {
        switch (this.f9345a) {
            case 0:
                return new l(this.f9346b);
            case 1:
                return new ab.a(this.f9346b, new Object());
            case 2:
                return new f5.p(this.f9346b, new db.a(6));
            default:
                return g5.s.b(this.f9346b);
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f9345a) {
            case 4:
                try {
                    this.f9346b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    this.f9346b.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
