package defpackage;

import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
public final class yt0 implements icc {
    public final byte a;
    public final rv0 b;
    public final pv0 c;

    public yt0(rv0 rv0Var, pv0 pv0Var, byte b) {
        this.a = b;
        this.b = rv0Var;
        this.c = pv0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        uu0 uu0Var;
        String str;
        byte b = this.a;
        pv0 pv0Var = this.c;
        rv0 rv0Var = this.b;
        switch (b) {
            case 0:
                String str2 = (String) obj2;
                rv0Var.u(pv0Var, "emoji_status_access_requested", rv0.x(str2, "status"));
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (uu0Var = rv0Var.c) != null) {
                    uu0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                if (rv0Var.c != null && bool.booleanValue()) {
                    rv0Var.c.w(bool2.booleanValue());
                }
                rv0Var.l0.i(new zt0(rv0Var, pv0Var, (byte) 1));
                return;
            case 2:
                String str3 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    uo0 uo0Var = rv0Var.k0;
                    uo0Var.e = true;
                    uo0Var.i();
                }
                rv0Var.s(pv0Var);
                return;
            case 3:
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                if (bool3.booleanValue()) {
                    rv0Var.k0.e = true;
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
                    rv0Var.u(pv0Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (str5 == null) {
                    rv0Var.u(pv0Var, "emoji_status_set", null);
                    uu0 uu0Var2 = rv0Var.c;
                    if (uu0Var2 != null) {
                        uu0Var2.d(document);
                        return;
                    }
                    return;
                }
                rv0Var.u(pv0Var, "emoji_status_failed", rv0.x(str5, "error"));
                return;
        }
    }
}
