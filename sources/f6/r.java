package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f11134a;
    public String f11135b;
    public final JSONObject f11136c;

    public r(k kVar, JSONObject jSONObject) {
        this.f11134a = kVar;
        this.f11136c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!x6.c.a(this.f11136c, rVar.f11136c)) {
            return false;
        }
        return q6.m.k(this.f11134a, rVar.f11134a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11134a, String.valueOf(this.f11136c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11136c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11135b = jSONObject;
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.f11134a, i7);
        yb.l(parcel, 3, this.f11135b);
        yb.s(parcel, r10);
    }
}
