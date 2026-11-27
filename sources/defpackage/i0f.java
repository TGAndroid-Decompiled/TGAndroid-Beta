package defpackage;

import java.util.Date;
import org.json.JSONObject;
public abstract class i0f {
    public static ko9 a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a = ize.a(jSONObject.getString("id"));
        long j = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(ize.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        zc1 zc1Var = new zc1(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, ize.a(jSONObject2.optString("name")), ize.a(jSONObject2.optString("address_line1")), ize.a(jSONObject2.optString("address_line2")), ize.a(jSONObject2.optString("address_city")), ize.a(jSONObject2.optString("address_state")), ize.a(jSONObject2.optString("address_zip")), ize.a(jSONObject2.optString("address_country")), lze.a(ize.a(jSONObject2.optString("brand"))), ize.a(jSONObject2.optString("last4")), ize.a(jSONObject2.optString("fingerprint")), lze.b(ize.a(jSONObject2.optString("funding"))), ize.a(jSONObject2.optString("country")), ize.a(jSONObject2.optString("currency")));
        new Date(j * 1000);
        return new ko9(a, valueOf, zc1Var, str2);
    }
}
