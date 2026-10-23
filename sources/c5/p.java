package c5;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class p {
    public final String f4778a;
    public final JSONObject f4779b;
    public final String f4780c;
    public final String d;
    public final String e;
    public final String f4781f;
    public final String f4782g;
    public final ArrayList h;
    public final ArrayList f4783i;

    public p(String str) {
        ArrayList arrayList;
        this.f4778a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f4779b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f4780c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.e = jSONObject.optString("title");
                jSONObject.optString("name");
                jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f4781f = jSONObject.optString("skuDetailsToken");
                this.f4782g = jSONObject.optString("serializedDocid");
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
                JSONObject optJSONObject = this.f4779b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f4779b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        arrayList3.add(new l(optJSONArray2.getJSONObject(i11)));
                    }
                    this.f4783i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new l(optJSONObject));
                    this.f4783i = arrayList3;
                    return;
                } else {
                    this.f4783i = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final l a() {
        ArrayList arrayList = this.f4783i;
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
        return TextUtils.equals(this.f4778a, ((p) obj).f4778a);
    }

    public final int hashCode() {
        return this.f4778a.hashCode();
    }

    public final String toString() {
        String obj = this.f4779b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        a1.g.A(sb2, this.f4778a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.f4780c);
        sb2.append("', productType='");
        sb2.append(this.d);
        sb2.append("', title='");
        sb2.append(this.e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f4781f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
