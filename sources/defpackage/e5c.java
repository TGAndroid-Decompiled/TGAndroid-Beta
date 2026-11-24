package defpackage;

import android.text.TextUtils;
import org.json.JSONObject;
public final class e5c {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public e5c(String str) {
        int i;
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.c = optString;
        if (jSONObject.has("statusCode")) {
            i = jSONObject.optInt("statusCode");
        } else {
            i = 0;
        }
        this.d = i;
        if (!TextUtils.isEmpty(optString)) {
            jSONObject.optString("serializedDocid");
        } else {
            w26.j("Product type cannot be empty.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5c)) {
            return false;
        }
        return TextUtils.equals(this.a, ((e5c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.b);
        sb.append("', productType='");
        sb.append(this.c);
        sb.append("', statusCode=");
        return de9.l(sb, this.d, "}");
    }
}
