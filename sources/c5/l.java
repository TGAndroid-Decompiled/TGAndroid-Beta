package c5;

import org.json.JSONObject;
public final class l {
    public final String f3906a;
    public final long f3907b;
    public final String f3908c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f3908c = jSONObject.optString("priceCurrencyCode");
        this.f3906a = jSONObject.optString("formattedPrice");
        this.f3907b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
