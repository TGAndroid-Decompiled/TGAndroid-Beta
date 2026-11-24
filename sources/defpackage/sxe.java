package defpackage;

import java.util.Date;
import org.json.JSONObject;
public abstract class sxe {
    public static wm9 a(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject(str);
        String a = qwe.a(jSONObject.getString("id"));
        long j = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        if ("card".equals(qwe.a(jSONObject.getString("type")))) {
            str2 = "card";
        } else {
            str2 = null;
        }
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        zd1 zd1Var = new zd1(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, qwe.a(jSONObject2.optString("name")), qwe.a(jSONObject2.optString("address_line1")), qwe.a(jSONObject2.optString("address_line2")), qwe.a(jSONObject2.optString("address_city")), qwe.a(jSONObject2.optString("address_state")), qwe.a(jSONObject2.optString("address_zip")), qwe.a(jSONObject2.optString("address_country")), uwe.a(qwe.a(jSONObject2.optString("brand"))), qwe.a(jSONObject2.optString("last4")), qwe.a(jSONObject2.optString("fingerprint")), uwe.b(qwe.a(jSONObject2.optString("funding"))), qwe.a(jSONObject2.optString("country")), qwe.a(jSONObject2.optString("currency")));
        new Date(j * 1000);
        return new wm9(a, valueOf, zd1Var, str2);
    }
}
