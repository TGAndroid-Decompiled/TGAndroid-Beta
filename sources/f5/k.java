package f5;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class k {
    public final String f11164a;
    public final j f11165b;

    public k(JSONObject jSONObject) {
        jSONObject.optString("basePlanId");
        jSONObject.optString("offerId").getClass();
        this.f11164a = jSONObject.getString("offerIdToken");
        this.f11165b = new j(jSONObject.getJSONArray("pricingPhases"));
        JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        if (optJSONObject != null) {
            optJSONObject.getInt("commitmentPaymentsCount");
            optJSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (optJSONObject2 != null) {
            optJSONObject2.getString("productId");
            optJSONObject2.optString("title");
            optJSONObject2.optString("name");
            optJSONObject2.optString("description");
            optJSONObject2.optString("basePlanId");
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("pricingPhase");
            if (optJSONObject3 != null) {
                optJSONObject3.optString("billingPeriod");
                optJSONObject3.optString("priceCurrencyCode");
                optJSONObject3.optString("formattedPrice");
                optJSONObject3.optLong("priceAmountMicros");
                optJSONObject3.optInt("recurrenceMode");
                optJSONObject3.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                arrayList.add(optJSONArray.getString(i7));
            }
        }
    }
}
