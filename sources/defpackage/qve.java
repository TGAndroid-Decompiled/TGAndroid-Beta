package defpackage;

import java.util.Date;
import org.json.JSONObject;
public abstract class qve {
    public static vk9 a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a = oue.a(jSONObject.getString("id"));
        long j = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(oue.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        rc1 rc1Var = new rc1(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, oue.a(jSONObject2.optString("name")), oue.a(jSONObject2.optString("address_line1")), oue.a(jSONObject2.optString("address_line2")), oue.a(jSONObject2.optString("address_city")), oue.a(jSONObject2.optString("address_state")), oue.a(jSONObject2.optString("address_zip")), oue.a(jSONObject2.optString("address_country")), sue.a(oue.a(jSONObject2.optString("brand"))), oue.a(jSONObject2.optString("last4")), oue.a(jSONObject2.optString("fingerprint")), sue.b(oue.a(jSONObject2.optString("funding"))), oue.a(jSONObject2.optString("country")), oue.a(jSONObject2.optString("currency")));
        new Date(j * 1000);
        return new vk9(a, valueOf, rc1Var, str2);
    }
}
