package f5;

import org.json.JSONObject;
public final class i {
    public final String f11165a;
    public final long f11166b;
    public final String f11167c;
    public final String d;

    public i(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f11167c = jSONObject.optString("priceCurrencyCode");
        this.f11165a = jSONObject.optString("formattedPrice");
        this.f11166b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
