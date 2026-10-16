package c5;

import org.json.JSONObject;
public final class m {
    public final String f4399a;
    public final long f4400b;
    public final String f4401c;
    public final String d;

    public m(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f4401c = jSONObject.optString("priceCurrencyCode");
        this.f4399a = jSONObject.optString("formattedPrice");
        this.f4400b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
