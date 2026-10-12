package c5;

import org.json.JSONObject;
public final class l {
    public final String f4269a;
    public final long f4270b;
    public final String f4271c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f4271c = jSONObject.optString("priceCurrencyCode");
        this.f4269a = jSONObject.optString("formattedPrice");
        this.f4270b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
