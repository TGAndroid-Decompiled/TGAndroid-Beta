package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class ln8 {
    public final String a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;

    public ln8(String str) {
        ArrayList arrayList;
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.e = jSONObject.optString("title");
                jSONObject.optString("name");
                jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f = jSONObject.optString("skuDetailsToken");
                this.g = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList2.add(new kn8(optJSONArray.getJSONObject(i)));
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
                JSONObject optJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        arrayList3.add(new in8(optJSONArray2.getJSONObject(i2)));
                    }
                    this.i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new in8(optJSONObject));
                    this.i = arrayList3;
                    return;
                } else {
                    this.i = null;
                    return;
                }
            }
            u36.j("Product type cannot be empty.");
            throw null;
        }
        u36.j("Product id cannot be empty.");
        throw null;
    }

    public final in8 a() {
        ArrayList arrayList = this.i;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (in8) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln8)) {
            return false;
        }
        return TextUtils.equals(this.a, ((ln8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String obj = this.b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb = new StringBuilder("ProductDetails{jsonString='");
        kt6.v(sb, this.a, "', parsedJson=", obj, ", productId='");
        sb.append(this.c);
        sb.append("', productType='");
        sb.append(this.d);
        sb.append("', title='");
        sb.append(this.e);
        sb.append("', productDetailsToken='");
        sb.append(this.f);
        sb.append("', subscriptionOfferDetails=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
