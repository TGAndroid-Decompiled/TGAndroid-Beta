package j7;

import java.util.Date;
import org.json.JSONObject;
public abstract class w7 {
    public static af.d a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a2 = o8.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(o8.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        gc.a aVar = new gc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, o8.a(jSONObject2.optString("name")), o8.a(jSONObject2.optString("address_line1")), o8.a(jSONObject2.optString("address_line2")), o8.a(jSONObject2.optString("address_city")), o8.a(jSONObject2.optString("address_state")), o8.a(jSONObject2.optString("address_zip")), o8.a(jSONObject2.optString("address_country")), q8.a(o8.a(jSONObject2.optString("brand"))), o8.a(jSONObject2.optString("last4")), o8.a(jSONObject2.optString("fingerprint")), q8.b(o8.a(jSONObject2.optString("funding"))), o8.a(jSONObject2.optString("country")), o8.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new af.d(a2, valueOf, aVar, str2);
    }
}
