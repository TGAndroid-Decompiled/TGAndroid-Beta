package f5;

import org.json.JSONObject;
public final class j {
    public final String f11287a;
    public final long f11288b;
    public final String f11289c;
    public final String d;

    public j(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f11289c = jSONObject.optString("priceCurrencyCode");
        this.f11287a = jSONObject.optString("formattedPrice");
        this.f11288b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
