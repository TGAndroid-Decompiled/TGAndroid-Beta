package defpackage;

import android.webkit.PermissionRequest;
public final class ru0 implements vs2 {
    public final byte a;
    public final zu0 b;
    public final PermissionRequest c;
    public final String d;

    public ru0(zu0 zu0Var, PermissionRequest permissionRequest, String str, byte b) {
        this.a = b;
        this.b = zu0Var;
        this.c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        String str = this.d;
        PermissionRequest permissionRequest = this.c;
        zu0 zu0Var = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (zu0Var.a != null) {
                    zu0Var.a = null;
                    if (bool.booleanValue()) {
                        ru0 ru0Var = new ru0(zu0Var, permissionRequest, str, (byte) 2);
                        boolean z = hv0.R0;
                        zu0Var.e.R.R(new String[]{"android.permission.RECORD_AUDIO"}, ru0Var);
                        return;
                    }
                    permissionRequest.deny();
                    return;
                }
                return;
            case 1:
                if (zu0Var.a != null) {
                    zu0Var.a = null;
                    if (bool.booleanValue()) {
                        ru0 ru0Var2 = new ru0(zu0Var, permissionRequest, str, (byte) 3);
                        boolean z2 = hv0.R0;
                        zu0Var.e.R.R(new String[]{"android.permission.CAMERA"}, ru0Var2);
                        return;
                    }
                    permissionRequest.deny();
                    return;
                }
                return;
            case 2:
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{str});
                    zu0Var.e.R.U = true;
                    return;
                }
                permissionRequest.deny();
                return;
            default:
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{str});
                    zu0Var.e.R.U = true;
                    return;
                }
                permissionRequest.deny();
                return;
        }
    }
}
