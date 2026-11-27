package defpackage;

import org.json.JSONObject;
import org.telegram.ui.p;
public final class qf7 extends JSONObject {
    public qf7(p pVar, byte b) {
        switch (b) {
            case 4:
                put("type", "PAYMENT_GATEWAY");
                Object obj = pVar.N0;
                if (obj != null) {
                    put("parameters", obj);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("gateway", "stripe");
                jSONObject.put("stripe:publishableKey", pVar.k0);
                jSONObject.put("stripe:version", "3.5.0");
                put("parameters", jSONObject);
                return;
            default:
                put("type", "DIRECT");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("protocolVersion", "ECv2");
                jSONObject2.put("publicKey", pVar.L0);
                put("parameters", jSONObject2);
                return;
        }
    }
}
