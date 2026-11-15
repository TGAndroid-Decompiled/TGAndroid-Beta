package f5;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class l {
    public final String f10992a;
    public final k f10993b;

    public l(JSONObject jSONObject) {
        jSONObject.optString("basePlanId");
        jSONObject.optString("offerId").getClass();
        this.f10992a = jSONObject.getString("offerIdToken");
        JSONArray jSONArray = jSONObject.getJSONArray("pricingPhases");
        ?? obj = new Object();
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i7);
                if (optJSONObject != null) {
                    arrayList.add(new j(optJSONObject));
                }
            }
        }
        obj.f10991a = arrayList;
        this.f10993b = obj;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("installmentPlanDetails");
        if (optJSONObject2 != null) {
            optJSONObject2.getInt("commitmentPaymentsCount");
            optJSONObject2.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("transitionPlanDetails");
        if (optJSONObject3 != null) {
            optJSONObject3.getString("productId");
            optJSONObject3.optString("title");
            optJSONObject3.optString("name");
            optJSONObject3.optString("description");
            optJSONObject3.optString("basePlanId");
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("pricingPhase");
            if (optJSONObject4 != null) {
                optJSONObject4.optString("billingPeriod");
                optJSONObject4.optString("priceCurrencyCode");
                optJSONObject4.optString("formattedPrice");
                optJSONObject4.optLong("priceAmountMicros");
                optJSONObject4.optInt("recurrenceMode");
                optJSONObject4.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList2.add(optJSONArray.getString(i10));
            }
        }
    }
}
