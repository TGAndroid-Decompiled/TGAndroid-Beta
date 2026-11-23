package ca;

import org.json.JSONObject;
import org.telegram.ui.ml0;
public final class g extends JSONObject {
    public g(ml0 ml0Var, int i7) {
        switch (i7) {
            case 4:
                put("type", "PAYMENT_GATEWAY");
                Object obj = ml0Var.N0;
                if (obj != null) {
                    put("parameters", obj);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gateway", "stripe");
                jSONObject.put("stripe:publishableKey", ml0Var.f49920k0);
                jSONObject.put("stripe:version", "3.5.0");
                put("parameters", jSONObject);
                return;
            default:
                put("type", "DIRECT");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("protocolVersion", "ECv2");
                jSONObject2.put("publicKey", ml0Var.L0);
                put("parameters", jSONObject2);
                return;
        }
    }
}
