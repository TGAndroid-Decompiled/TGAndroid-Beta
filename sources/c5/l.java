package c5;

import org.json.JSONObject;
public final class l {
    public final String f3904a;
    public final long f3905b;
    public final String f3906c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f3906c = jSONObject.optString("priceCurrencyCode");
        this.f3904a = jSONObject.optString("formattedPrice");
        this.f3905b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
