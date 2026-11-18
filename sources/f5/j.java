package f5;

import org.json.JSONObject;
public final class j {
    public final String f11293a;
    public final long f11294b;
    public final String f11295c;
    public final String d;

    public j(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f11295c = jSONObject.optString("priceCurrencyCode");
        this.f11293a = jSONObject.optString("formattedPrice");
        this.f11294b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
