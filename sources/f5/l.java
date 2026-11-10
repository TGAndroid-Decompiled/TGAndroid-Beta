package f5;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class l {
    public final String f11171a;
    public final JSONObject f11172b;
    public final String f11173c;
    public final String d;
    public final String f11174e;
    public final String f11175f;
    public final String f11176g;
    public final ArrayList h;
    public final ArrayList f11177i;

    public l(String str) {
        ArrayList arrayList;
        this.f11171a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f11172b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f11173c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f11174e = jSONObject.optString("title");
                jSONObject.optString("name");
                jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f11175f = jSONObject.optString("skuDetailsToken");
                this.f11176g = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                        arrayList2.add(new k(optJSONArray.getJSONObject(i7)));
                    }
                    this.h = arrayList2;
                } else {
                    if (!optString2.equals("subs") && !optString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.h = arrayList;
                }
                JSONObject optJSONObject = this.f11172b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f11172b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        arrayList3.add(new h(optJSONArray2.getJSONObject(i10)));
                    }
                    this.f11177i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new h(optJSONObject));
                    this.f11177i = arrayList3;
                    return;
                } else {
                    this.f11177i = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final h a() {
        ArrayList arrayList = this.f11177i;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (h) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return TextUtils.equals(this.f11171a, ((l) obj).f11171a);
    }

    public final int hashCode() {
        return this.f11171a.hashCode();
    }

    public final String toString() {
        String obj = this.f11172b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        com.google.android.recaptcha.internal.a.s(sb2, this.f11171a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.f11173c);
        sb2.append("', productType='");
        sb2.append(this.d);
        sb2.append("', title='");
        sb2.append(this.f11174e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f11175f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
