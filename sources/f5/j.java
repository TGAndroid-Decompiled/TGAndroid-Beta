package f5;

import org.json.JSONObject;
public final class j {
    public final String f11296a;
    public final long f11297b;
    public final String f11298c;
    public final String d;

    public j(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f11298c = jSONObject.optString("priceCurrencyCode");
        this.f11296a = jSONObject.optString("formattedPrice");
        this.f11297b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
