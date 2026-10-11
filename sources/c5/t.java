package c5;

import android.text.TextUtils;
import org.json.JSONObject;
public final class t {
    public final String f4287a;
    public final String f4288b;
    public final String f4289c;
    public final int d;

    public t(String str) {
        int i10;
        this.f4287a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f4288b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f4289c = optString;
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
        return TextUtils.equals(this.f4287a, ((t) obj).f4287a);
    }

    public final int hashCode() {
        return this.f4287a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f4288b);
        sb2.append("', productType='");
        sb2.append(this.f4289c);
        sb2.append("', statusCode=");
        return a1.g.o(this.d, "}", sb2);
    }
}
