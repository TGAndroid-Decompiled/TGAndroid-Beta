package c5;

import android.text.TextUtils;
import org.json.JSONObject;
public final class u {
    public final String f4785a;
    public final String f4786b;
    public final String f4787c;
    public final int d;

    public u(String str) {
        int i10;
        this.f4785a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f4786b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f4787c = optString;
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
        if (!(obj instanceof u)) {
            return false;
        }
        return TextUtils.equals(this.f4785a, ((u) obj).f4785a);
    }

    public final int hashCode() {
        return this.f4785a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f4786b);
        sb2.append("', productType='");
        sb2.append(this.f4787c);
        sb2.append("', statusCode=");
        return a1.g.n(this.d, "}", sb2);
    }
}
