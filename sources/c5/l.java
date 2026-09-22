package c5;

import org.json.JSONObject;
public final class l {
    public final String f3907a;
    public final long f3908b;
    public final String f3909c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f3909c = jSONObject.optString("priceCurrencyCode");
        this.f3907a = jSONObject.optString("formattedPrice");
        this.f3908b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
