package c5;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class o {
    public final String f3907a;
    public final JSONObject f3908b;
    public final String f3909c;
    public final String d;
    public final String e;
    public final String f3910f;
    public final String f3911g;
    public final ArrayList h;
    public final ArrayList f3912i;

    public o(String str) {
        ArrayList arrayList;
        this.f3907a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3908b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f3909c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.e = jSONObject.optString("title");
                jSONObject.optString("name");
                jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f3910f = jSONObject.optString("skuDetailsToken");
                this.f3911g = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        arrayList2.add(new n(optJSONArray.getJSONObject(i10)));
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
                JSONObject optJSONObject = this.f3908b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f3908b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        arrayList3.add(new k(optJSONArray2.getJSONObject(i11)));
                    }
                    this.f3912i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new k(optJSONObject));
                    this.f3912i = arrayList3;
                    return;
                } else {
                    this.f3912i = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final k a() {
        ArrayList arrayList = this.f3912i;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (k) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return TextUtils.equals(this.f3907a, ((o) obj).f3907a);
    }

    public final int hashCode() {
        return this.f3907a.hashCode();
    }

    public final String toString() {
        String obj = this.f3908b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        a4.a.A(sb2, this.f3907a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.f3909c);
        sb2.append("', productType='");
        sb2.append(this.d);
        sb2.append("', title='");
        sb2.append(this.e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f3910f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
