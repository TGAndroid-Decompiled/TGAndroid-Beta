package c5;

import org.json.JSONObject;
public final class l {
    public final String f3901a;
    public final long f3902b;
    public final String f3903c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f3903c = jSONObject.optString("priceCurrencyCode");
        this.f3901a = jSONObject.optString("formattedPrice");
        this.f3902b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
