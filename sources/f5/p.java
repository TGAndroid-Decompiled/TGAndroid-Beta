package f5;

import a8.p0;
import android.text.TextUtils;
import org.json.JSONObject;
public final class p {
    public final String f11180a;
    public final String f11181b;
    public final String f11182c;
    public final int d;

    public p(String str) {
        int i7;
        this.f11180a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f11181b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f11182c = optString;
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
        if (!(obj instanceof p)) {
            return false;
        }
        return TextUtils.equals(this.f11180a, ((p) obj).f11180a);
    }

    public final int hashCode() {
        return this.f11180a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f11181b);
        sb2.append("', productType='");
        sb2.append(this.f11182c);
        sb2.append("', statusCode=");
        return p0.n(this.d, "}", sb2);
    }
}
