package h9;

import org.json.JSONObject;
import org.telegram.ui.bo0;
public final class f extends JSONObject {
    public f(bo0 bo0Var, int i10) {
        switch (i10) {
            case 4:
                put("type", "PAYMENT_GATEWAY");
                Object obj = bo0Var.I0;
                if (obj != null) {
                    put("parameters", obj);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gateway", "stripe");
                jSONObject.put("stripe:publishableKey", bo0Var.f36850f0);
                jSONObject.put("stripe:version", "3.5.0");
                put("parameters", jSONObject);
                return;
            default:
                put("type", "DIRECT");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("protocolVersion", "ECv2");
                jSONObject2.put("publicKey", bo0Var.G0);
                put("parameters", jSONObject2);
                return;
        }
    }
}
