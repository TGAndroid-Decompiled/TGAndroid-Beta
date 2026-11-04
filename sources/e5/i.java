package e5;

import org.json.JSONObject;
public final class i {
    public final String f9602a;
    public final long f9603b;
    public final String f9604c;
    public final String d;

    public i(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f9604c = jSONObject.optString("priceCurrencyCode");
        this.f9602a = jSONObject.optString("formattedPrice");
        this.f9603b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
