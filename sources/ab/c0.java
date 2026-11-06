package ab;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
public final class c0 {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public final String f911a;
    public final String f912b;
    public final long f913c;

    public c0(long j3, String str, String str2) {
        this.f911a = str;
        this.f912b = str2;
        this.f913c = j3;
    }

    public static String a(long j3, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j3);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
            return null;
        }
    }

    public static c0 b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new c0(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }
        return new c0(0L, str, null);
    }
}
