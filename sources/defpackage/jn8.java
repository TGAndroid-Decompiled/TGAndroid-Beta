package defpackage;

import org.json.JSONObject;
public final class jn8 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;

    public jn8(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.c = jSONObject.optString("priceCurrencyCode");
        this.a = jSONObject.optString("formattedPrice");
        this.b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
