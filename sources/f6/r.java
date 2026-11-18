package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f11454a;
    public String f11455b;
    public final JSONObject f11456c;

    public r(k kVar, JSONObject jSONObject) {
        this.f11454a = kVar;
        this.f11456c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!x6.c.a(this.f11456c, rVar.f11456c)) {
            return false;
        }
        return q6.m.l(this.f11454a, rVar.f11454a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11454a, String.valueOf(this.f11456c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11456c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11455b = jSONObject;
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f11454a, i7);
        bc.l(parcel, 3, this.f11455b);
        bc.s(parcel, r10);
    }
}
