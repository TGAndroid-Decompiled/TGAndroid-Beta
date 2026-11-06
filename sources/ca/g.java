package ca;

import org.json.JSONObject;
import org.telegram.ui.hl0;
public final class g extends JSONObject {
    public g(hl0 hl0Var, int i7) {
        switch (i7) {
            case 4:
                put("type", "PAYMENT_GATEWAY");
                Object obj = hl0Var.M0;
                if (obj != null) {
                    put("parameters", obj);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gateway", "stripe");
                jSONObject.put("stripe:publishableKey", hl0Var.f46407j0);
                jSONObject.put("stripe:version", "3.5.0");
                put("parameters", jSONObject);
                return;
            default:
                put("type", "DIRECT");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("protocolVersion", "ECv2");
                jSONObject2.put("publicKey", hl0Var.K0);
                put("parameters", jSONObject2);
                return;
        }
    }
}
