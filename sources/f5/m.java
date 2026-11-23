package f5;

import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class m {
    public final String f11331a;
    public final JSONObject f11332b;
    public final String f11333c;
    public final String d;
    public final String f11334e;
    public final String f11335f;
    public final String f11336g;
    public final ArrayList h;
    public final ArrayList f11337i;

    public m(String str) {
        ArrayList arrayList;
        this.f11331a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f11332b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f11333c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f11334e = jSONObject.optString("title");
                jSONObject.optString("name");
                jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f11335f = jSONObject.optString("skuDetailsToken");
                this.f11336g = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                        arrayList2.add(new l(optJSONArray.getJSONObject(i7)));
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
                JSONObject optJSONObject = this.f11332b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f11332b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        arrayList3.add(new i(optJSONArray2.getJSONObject(i10)));
                    }
                    this.f11337i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new i(optJSONObject));
                    this.f11337i = arrayList3;
                    return;
                } else {
                    this.f11337i = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final i a() {
        ArrayList arrayList = this.f11337i;
        if (arrayList != null && !arrayList.isEmpty()) {
            return (i) arrayList.get(0);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return TextUtils.equals(this.f11331a, ((m) obj).f11331a);
    }

    public final int hashCode() {
        return this.f11331a.hashCode();
    }

    public final String toString() {
        String obj = this.f11332b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        e2.r(sb2, this.f11331a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.f11333c);
        sb2.append("', productType='");
        sb2.append(this.d);
        sb2.append("', title='");
        sb2.append(this.f11334e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f11335f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
