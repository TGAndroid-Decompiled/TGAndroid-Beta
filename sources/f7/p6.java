package f7;

import android.util.Base64;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;
public abstract class p6 {
    public static byte[] a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = d1.g.f4257a;
        String optString = jSONObject.optString("challenge", "");
        kotlin.jvm.internal.i.b(optString);
        if (optString.length() != 0) {
            byte[] decode = Base64.decode(optString, 11);
            kotlin.jvm.internal.i.d(decode, "decode(...)");
            return decode;
        }
        throw new JSONException("Challenge not found in request or is unexpectedly empty");
    }
}
