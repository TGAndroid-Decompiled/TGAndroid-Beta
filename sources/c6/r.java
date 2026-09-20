package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f4045a;
    public String f4046b;
    public final JSONObject f4047c;

    public r(k kVar, JSONObject jSONObject) {
        this.f4045a = kVar;
        this.f4047c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!u6.c.a(this.f4047c, rVar.f4047c)) {
            return false;
        }
        return n6.l.l(this.f4045a, rVar.f4045a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4045a, String.valueOf(this.f4047c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4047c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4046b = jSONObject;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4045a, i10);
        w7.f0.l(parcel, 3, this.f4046b);
        w7.f0.r(parcel, q6);
    }
}
