package f5;

import android.text.TextUtils;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
public final class m {
    public final String f11299a;
    public final JSONObject f11300b;
    public final String f11301c;
    public final String d;
    public final String f11302e;
    public final String f11303f;
    public final String f11304g;
    public final ArrayList h;
    public final ArrayList f11305i;

    public m(String str) {
        ArrayList arrayList;
        this.f11299a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f11300b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f11301c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f11302e = jSONObject.optString("title");
                jSONObject.optString("name");
                jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.f11303f = jSONObject.optString("skuDetailsToken");
                this.f11304g = jSONObject.optString("serializedDocid");
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
                JSONObject optJSONObject = this.f11300b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f11300b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                        arrayList3.add(new i(optJSONArray2.getJSONObject(i10)));
                    }
                    this.f11305i = arrayList3;
                    return;
                } else if (optJSONObject != null) {
                    arrayList3.add(new i(optJSONObject));
                    this.f11305i = arrayList3;
                    return;
                } else {
                    this.f11305i = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    public final i a() {
        ArrayList arrayList = this.f11305i;
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
        return TextUtils.equals(this.f11299a, ((m) obj).f11299a);
    }

    public final int hashCode() {
        return this.f11299a.hashCode();
    }

    public final String toString() {
        String obj = this.f11300b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        e2.r(sb2, this.f11299a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.f11301c);
        sb2.append("', productType='");
        sb2.append(this.d);
        sb2.append("', title='");
        sb2.append(this.f11302e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f11303f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
