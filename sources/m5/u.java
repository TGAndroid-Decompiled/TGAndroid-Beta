package m5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class u extends z5.a {
    public static final Parcelable.Creator<u> CREATOR = new w(20);

    public final String f17856a;

    public final String f17857b;

    public u(String str, String str2) {
        this.f17856a = str;
        this.f17857b = str2;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f17856a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f17857b;
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
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return r5.a.d(this.f17856a, uVar.f17856a) && r5.a.d(this.f17857b, uVar.f17857b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17856a, this.f17857b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f17856a);
        r8.l(parcel, 3, this.f17857b);
        r8.r(parcel, iQ);
    }
}
