package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import w7.g0;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new v(20);
    public final String f4541a;
    public final String f4542b;

    public t(String str, String str2) {
        this.f4541a = str;
        this.f4542b = str2;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f4541a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f4542b;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (g6.a.d(this.f4541a, tVar.f4541a) && g6.a.d(this.f4542b, tVar.f4542b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4541a, this.f4542b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f4541a);
        g0.l(parcel, 3, this.f4542b);
        g0.r(parcel, q6);
    }
}
