package c5;

import org.json.JSONObject;
public final class l {
    public final String f3908a;
    public final long f3909b;
    public final String f3910c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f3910c = jSONObject.optString("priceCurrencyCode");
        this.f3908a = jSONObject.optString("formattedPrice");
        this.f3909b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
