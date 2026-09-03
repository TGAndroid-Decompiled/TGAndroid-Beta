package j9;

import org.json.JSONObject;
import org.telegram.ui.lo0;
public final class f extends JSONObject {
    public f(lo0 lo0Var, int i10) {
        switch (i10) {
            case 4:
                put("type", "PAYMENT_GATEWAY");
                Object obj = lo0Var.J0;
                if (obj != null) {
                    put("parameters", obj);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gateway", "stripe");
                jSONObject.put("stripe:publishableKey", lo0Var.f35828g0);
                jSONObject.put("stripe:version", "3.5.0");
                put("parameters", jSONObject);
                return;
            default:
                put("type", "DIRECT");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("protocolVersion", "ECv2");
                jSONObject2.put("publicKey", lo0Var.H0);
                put("parameters", jSONObject2);
                return;
        }
    }
}
