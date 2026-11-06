package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class t extends r6.a {
    public static final Parcelable.Creator<t> CREATOR = new v(20);
    public final String f11334a;
    public final String f11335b;

    public t(String str, String str2) {
        this.f11334a = str;
        this.f11335b = str2;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f11334a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f11335b;
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
        if (j6.a.d(this.f11334a, tVar.f11334a) && j6.a.d(this.f11335b, tVar.f11335b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11334a, this.f11335b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.f11334a);
        wb.l(parcel, 3, this.f11335b);
        wb.s(parcel, r10);
    }
}
