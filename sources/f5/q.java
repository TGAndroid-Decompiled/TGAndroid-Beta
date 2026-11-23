package f5;

import a8.p0;
import android.text.TextUtils;
import org.json.JSONObject;
public final class q {
    public final String f11302a;
    public final String f11303b;
    public final String f11304c;
    public final int d;

    public q(String str) {
        int i7;
        this.f11302a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f11303b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f11304c = optString;
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
        return TextUtils.equals(this.f11302a, ((q) obj).f11302a);
    }

    public final int hashCode() {
        return this.f11302a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f11303b);
        sb2.append("', productType='");
        sb2.append(this.f11304c);
        sb2.append("', statusCode=");
        return p0.n(this.d, "}", sb2);
    }
}
