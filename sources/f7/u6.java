package f7;

import java.util.Date;
import org.json.JSONObject;
public abstract class u6 {
    public static a5.m a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a2 = j7.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(j7.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        cc.a aVar = new cc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, j7.a(jSONObject2.optString("name")), j7.a(jSONObject2.optString("address_line1")), j7.a(jSONObject2.optString("address_line2")), j7.a(jSONObject2.optString("address_city")), j7.a(jSONObject2.optString("address_state")), j7.a(jSONObject2.optString("address_zip")), j7.a(jSONObject2.optString("address_country")), l7.a(j7.a(jSONObject2.optString("brand"))), j7.a(jSONObject2.optString("last4")), j7.a(jSONObject2.optString("fingerprint")), l7.b(j7.a(jSONObject2.optString("funding"))), j7.a(jSONObject2.optString("country")), j7.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new a5.m(a2, valueOf, aVar, str2);
    }
}
