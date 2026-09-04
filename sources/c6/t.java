package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new v(20);
    public final String f4574a;
    public final String f4575b;

    public t(String str, String str2) {
        this.f4574a = str;
        this.f4575b = str2;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f4574a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f4575b;
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
        if (g6.a.d(this.f4574a, tVar.f4574a) && g6.a.d(this.f4575b, tVar.f4575b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4574a, this.f4575b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f4574a);
        w7.e0.l(parcel, 3, this.f4575b);
        w7.e0.r(parcel, q6);
    }
}
