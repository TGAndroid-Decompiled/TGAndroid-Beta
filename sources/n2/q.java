package n2;

import android.text.TextUtils;
import org.json.JSONObject;

public final class q {

    public final String f18172a;

    public final String f18173b;

    public final String f18174c;
    public final int d;

    public q(String str) {
        this.f18172a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f18173b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f18174c = strOptString;
        this.d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return TextUtils.equals(this.f18172a, ((q) obj).f18172a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18172a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f18173b);
        sb2.append("', productType='");
        sb2.append(this.f18174c);
        sb2.append("', statusCode=");
        return a9.p.k(this.d, "}", sb2);
    }
}
