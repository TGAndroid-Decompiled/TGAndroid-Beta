package defpackage;

import android.webkit.PermissionRequest;
public final class bv0 implements pt2 {
    public final byte a;
    public final kv0 b;
    public final PermissionRequest c;
    public final String d;

    public bv0(kv0 kv0Var, PermissionRequest permissionRequest, String str, byte b) {
        this.a = b;
        this.b = kv0Var;
        this.c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        String str = this.d;
        PermissionRequest permissionRequest = this.c;
        kv0 kv0Var = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (kv0Var.a != null) {
                    kv0Var.a = null;
                    if (bool.booleanValue()) {
                        bv0 bv0Var = new bv0(kv0Var, permissionRequest, str, (byte) 2);
                        boolean z = rv0.R0;
                        kv0Var.e.R.R(new String[]{"android.permission.RECORD_AUDIO"}, bv0Var);
                        return;
                    }
                    permissionRequest.deny();
                    return;
                }
                return;
            case 1:
                if (kv0Var.a != null) {
                    kv0Var.a = null;
                    if (bool.booleanValue()) {
                        bv0 bv0Var2 = new bv0(kv0Var, permissionRequest, str, (byte) 3);
                        boolean z2 = rv0.R0;
                        kv0Var.e.R.R(new String[]{"android.permission.CAMERA"}, bv0Var2);
                        return;
                    }
                    permissionRequest.deny();
                    return;
                }
                return;
            case 2:
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{str});
                    kv0Var.e.R.U = true;
                    return;
                }
                permissionRequest.deny();
                return;
            default:
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{str});
                    kv0Var.e.R.U = true;
                    return;
                }
                permissionRequest.deny();
                return;
        }
    }
}
