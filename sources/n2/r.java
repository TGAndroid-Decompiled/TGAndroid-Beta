package n2;

import android.text.TextUtils;
import org.json.JSONObject;
public final class r {
    public final String f18346a;
    public final String f18347b;
    public final String f18348c;
    public final int d;

    public r(String str) {
        int i9;
        this.f18346a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f18347b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f18348c = optString;
        if (jSONObject.has("statusCode")) {
            i9 = jSONObject.optInt("statusCode");
        } else {
            i9 = 0;
        }
        this.d = i9;
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
        if (!(obj instanceof r)) {
            return false;
        }
        return TextUtils.equals(this.f18346a, ((r) obj).f18346a);
    }

    public final int hashCode() {
        return this.f18346a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f18347b);
        sb2.append("', productType='");
        sb2.append(this.f18348c);
        sb2.append("', statusCode=");
        return aa.d.l(this.d, "}", sb2);
    }
}
