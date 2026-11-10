package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f11325a;
    public String f11326b;
    public final JSONObject f11327c;

    public r(k kVar, JSONObject jSONObject) {
        this.f11325a = kVar;
        this.f11327c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!x6.c.a(this.f11327c, rVar.f11327c)) {
            return false;
        }
        return q6.m.k(this.f11325a, rVar.f11325a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11325a, String.valueOf(this.f11327c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11327c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11326b = jSONObject;
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f11325a, i7);
        xb.l(parcel, 3, this.f11326b);
        xb.s(parcel, r10);
    }
}
