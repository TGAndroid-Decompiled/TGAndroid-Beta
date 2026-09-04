package c5;

import org.json.JSONObject;
public final class l {
    public final String f4414a;
    public final long f4415b;
    public final String f4416c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f4416c = jSONObject.optString("priceCurrencyCode");
        this.f4414a = jSONObject.optString("formattedPrice");
        this.f4415b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
