package defpackage;

import android.util.Base64;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;
public abstract class ure {
    public static byte[] a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = lu8.a;
        String optString = jSONObject.optString("challenge", "");
        optString.getClass();
        if (optString.length() != 0) {
            byte[] decode = Base64.decode(optString, 11);
            decode.getClass();
            return decode;
        }
        throw new JSONException("Challenge not found in request or is unexpectedly empty");
    }
}
