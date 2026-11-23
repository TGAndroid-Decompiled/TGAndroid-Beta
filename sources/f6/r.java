package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f11483a;
    public String f11484b;
    public final JSONObject f11485c;

    public r(k kVar, JSONObject jSONObject) {
        this.f11483a = kVar;
        this.f11485c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!x6.c.a(this.f11485c, rVar.f11485c)) {
            return false;
        }
        return q6.m.l(this.f11483a, rVar.f11483a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11483a, String.valueOf(this.f11485c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11485c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11484b = jSONObject;
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f11483a, i7);
        bc.l(parcel, 3, this.f11484b);
        bc.s(parcel, r10);
    }
}
