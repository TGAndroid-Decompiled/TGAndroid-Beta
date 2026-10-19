package c5;

import org.json.JSONObject;
public final class m {
    public final String f4767a;
    public final long f4768b;
    public final String f4769c;
    public final String d;

    public m(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f4769c = jSONObject.optString("priceCurrencyCode");
        this.f4767a = jSONObject.optString("formattedPrice");
        this.f4768b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
