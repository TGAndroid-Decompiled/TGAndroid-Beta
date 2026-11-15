package f5;

import a8.p0;
import android.text.TextUtils;
import org.json.JSONObject;
public final class q {
    public final String f11003a;
    public final String f11004b;
    public final String f11005c;
    public final int d;

    public q(String str) {
        int i7;
        this.f11003a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f11004b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f11005c = optString;
        if (jSONObject.has("statusCode")) {
            i7 = jSONObject.optInt("statusCode");
        } else {
            i7 = 0;
        }
        this.d = i7;
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
        return TextUtils.equals(this.f11003a, ((q) obj).f11003a);
    }

    public final int hashCode() {
        return this.f11003a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f11004b);
        sb2.append("', productType='");
        sb2.append(this.f11005c);
        sb2.append("', statusCode=");
        return p0.n(this.d, "}", sb2);
    }
}
