package defpackage;

import android.text.TextUtils;
import org.json.JSONObject;
public final class d9c {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public d9c(String str) {
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
            lq5.j("Product type cannot be empty.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9c)) {
            return false;
        }
        return TextUtils.equals(this.a, ((d9c) obj).a);
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
        return uh9.l(sb, this.d, "}");
    }
}
