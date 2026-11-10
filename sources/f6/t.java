package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class t extends r6.a {
    public static final Parcelable.Creator<t> CREATOR = new v(20);
    public final String f11339a;
    public final String f11340b;

    public t(String str, String str2) {
        this.f11339a = str;
        this.f11340b = str2;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f11339a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f11340b;
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
        if (j6.a.d(this.f11339a, tVar.f11339a) && j6.a.d(this.f11340b, tVar.f11340b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11339a, this.f11340b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f11339a);
        xb.l(parcel, 3, this.f11340b);
        xb.s(parcel, r10);
    }
}
