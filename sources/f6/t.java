package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class t extends r6.a {
    public static final Parcelable.Creator<t> CREATOR = new v(20);
    public final String f11497a;
    public final String f11498b;

    public t(String str, String str2) {
        this.f11497a = str;
        this.f11498b = str2;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f11497a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f11498b;
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
        if (j6.a.d(this.f11497a, tVar.f11497a) && j6.a.d(this.f11498b, tVar.f11498b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11497a, this.f11498b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f11497a);
        bc.l(parcel, 3, this.f11498b);
        bc.s(parcel, r10);
    }
}
