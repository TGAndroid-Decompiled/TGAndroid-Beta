package c8;

import java.util.Date;
import org.json.JSONObject;
import org.telegram.ui.md0;
public abstract class bd {
    public static md0 a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a10 = rd.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(rd.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        uc.a aVar = new uc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, rd.a(jSONObject2.optString("name")), rd.a(jSONObject2.optString("address_line1")), rd.a(jSONObject2.optString("address_line2")), rd.a(jSONObject2.optString("address_city")), rd.a(jSONObject2.optString("address_state")), rd.a(jSONObject2.optString("address_zip")), rd.a(jSONObject2.optString("address_country")), td.a(rd.a(jSONObject2.optString("brand"))), rd.a(jSONObject2.optString("last4")), rd.a(jSONObject2.optString("fingerprint")), td.b(rd.a(jSONObject2.optString("funding"))), rd.a(jSONObject2.optString("country")), rd.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new md0(a10, valueOf, aVar, str2);
    }
}
