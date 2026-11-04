package e5;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class l {
    public final String f9609a;
    public final JSONObject f9610b;
    public final String f9611c;
    public final String d;
    public final String f9612e;
    public final String f9613f;
    public final String f9614g;
    public final ArrayList h;
    public final ArrayList f9615i;

    public l(String str) {
        ArrayList arrayList;
        this.f9609a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f9610b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f9611c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f9612e = jSONObject.optString("title");
                jSONObject.optString("name");
                jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f9613f = jSONObject.optString("skuDetailsToken");
                this.f9614g = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        arrayList2.add(new k(optJSONArray.getJSONObject(i3)));
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
                JSONObject optJSONObject = this.f9610b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f9610b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        arrayList3.add(new h(optJSONArray2.getJSONObject(i10)));
                    }
                    this.f9615i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new h(optJSONObject));
                    this.f9615i = arrayList3;
                    return;
                } else {
                    this.f9615i = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final h a() {
        ArrayList arrayList = this.f9615i;
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
        return TextUtils.equals(this.f9609a, ((l) obj).f9609a);
    }

    public final int hashCode() {
        return this.f9609a.hashCode();
    }

    public final String toString() {
        String obj = this.f9610b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        com.google.android.recaptcha.internal.a.s(sb2, this.f9609a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.f9611c);
        sb2.append("', productType='");
        sb2.append(this.d);
        sb2.append("', title='");
        sb2.append(this.f9612e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f9613f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
