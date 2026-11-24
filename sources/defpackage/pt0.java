package defpackage;

import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
public final class pt0 implements i8c {
    public final byte a;
    public final hv0 b;
    public final ev0 c;

    public pt0(hv0 hv0Var, ev0 ev0Var, byte b) {
        this.a = b;
        this.b = hv0Var;
        this.c = ev0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        ku0 ku0Var;
        String str;
        byte b = this.a;
        ev0 ev0Var = this.c;
        hv0 hv0Var = this.b;
        switch (b) {
            case 0:
                String str2 = (String) obj2;
                hv0Var.u(ev0Var, "emoji_status_access_requested", hv0.x(str2, "status"));
                if (((Boolean) obj).booleanValue() && "allowed".equalsIgnoreCase(str2) && (ku0Var = hv0Var.c) != null) {
                    ku0Var.a();
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                if (hv0Var.c != null && bool.booleanValue()) {
                    hv0Var.c.w(bool2.booleanValue());
                }
                hv0Var.l0.i(new qt0(hv0Var, ev0Var, (byte) 1));
                return;
            case 2:
                String str3 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    uo0 uo0Var = hv0Var.k0;
                    uo0Var.e = true;
                    uo0Var.i();
                }
                hv0Var.s(ev0Var);
                return;
            case 3:
                Boolean bool3 = (Boolean) obj;
                String str4 = (String) obj2;
                if (bool3.booleanValue()) {
                    hv0Var.k0.e = true;
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
                    hv0Var.u(ev0Var, "biometry_auth_requested", jSONObject);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                String str5 = (String) obj;
                TLRPC.Document document = (TLRPC.Document) obj2;
                if (str5 == null) {
                    hv0Var.u(ev0Var, "emoji_status_set", null);
                    ku0 ku0Var2 = hv0Var.c;
                    if (ku0Var2 != null) {
                        ku0Var2.d(document);
                        return;
                    }
                    return;
                }
                hv0Var.u(ev0Var, "emoji_status_failed", hv0.x(str5, "error"));
                return;
        }
    }
}
