package c5;

import org.json.JSONObject;
public final class m {
    public final String f4768a;
    public final long f4769b;
    public final String f4770c;
    public final String d;

    public m(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f4770c = jSONObject.optString("priceCurrencyCode");
        this.f4768a = jSONObject.optString("formattedPrice");
        this.f4769b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
