package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class t extends a6.a {
    public static final Parcelable.Creator<t> CREATOR = new v(20);
    public final String f19336a;
    public final String f19337b;

    public t(String str, String str2) {
        this.f19336a = str;
        this.f19337b = str2;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f19336a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f19337b;
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
        if (s5.a.d(this.f19336a, tVar.f19336a) && s5.a.d(this.f19337b, tVar.f19337b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19336a, this.f19337b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f19336a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f19337b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
