package defpackage;

import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
public final class yu0 implements jac {
    public final byte a;
    public final qw0 b;
    public final ow0 c;

    public yu0(qw0 qw0Var, ow0 ow0Var, byte b) {
        this.a = b;
        this.b = qw0Var;
        this.c = ow0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        uv0 uv0Var;
        String str;
        byte b = this.a;
        ow0 ow0Var = this.c;
        qw0 qw0Var = this.b;
        switch (b) {
            case 0:
                String str2 = (String) obj2;
                qw0Var.u(ow0Var, "emoji_status_access_requested", qw0.x(str2, "status"));
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (uv0Var = qw0Var.c) != null) {
                    uv0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                if (qw0Var.c != null && bool.booleanValue()) {
                    qw0Var.c.w(bool2.booleanValue());
                }
                qw0Var.l0.i(new zu0(qw0Var, ow0Var, (byte) 1));
                return;
            case 2:
                String str3 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    up0 up0Var = qw0Var.k0;
                    up0Var.e = true;
                    up0Var.i();
                }
                qw0Var.s(ow0Var);
                return;
            case 3:
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                if (bool3.booleanValue()) {
                    qw0Var.k0.e = true;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (bool3.booleanValue()) {
                        str = "authorized";
                    } else {
                        str = "failed";
                    }
                    jSONObject.put("status", str);
                    jSONObject.put("token", str4);
                    qw0Var.u(ow0Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (str5 == null) {
                    qw0Var.u(ow0Var, "emoji_status_set", null);
                    uv0 uv0Var2 = qw0Var.c;
                    if (uv0Var2 != null) {
                        uv0Var2.d(document);
                        return;
                    }
                    return;
                }
                qw0Var.u(ow0Var, "emoji_status_failed", qw0.x(str5, "error"));
                return;
        }
    }
}
