package e5;

import android.text.TextUtils;
import org.json.JSONObject;
public final class p {
    public final String f9618a;
    public final String f9619b;
    public final String f9620c;
    public final int d;

    public p(String str) {
        int i3;
        this.f9618a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f9619b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f9620c = optString;
        if (jSONObject.has("statusCode")) {
            i3 = jSONObject.optInt("statusCode");
        } else {
            i3 = 0;
        }
        this.d = i3;
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
        if (!(obj instanceof p)) {
            return false;
        }
        return TextUtils.equals(this.f9618a, ((p) obj).f9618a);
    }

    public final int hashCode() {
        return this.f9618a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f9619b);
        sb2.append("', productType='");
        sb2.append(this.f9620c);
        sb2.append("', statusCode=");
        return a1.g.o(this.d, "}", sb2);
    }
}
