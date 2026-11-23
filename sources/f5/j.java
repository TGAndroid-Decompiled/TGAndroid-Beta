package f5;

import org.json.JSONObject;
public final class j {
    public final String f11288a;
    public final long f11289b;
    public final String f11290c;
    public final String d;

    public j(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f11290c = jSONObject.optString("priceCurrencyCode");
        this.f11288a = jSONObject.optString("formattedPrice");
        this.f11289b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
