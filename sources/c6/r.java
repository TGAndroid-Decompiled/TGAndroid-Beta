package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f4044a;
    public String f4045b;
    public final JSONObject f4046c;

    public r(k kVar, JSONObject jSONObject) {
        this.f4044a = kVar;
        this.f4046c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!u6.c.a(this.f4046c, rVar.f4046c)) {
            return false;
        }
        return n6.l.l(this.f4044a, rVar.f4044a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4044a, String.valueOf(this.f4046c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4046c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4045b = jSONObject;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4044a, i10);
        w7.e0.l(parcel, 3, this.f4045b);
        w7.e0.r(parcel, q6);
    }
}
