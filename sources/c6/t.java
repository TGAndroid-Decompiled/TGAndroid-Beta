package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import w7.g0;
public final class t extends o6.a {
    public static final Parcelable.Creator<t> CREATOR = new v(20);
    public final String f4381a;
    public final String f4382b;

    public t(String str, String str2) {
        this.f4381a = str;
        this.f4382b = str2;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f4381a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f4382b;
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
        if (g6.a.d(this.f4381a, tVar.f4381a) && g6.a.d(this.f4382b, tVar.f4382b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4381a, this.f4382b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f4381a);
        g0.l(parcel, 3, this.f4382b);
        g0.r(parcel, q6);
    }
}
