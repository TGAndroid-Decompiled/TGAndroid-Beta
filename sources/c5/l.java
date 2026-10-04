package c5;

import org.json.JSONObject;
public final class l {
    public final String f4220a;
    public final long f4221b;
    public final String f4222c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f4222c = jSONObject.optString("priceCurrencyCode");
        this.f4220a = jSONObject.optString("formattedPrice");
        this.f4221b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
