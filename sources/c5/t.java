package c5;

import android.text.TextUtils;
import org.json.JSONObject;
public final class t {
    public final String f3926a;
    public final String f3927b;
    public final String f3928c;
    public final int d;

    public t(String str) {
        int i10;
        this.f3926a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3927b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f3928c = optString;
        if (jSONObject.has("statusCode")) {
            i10 = jSONObject.optInt("statusCode");
        } else {
            i10 = 0;
        }
        this.d = i10;
        if (!TextUtils.isEmpty(optString)) {
            jSONObject.optString("serializedDocid");
            return;
        }
        throw new IllegalArgumentException("Product type cannot be empty.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return TextUtils.equals(this.f3926a, ((t) obj).f3926a);
    }

    public final int hashCode() {
        return this.f3926a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f3927b);
        sb2.append("', productType='");
        sb2.append(this.f3928c);
        sb2.append("', statusCode=");
        return a4.a.n(this.d, "}", sb2);
    }
}
