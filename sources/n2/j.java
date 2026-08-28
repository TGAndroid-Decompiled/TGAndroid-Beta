package n2;

import org.json.JSONObject;
public final class j {
    public final String f18328a;
    public final long f18329b;
    public final String f18330c;
    public final String d;

    public j(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.f18330c = jSONObject.optString("priceCurrencyCode");
        this.f18328a = jSONObject.optString("formattedPrice");
        this.f18329b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
