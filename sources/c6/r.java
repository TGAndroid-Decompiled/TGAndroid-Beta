package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
import w7.g0;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f4367a;
    public String f4368b;
    public final JSONObject f4369c;

    public r(k kVar, JSONObject jSONObject) {
        this.f4367a = kVar;
        this.f4369c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!u6.c.a(this.f4369c, rVar.f4369c)) {
            return false;
        }
        return n6.l.l(this.f4367a, rVar.f4367a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4367a, String.valueOf(this.f4369c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4369c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4368b = jSONObject;
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f4367a, i10);
        g0.l(parcel, 3, this.f4368b);
        g0.r(parcel, q6);
    }
}
