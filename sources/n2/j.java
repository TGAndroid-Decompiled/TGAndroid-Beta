package n2;

import org.json.JSONObject;

public final class j {

    public final String f18156a;

    public final long f18157b;

    public final String f18158c;
    public final String d;

    public j(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f18158c = jSONObject.optString("priceCurrencyCode");
        this.f18156a = jSONObject.optString("formattedPrice");
        this.f18157b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
