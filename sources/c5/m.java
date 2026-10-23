package c5;

import org.json.JSONObject;
public final class m {
    public final String f4772a;
    public final long f4773b;
    public final String f4774c;
    public final String d;

    public m(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f4774c = jSONObject.optString("priceCurrencyCode");
        this.f4772a = jSONObject.optString("formattedPrice");
        this.f4773b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
