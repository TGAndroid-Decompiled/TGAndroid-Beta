package c5;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class p {
    public final String f4775a;
    public final JSONObject f4776b;
    public final String f4777c;
    public final String d;
    public final String e;
    public final String f4778f;
    public final String f4779g;
    public final ArrayList h;
    public final ArrayList f4780i;

    public p(String str) {
        ArrayList arrayList;
        this.f4775a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f4776b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f4777c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.e = jSONObject.optString("title");
                jSONObject.optString("name");
                jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f4778f = jSONObject.optString("skuDetailsToken");
                this.f4779g = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        arrayList2.add(new o(optJSONArray.getJSONObject(i10)));
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
                JSONObject optJSONObject = this.f4776b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f4776b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        arrayList3.add(new l(optJSONArray2.getJSONObject(i11)));
                    }
                    this.f4780i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new l(optJSONObject));
                    this.f4780i = arrayList3;
                    return;
                } else {
                    this.f4780i = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final l a() {
        ArrayList arrayList = this.f4780i;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (l) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return TextUtils.equals(this.f4775a, ((p) obj).f4775a);
    }

    public final int hashCode() {
        return this.f4775a.hashCode();
    }

    public final String toString() {
        String obj = this.f4776b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        a1.g.A(sb2, this.f4775a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.f4777c);
        sb2.append("', productType='");
        sb2.append(this.d);
        sb2.append("', title='");
        sb2.append(this.e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f4778f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
