package c5;

import org.json.JSONObject;
public final class l {
    public final String f4441a;
    public final long f4442b;
    public final String f4443c;
    public final String d;

    public l(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f4443c = jSONObject.optString("priceCurrencyCode");
        this.f4441a = jSONObject.optString("formattedPrice");
        this.f4442b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
