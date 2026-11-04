package e6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class t extends q6.a {
    public static final Parcelable.Creator<t> CREATOR = new v(20);
    public final String f9777a;
    public final String f9778b;

    public t(String str, String str2) {
        this.f9777a = str;
        this.f9778b = str2;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f9777a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f9778b;
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
        if (i6.a.d(this.f9777a, tVar.f9777a) && i6.a.d(this.f9778b, tVar.f9778b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9777a, this.f9778b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f9777a);
        j8.a.m(parcel, 3, this.f9778b);
        j8.a.t(parcel, s6);
    }
}
