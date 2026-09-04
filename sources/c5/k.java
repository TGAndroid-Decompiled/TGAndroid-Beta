package c5;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class k {
    public final String f4408a;
    public final long f4409b;
    public final String f4410c;
    public final String d;
    public final ArrayList f4411e;
    public final String f4412f;
    public final na.d f4413g;

    public k(JSONObject jSONObject) {
        this.f4408a = jSONObject.optString("formattedPrice");
        this.f4409b = jSONObject.optLong("priceAmountMicros");
        this.f4410c = jSONObject.optString("priceCurrencyCode");
        String optString = jSONObject.optString("offerIdToken");
        na.d dVar = null;
        this.d = true == optString.isEmpty() ? null : optString;
        jSONObject.optString("offerId").getClass();
        jSONObject.optString("purchaseOptionId").getClass();
        jSONObject.optInt("offerType");
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        this.f4411e = new ArrayList();
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                this.f4411e.add(optJSONArray.getString(i10));
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
        this.f4412f = jSONObject.optString("serializedDocid");
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
            Object obj = new Object();
            optJSONObject7.getString("type");
            dVar = obj;
        }
        this.f4413g = dVar;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("pricingPhases");
        if (optJSONArray2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                JSONObject optJSONObject8 = optJSONArray2.optJSONObject(i11);
                if (optJSONObject8 != null) {
                    arrayList.add(new l(optJSONObject8));
                }
            }
        }
    }
}
