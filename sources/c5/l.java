package c5;

import org.json.JSONObject;
public final class l {
    public final String f4323a;
    public final long f4324b;
    public final String f4325c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f4325c = jSONObject.optString("priceCurrencyCode");
        this.f4323a = jSONObject.optString("formattedPrice");
        this.f4324b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
