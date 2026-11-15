package f5;

import org.json.JSONObject;
public final class j {
    public final String f10988a;
    public final long f10989b;
    public final String f10990c;
    public final String d;

    public j(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f10990c = jSONObject.optString("priceCurrencyCode");
        this.f10988a = jSONObject.optString("formattedPrice");
        this.f10989b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
