package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
import w7.g0;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f4529a;
    public String f4530b;
    public final JSONObject f4531c;

    public r(k kVar, JSONObject jSONObject) {
        this.f4529a = kVar;
        this.f4531c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!u6.c.a(this.f4531c, rVar.f4531c)) {
            return false;
        }
        return n6.l.l(this.f4529a, rVar.f4529a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4529a, String.valueOf(this.f4531c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4531c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4530b = jSONObject;
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f4529a, i10);
        g0.l(parcel, 3, this.f4530b);
        g0.r(parcel, q6);
    }
}
