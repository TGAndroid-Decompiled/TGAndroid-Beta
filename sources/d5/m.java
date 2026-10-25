package d5;

import org.json.JSONObject;
public final class m {
    public final String f7994a;
    public final long f7995b;
    public final String f7996c;
    public final String d;

    public m(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f7996c = jSONObject.optString("priceCurrencyCode");
        this.f7994a = jSONObject.optString("formattedPrice");
        this.f7995b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
