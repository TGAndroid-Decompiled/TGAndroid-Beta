package c8;

import java.util.Date;
import org.json.JSONObject;
import org.telegram.ui.hy0;
public abstract class xc {
    public static hy0 a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a10 = nd.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(nd.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        uc.a aVar = new uc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, nd.a(jSONObject2.optString("name")), nd.a(jSONObject2.optString("address_line1")), nd.a(jSONObject2.optString("address_line2")), nd.a(jSONObject2.optString("address_city")), nd.a(jSONObject2.optString("address_state")), nd.a(jSONObject2.optString("address_zip")), nd.a(jSONObject2.optString("address_country")), pd.a(nd.a(jSONObject2.optString("brand"))), nd.a(jSONObject2.optString("last4")), nd.a(jSONObject2.optString("fingerprint")), pd.b(nd.a(jSONObject2.optString("funding"))), nd.a(jSONObject2.optString("country")), nd.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new hy0(a10, valueOf, aVar, str2);
    }
}
