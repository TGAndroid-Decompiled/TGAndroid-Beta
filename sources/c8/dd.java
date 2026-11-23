package c8;

import java.util.Date;
import org.json.JSONObject;
import org.telegram.ui.Components.i61;
public abstract class dd {
    public static i61 a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a10 = sd.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(sd.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        uc.a aVar = new uc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, sd.a(jSONObject2.optString("name")), sd.a(jSONObject2.optString("address_line1")), sd.a(jSONObject2.optString("address_line2")), sd.a(jSONObject2.optString("address_city")), sd.a(jSONObject2.optString("address_state")), sd.a(jSONObject2.optString("address_zip")), sd.a(jSONObject2.optString("address_country")), ud.a(sd.a(jSONObject2.optString("brand"))), sd.a(jSONObject2.optString("last4")), sd.a(jSONObject2.optString("fingerprint")), ud.b(sd.a(jSONObject2.optString("funding"))), sd.a(jSONObject2.optString("country")), sd.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new i61(a10, valueOf, aVar, str2);
    }
}
