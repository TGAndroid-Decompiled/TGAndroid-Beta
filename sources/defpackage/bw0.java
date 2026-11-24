package defpackage;

import android.webkit.PermissionRequest;
public final class bw0 implements gu2 {
    public final byte a;
    public final jw0 b;
    public final PermissionRequest c;
    public final String d;

    public bw0(jw0 jw0Var, PermissionRequest permissionRequest, String str, byte b) {
        this.a = b;
        this.b = jw0Var;
        this.c = permissionRequest;
        this.d = str;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        String str = this.d;
        PermissionRequest permissionRequest = this.c;
        jw0 jw0Var = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (jw0Var.a != null) {
                    jw0Var.a = null;
                    if (bool.booleanValue()) {
                        bw0 bw0Var = new bw0(jw0Var, permissionRequest, str, (byte) 2);
                        boolean z = qw0.R0;
                        jw0Var.e.R.R(new String[]{"android.permission.RECORD_AUDIO"}, bw0Var);
                        return;
                    }
                    permissionRequest.deny();
                    return;
                }
                return;
            case 1:
                if (jw0Var.a != null) {
                    jw0Var.a = null;
                    if (bool.booleanValue()) {
                        bw0 bw0Var2 = new bw0(jw0Var, permissionRequest, str, (byte) 3);
                        boolean z2 = qw0.R0;
                        jw0Var.e.R.R(new String[]{"android.permission.CAMERA"}, bw0Var2);
                        return;
                    }
                    permissionRequest.deny();
                    return;
                }
                return;
            case 2:
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{str});
                    jw0Var.e.R.U = true;
                    return;
                }
                permissionRequest.deny();
                return;
            default:
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{str});
                    jw0Var.e.R.U = true;
                    return;
                }
                permissionRequest.deny();
                return;
        }
    }
}
