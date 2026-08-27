package g9;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.do0;

public final class f extends JSONObject {
    public f(do0 do0Var, int i10) throws JSONException {
        switch (i10) {
            case 4:
                put("type", "PAYMENT_GATEWAY");
                Object obj = do0Var.I0;
                if (obj == null) {
                    f fVar = new f();
                    fVar.put("gateway", "stripe");
                    fVar.put("stripe:publishableKey", do0Var.f37463f0);
                    fVar.put("stripe:version", "3.5.0");
                    put("parameters", fVar);
                } else {
                    put("parameters", obj);
                }
                break;
            default:
                put("type", "DIRECT");
                f fVar2 = new f();
                fVar2.put("protocolVersion", "ECv2");
                fVar2.put("publicKey", do0Var.G0);
                put("parameters", fVar2);
                break;
        }
    }
}
