package f5;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class h {
    public final String f11159a;
    public final long f11160b;
    public final String f11161c;
    public final String d;
    public final ArrayList f11162e;
    public final String f11163f;
    public final nb.a f11164g;

    public h(JSONObject jSONObject) {
        this.f11159a = jSONObject.optString("formattedPrice");
        this.f11160b = jSONObject.optLong("priceAmountMicros");
        this.f11161c = jSONObject.optString("priceCurrencyCode");
        String optString = jSONObject.optString("offerIdToken");
        nb.a aVar = null;
        this.d = true == optString.isEmpty() ? null : optString;
        jSONObject.optString("offerId").getClass();
        jSONObject.optString("purchaseOptionId").getClass();
        jSONObject.optInt("offerType");
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        this.f11162e = new ArrayList();
        if (optJSONArray != null) {
            for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                this.f11162e.add(optJSONArray.getString(i7));
            }
        }
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (optJSONObject != null) {
            if (optJSONObject.has("percentageDiscount")) {
                optJSONObject.optInt("percentageDiscount");
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("discountAmount");
            if (optJSONObject2 != null) {
                optJSONObject2.optString("formattedDiscountAmount");
                optJSONObject2.optLong("discountAmountMicros");
                optJSONObject2.optString("discountAmountCurrencyCode");
            }
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("validTimeWindow");
        if (optJSONObject3 != null) {
            if (optJSONObject3.has("startTimeMillis")) {
                optJSONObject3.optLong("startTimeMillis");
            }
            if (optJSONObject3.has("endTimeMillis")) {
                optJSONObject3.optLong("endTimeMillis");
            }
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (optJSONObject4 != null) {
            optJSONObject4.getInt("maximumQuantity");
            optJSONObject4.getInt("remainingQuantity");
        }
        this.f11163f = jSONObject.optString("serializedDocid");
        JSONObject optJSONObject5 = jSONObject.optJSONObject("preorderDetails");
        if (optJSONObject5 != null) {
            optJSONObject5.getLong("preorderReleaseTimeMillis");
            optJSONObject5.getLong("preorderPresaleEndTimeMillis");
        }
        JSONObject optJSONObject6 = jSONObject.optJSONObject("rentalDetails");
        if (optJSONObject6 != null) {
            optJSONObject6.getString("rentalPeriod");
            optJSONObject6.optString("rentalExpirationPeriod").getClass();
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("autoPayDetails");
        if (optJSONObject7 != null) {
            aVar = new nb.a(9);
            optJSONObject7.getString("type");
        }
        this.f11164g = aVar;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("pricingPhases");
        if (optJSONArray2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                JSONObject optJSONObject8 = optJSONArray2.optJSONObject(i10);
                if (optJSONObject8 != null) {
                    arrayList.add(new i(optJSONObject8));
                }
            }
        }
    }
}
