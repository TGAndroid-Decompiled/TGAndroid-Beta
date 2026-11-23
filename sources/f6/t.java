package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class t extends r6.a {
    public static final Parcelable.Creator<t> CREATOR = new v(20);
    public final String f11459a;
    public final String f11460b;

    public t(String str, String str2) {
        this.f11459a = str;
        this.f11460b = str2;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f11459a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f11460b;
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
        if (j6.a.d(this.f11459a, tVar.f11459a) && j6.a.d(this.f11460b, tVar.f11460b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11459a, this.f11460b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f11459a);
        cc.l(parcel, 3, this.f11460b);
        cc.s(parcel, r10);
    }
}
