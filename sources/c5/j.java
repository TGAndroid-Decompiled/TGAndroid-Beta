package c5;

import org.json.JSONObject;
public final class j {
    public final String f3793a;
    public final long f3794b;
    public final String f3795c;
    public final String d;

    public j(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f3795c = jSONObject.optString("priceCurrencyCode");
        this.f3793a = jSONObject.optString("formattedPrice");
        this.f3794b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
