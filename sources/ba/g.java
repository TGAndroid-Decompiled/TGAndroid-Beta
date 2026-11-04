package ba;

import org.json.JSONObject;
import org.telegram.ui.dl0;
public final class g extends JSONObject {
    public g(dl0 dl0Var, int i3) {
        switch (i3) {
            case 4:
                put("type", "PAYMENT_GATEWAY");
                Object obj = dl0Var.N0;
                if (obj != null) {
                    put("parameters", obj);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gateway", "stripe");
                jSONObject.put("stripe:publishableKey", dl0Var.f44758k0);
                jSONObject.put("stripe:version", "3.5.0");
                put("parameters", jSONObject);
                return;
            default:
                put("type", "DIRECT");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("protocolVersion", "ECv2");
                jSONObject2.put("publicKey", dl0Var.L0);
                put("parameters", jSONObject2);
                return;
        }
    }
}
