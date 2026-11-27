package defpackage;

import android.webkit.GeolocationPermissions;
public final class dv0 implements pt2 {
    public final byte a;
    public final kv0 b;
    public final GeolocationPermissions.Callback c;
    public final String d;

    public dv0(kv0 kv0Var, GeolocationPermissions.Callback callback, String str, byte b) {
        this.a = b;
        this.b = kv0Var;
        this.c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        String str = this.d;
        GeolocationPermissions.Callback callback = this.c;
        kv0 kv0Var = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (kv0Var.a != null) {
                    kv0Var.a = null;
                    if (bool.booleanValue()) {
                        dv0 dv0Var = new dv0(kv0Var, callback, str, (byte) 1);
                        boolean z = rv0.R0;
                        kv0Var.e.R.R(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, dv0Var);
                        return;
                    }
                    callback.invoke(str, false, false);
                    return;
                }
                return;
            default:
                callback.invoke(str, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    kv0Var.e.R.U = true;
                    return;
                }
                return;
        }
    }
}
