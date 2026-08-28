package f9;

import org.json.JSONObject;
import org.telegram.ui.co0;
public final class f extends JSONObject {
    public f(co0 co0Var, int i9) {
        switch (i9) {
            case 4:
                put("type", "PAYMENT_GATEWAY");
                Object obj = co0Var.I0;
                if (obj != null) {
                    put("parameters", obj);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gateway", "stripe");
                jSONObject.put("stripe:publishableKey", co0Var.f37257f0);
                jSONObject.put("stripe:version", "3.5.0");
                put("parameters", jSONObject);
                return;
            default:
                put("type", "DIRECT");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("protocolVersion", "ECv2");
                jSONObject2.put("publicKey", co0Var.G0);
                put("parameters", jSONObject2);
                return;
        }
    }
}
