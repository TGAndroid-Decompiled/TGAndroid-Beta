package c5;

import android.text.TextUtils;
import org.json.JSONObject;
public final class t {
    public final String f3922a;
    public final String f3923b;
    public final String f3924c;
    public final int d;

    public t(String str) {
        int i10;
        this.f3922a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3923b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.f3924c = optString;
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
        return TextUtils.equals(this.f3922a, ((t) obj).f3922a);
    }

    public final int hashCode() {
        return this.f3922a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f3923b);
        sb2.append("', productType='");
        sb2.append(this.f3924c);
        sb2.append("', statusCode=");
        return a4.a.o(this.d, "}", sb2);
    }
}
