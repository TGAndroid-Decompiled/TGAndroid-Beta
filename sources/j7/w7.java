package j7;

import java.util.Date;
import org.json.JSONObject;
public abstract class w7 {
    public static androidx.biometric.e a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a2 = n8.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(n8.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        gc.a aVar = new gc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, n8.a(jSONObject2.optString("name")), n8.a(jSONObject2.optString("address_line1")), n8.a(jSONObject2.optString("address_line2")), n8.a(jSONObject2.optString("address_city")), n8.a(jSONObject2.optString("address_state")), n8.a(jSONObject2.optString("address_zip")), n8.a(jSONObject2.optString("address_country")), p8.a(n8.a(jSONObject2.optString("brand"))), n8.a(jSONObject2.optString("last4")), n8.a(jSONObject2.optString("fingerprint")), p8.b(n8.a(jSONObject2.optString("funding"))), n8.a(jSONObject2.optString("country")), n8.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new androidx.biometric.e(a2, valueOf, aVar, str2);
    }
}
