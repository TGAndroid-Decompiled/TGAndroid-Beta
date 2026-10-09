package c5;

import org.json.JSONObject;
public final class l {
    public final String f4271a;
    public final long f4272b;
    public final String f4273c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f4273c = jSONObject.optString("priceCurrencyCode");
        this.f4271a = jSONObject.optString("formattedPrice");
        this.f4272b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
