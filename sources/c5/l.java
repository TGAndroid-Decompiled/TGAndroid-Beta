package c5;

import org.json.JSONObject;
public final class l {
    public final String f4221a;
    public final long f4222b;
    public final String f4223c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f4223c = jSONObject.optString("priceCurrencyCode");
        this.f4221a = jSONObject.optString("formattedPrice");
        this.f4222b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
