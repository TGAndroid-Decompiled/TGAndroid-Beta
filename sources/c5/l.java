package c5;

import org.json.JSONObject;
public final class l {
    public final String f3910a;
    public final long f3911b;
    public final String f3912c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f3912c = jSONObject.optString("priceCurrencyCode");
        this.f3910a = jSONObject.optString("formattedPrice");
        this.f3911b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
