package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f11480a;
    public String f11481b;
    public final JSONObject f11482c;

    public r(k kVar, JSONObject jSONObject) {
        this.f11480a = kVar;
        this.f11482c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!x6.c.a(this.f11482c, rVar.f11482c)) {
            return false;
        }
        return q6.m.l(this.f11480a, rVar.f11480a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11480a, String.valueOf(this.f11482c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11482c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11481b = jSONObject;
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f11480a, i7);
        bc.l(parcel, 3, this.f11481b);
        bc.s(parcel, r10);
    }
}
