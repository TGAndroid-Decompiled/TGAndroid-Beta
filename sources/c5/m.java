package c5;

import org.json.JSONObject;
public final class m {
    public final String f4396a;
    public final long f4397b;
    public final String f4398c;
    public final String d;

    public m(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f4398c = jSONObject.optString("priceCurrencyCode");
        this.f4396a = jSONObject.optString("formattedPrice");
        this.f4397b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
