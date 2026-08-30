package j9;

import org.json.JSONObject;
import org.telegram.ui.jo0;
public final class f extends JSONObject {
    public f(jo0 jo0Var, int i10) {
        switch (i10) {
            case 4:
                put("type", "PAYMENT_GATEWAY");
                Object obj = jo0Var.J0;
                if (obj != null) {
                    put("parameters", obj);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gateway", "stripe");
                jSONObject.put("stripe:publishableKey", jo0Var.f35401g0);
                jSONObject.put("stripe:version", "3.5.0");
                put("parameters", jSONObject);
                return;
            default:
                put("type", "DIRECT");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("protocolVersion", "ECv2");
                jSONObject2.put("publicKey", jo0Var.H0);
                put("parameters", jSONObject2);
                return;
        }
    }
}
