package c5;

import android.text.TextUtils;
import org.json.JSONObject;
public final class t {
    public final String f3919a;
    public final String f3920b;
    public final String f3921c;
    public final int d;

    public t(String str) {
        int i10;
        this.f3919a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3920b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f3921c = optString;
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
        return TextUtils.equals(this.f3919a, ((t) obj).f3919a);
    }

    public final int hashCode() {
        return this.f3919a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f3920b);
        sb2.append("', productType='");
        sb2.append(this.f3921c);
        sb2.append("', statusCode=");
        return a4.a.n(this.d, "}", sb2);
    }
}
