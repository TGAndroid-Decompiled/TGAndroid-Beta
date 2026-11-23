package f5;

import org.json.JSONObject;
public final class j {
    public final String f11325a;
    public final long f11326b;
    public final String f11327c;
    public final String d;

    public j(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f11327c = jSONObject.optString("priceCurrencyCode");
        this.f11325a = jSONObject.optString("formattedPrice");
        this.f11326b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
