package n2;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class l {

    public final String f18161a;

    public final JSONObject f18162b;

    public final String f18163c;
    public final String d;

    public final String f18164e;

    public final String f18165f;

    public final String f18166g;
    public final ArrayList h;

    public final ArrayList f18167i;

    public l(String str) {
        this.f18161a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f18162b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f18163c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f18164e = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f18165f = jSONObject.optString("skuDetailsToken");
        this.f18166g = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new k(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.h = arrayList;
        } else {
            this.h = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f18162b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f18162b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new i(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f18167i = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f18167i = null;
        } else {
            arrayList2.add(new i(jSONObjectOptJSONObject));
            this.f18167i = arrayList2;
        }
    }

    public final i a() {
        ArrayList arrayList = this.f18167i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (i) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return TextUtils.equals(this.f18161a, ((l) obj).f18161a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18161a.hashCode();
    }

    public final String toString() {
        String string = this.f18162b.toString();
        String strValueOf = String.valueOf(this.h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        i0.a.z(sb2, this.f18161a, "', parsedJson=", string, ", productId='");
        sb2.append(this.f18163c);
        sb2.append("', productType='");
        sb2.append(this.d);
        sb2.append("', title='");
        sb2.append(this.f18164e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f18165f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
