package h7;

import java.util.Date;
import org.json.JSONObject;
public abstract class l7 {
    public static androidx.biometric.e a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a2 = x7.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(x7.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        ec.a aVar = new ec.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, x7.a(jSONObject2.optString("name")), x7.a(jSONObject2.optString("address_line1")), x7.a(jSONObject2.optString("address_line2")), x7.a(jSONObject2.optString("address_city")), x7.a(jSONObject2.optString("address_state")), x7.a(jSONObject2.optString("address_zip")), x7.a(jSONObject2.optString("address_country")), z7.a(x7.a(jSONObject2.optString("brand"))), x7.a(jSONObject2.optString("last4")), x7.a(jSONObject2.optString("fingerprint")), z7.b(x7.a(jSONObject2.optString("funding"))), x7.a(jSONObject2.optString("country")), x7.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new androidx.biometric.e(a2, valueOf, aVar, str2);
    }
}
