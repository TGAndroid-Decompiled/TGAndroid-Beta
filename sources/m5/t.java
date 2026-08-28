package m5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class t extends y5.a {
    public static final Parcelable.Creator<t> CREATOR = new v(20);
    public final String f17477a;
    public final String f17478b;

    public t(String str, String str2) {
        this.f17477a = str;
        this.f17478b = str2;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f17477a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f17478b;
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
        if (q5.a.d(this.f17477a, tVar.f17477a) && q5.a.d(this.f17478b, tVar.f17478b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17477a, this.f17478b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f17477a);
        p8.l(parcel, 3, this.f17478b);
        p8.r(parcel, q10);
    }
}
