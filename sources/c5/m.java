package c5;

import org.json.JSONObject;
public final class m {
    public final String f4769a;
    public final long f4770b;
    public final String f4771c;
    public final String d;

    public m(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f4771c = jSONObject.optString("priceCurrencyCode");
        this.f4769a = jSONObject.optString("formattedPrice");
        this.f4770b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
