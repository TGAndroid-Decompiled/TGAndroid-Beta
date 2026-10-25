package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class t extends p6.a {
    public static final Parcelable.Creator<t> CREATOR = new v(20);
    public final String f8140a;
    public final String f8141b;

    public t(String str, String str2) {
        this.f8140a = str;
        this.f8141b = str2;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f8140a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f8141b;
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
        if (h6.a.d(this.f8140a, tVar.f8140a) && h6.a.d(this.f8141b, tVar.f8141b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8140a, this.f8141b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f8140a);
        df.l(parcel, 3, this.f8141b);
        df.r(parcel, q5);
    }
}
