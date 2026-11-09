package c8;

import java.util.Date;
import org.json.JSONObject;
import org.telegram.ui.ky0;
public abstract class yc {
    public static ky0 a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a10 = od.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(od.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        uc.a aVar = new uc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, od.a(jSONObject2.optString("name")), od.a(jSONObject2.optString("address_line1")), od.a(jSONObject2.optString("address_line2")), od.a(jSONObject2.optString("address_city")), od.a(jSONObject2.optString("address_state")), od.a(jSONObject2.optString("address_zip")), od.a(jSONObject2.optString("address_country")), qd.a(od.a(jSONObject2.optString("brand"))), od.a(jSONObject2.optString("last4")), od.a(jSONObject2.optString("fingerprint")), qd.b(od.a(jSONObject2.optString("funding"))), od.a(jSONObject2.optString("country")), od.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new ky0(a10, valueOf, aVar, str2);
    }
}
