package g7;

import java.util.Date;
import org.json.JSONObject;

public abstract class v6 {
    public static a5.n a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String strA = k7.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(k7.a(jSONObject.getString("type"))) ? "card" : null;
        Boolean boolValueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        dc.a aVar = new dc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, k7.a(jSONObject2.optString("name")), k7.a(jSONObject2.optString("address_line1")), k7.a(jSONObject2.optString("address_line2")), k7.a(jSONObject2.optString("address_city")), k7.a(jSONObject2.optString("address_state")), k7.a(jSONObject2.optString("address_zip")), k7.a(jSONObject2.optString("address_country")), m7.a(k7.a(jSONObject2.optString("brand"))), k7.a(jSONObject2.optString("last4")), k7.a(jSONObject2.optString("fingerprint")), m7.b(k7.a(jSONObject2.optString("funding"))), k7.a(jSONObject2.optString("country")), k7.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new a5.n(strA, boolValueOf, aVar, str2);
    }
}
