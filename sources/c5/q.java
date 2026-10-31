package c5;

import android.text.TextUtils;
import org.json.JSONObject;
public final class q {
    public final String f3807a;
    public final String f3808b;
    public final String f3809c;
    public final int d;

    public q(String str) {
        int i10;
        this.f3807a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3808b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f3809c = optString;
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
        if (!(obj instanceof q)) {
            return false;
        }
        return TextUtils.equals(this.f3807a, ((q) obj).f3807a);
    }

    public final int hashCode() {
        return this.f3807a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f3808b);
        sb2.append("', productType='");
        sb2.append(this.f3809c);
        sb2.append("', statusCode=");
        return a1.g.p(sb2, this.d, "}");
    }
}
