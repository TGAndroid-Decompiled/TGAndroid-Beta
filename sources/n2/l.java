package n2;

import android.text.TextUtils;
import j3.r0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class l {
    public final String f18333a;
    public final JSONObject f18334b;
    public final String f18335c;
    public final String d;
    public final String f18336e;
    public final String f18337f;
    public final String f18338g;
    public final ArrayList h;
    public final ArrayList f18339i;

    public l(String str) {
        ArrayList arrayList;
        this.f18333a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f18334b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f18335c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f18336e = jSONObject.optString("title");
                jSONObject.optString("name");
                jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f18337f = jSONObject.optString("skuDetailsToken");
                this.f18338g = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                        arrayList2.add(new k(optJSONArray.getJSONObject(i9)));
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
                JSONObject optJSONObject = this.f18334b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f18334b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        arrayList3.add(new i(optJSONArray2.getJSONObject(i10)));
                    }
                    this.f18339i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new i(optJSONObject));
                    this.f18339i = arrayList3;
                    return;
                } else {
                    this.f18339i = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final i a() {
        ArrayList arrayList = this.f18339i;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (i) arrayList.get(0);
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
        return TextUtils.equals(this.f18333a, ((l) obj).f18333a);
    }

    public final int hashCode() {
        return this.f18333a.hashCode();
    }

    public final String toString() {
        String obj = this.f18334b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        r0.A(sb2, this.f18333a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.f18335c);
        sb2.append("', productType='");
        sb2.append(this.d);
        sb2.append("', title='");
        sb2.append(this.f18336e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f18337f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
