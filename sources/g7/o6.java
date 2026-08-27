package g7;

import android.util.Base64;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class o6 {
    public static byte[] a(JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = d1.g.f4699a;
        String strOptString = jSONObject.optString("challenge", "");
        kotlin.jvm.internal.j.b(strOptString);
        if (strOptString.length() == 0) {
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }
        byte[] bArrDecode = Base64.decode(strOptString, 11);
        kotlin.jvm.internal.j.d(bArrDecode, "decode(...)");
        return bArrDecode;
    }
}
