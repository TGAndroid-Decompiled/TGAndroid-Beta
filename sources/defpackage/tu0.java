package defpackage;

import android.webkit.GeolocationPermissions;
public final class tu0 implements vs2 {
    public final byte a;
    public final zu0 b;
    public final GeolocationPermissions.Callback c;
    public final String d;

    public tu0(zu0 zu0Var, GeolocationPermissions.Callback callback, String str, byte b) {
        this.a = b;
        this.b = zu0Var;
        this.c = callback;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        String str = this.d;
        GeolocationPermissions.Callback callback = this.c;
        zu0 zu0Var = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (zu0Var.a != null) {
                    zu0Var.a = null;
                    if (bool.booleanValue()) {
                        tu0 tu0Var = new tu0(zu0Var, callback, str, (byte) 1);
                        boolean z = hv0.R0;
                        zu0Var.e.R.R(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, tu0Var);
                        return;
                    }
                    callback.invoke(str, false, false);
                    return;
                }
                return;
            default:
                callback.invoke(str, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    zu0Var.e.R.U = true;
                    return;
                }
                return;
        }
    }
}
