package f5;

import org.json.JSONObject;
public final class i {
    public final String f11160a;
    public final long f11161b;
    public final String f11162c;
    public final String d;

    public i(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f11162c = jSONObject.optString("priceCurrencyCode");
        this.f11160a = jSONObject.optString("formattedPrice");
        this.f11161b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
