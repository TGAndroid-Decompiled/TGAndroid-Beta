package h7;

import android.util.Base64;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;
public abstract class w6 {
    public static byte[] a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = d1.g.f5266a;
        String optString = jSONObject.optString("challenge", "");
        kotlin.jvm.internal.j.b(optString);
        if (optString.length() != 0) {
            byte[] decode = Base64.decode(optString, 11);
            kotlin.jvm.internal.j.d(decode, "decode(...)");
            return decode;
        }
        throw new JSONException("Challenge not found in request or is unexpectedly empty");
    }
}
