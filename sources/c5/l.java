package c5;

import org.json.JSONObject;
public final class l {
    public final String f3909a;
    public final long f3910b;
    public final String f3911c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f3911c = jSONObject.optString("priceCurrencyCode");
        this.f3909a = jSONObject.optString("formattedPrice");
        this.f3910b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
