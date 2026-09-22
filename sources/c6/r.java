package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f4041a;
    public String f4042b;
    public final JSONObject f4043c;

    public r(k kVar, JSONObject jSONObject) {
        this.f4041a = kVar;
        this.f4043c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!u6.c.a(this.f4043c, rVar.f4043c)) {
            return false;
        }
        return n6.l.l(this.f4041a, rVar.f4041a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4041a, String.valueOf(this.f4043c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4043c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4042b = jSONObject;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4041a, i10);
        w7.e0.l(parcel, 3, this.f4042b);
        w7.e0.r(parcel, q6);
    }
}
