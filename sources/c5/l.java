package c5;

import org.json.JSONObject;
public final class l {
    public final String f4270a;
    public final long f4271b;
    public final String f4272c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f4272c = jSONObject.optString("priceCurrencyCode");
        this.f4270a = jSONObject.optString("formattedPrice");
        this.f4271b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
