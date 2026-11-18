package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f11451a;
    public String f11452b;
    public final JSONObject f11453c;

    public r(k kVar, JSONObject jSONObject) {
        this.f11451a = kVar;
        this.f11453c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!x6.c.a(this.f11453c, rVar.f11453c)) {
            return false;
        }
        return q6.m.l(this.f11451a, rVar.f11451a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11451a, String.valueOf(this.f11453c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11453c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11452b = jSONObject;
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f11451a, i7);
        bc.l(parcel, 3, this.f11452b);
        bc.s(parcel, r10);
    }
}
