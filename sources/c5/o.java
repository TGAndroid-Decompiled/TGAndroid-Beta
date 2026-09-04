package c5;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class o {
    public final String f4420a;
    public final JSONObject f4421b;
    public final String f4422c;
    public final String d;
    public final String f4423e;
    public final String f4424f;
    public final String f4425g;
    public final ArrayList h;
    public final ArrayList f4426i;

    public o(String str) {
        ArrayList arrayList;
        this.f4420a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f4421b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f4422c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f4423e = jSONObject.optString("title");
                jSONObject.optString("name");
                jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f4424f = jSONObject.optString("skuDetailsToken");
                this.f4425g = jSONObject.optString("serializedDocid");
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
                JSONObject optJSONObject = this.f4421b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f4421b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        arrayList3.add(new k(optJSONArray2.getJSONObject(i11)));
                    }
                    this.f4426i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new k(optJSONObject));
                    this.f4426i = arrayList3;
                    return;
                } else {
                    this.f4426i = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final k a() {
        ArrayList arrayList = this.f4426i;
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
        return TextUtils.equals(this.f4420a, ((o) obj).f4420a);
    }

    public final int hashCode() {
        return this.f4420a.hashCode();
    }

    public final String toString() {
        String obj = this.f4421b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        a4.a.z(sb2, this.f4420a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.f4422c);
        sb2.append("', productType='");
        sb2.append(this.d);
        sb2.append("', title='");
        sb2.append(this.f4423e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f4424f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
