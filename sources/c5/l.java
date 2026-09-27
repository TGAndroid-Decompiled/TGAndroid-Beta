package c5;

import org.json.JSONObject;
public final class l {
    public final String f3903a;
    public final long f3904b;
    public final String f3905c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f3905c = jSONObject.optString("priceCurrencyCode");
        this.f3903a = jSONObject.optString("formattedPrice");
        this.f3904b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
