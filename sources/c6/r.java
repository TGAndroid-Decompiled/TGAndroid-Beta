package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f4561a;
    public String f4562b;
    public final JSONObject f4563c;

    public r(k kVar, JSONObject jSONObject) {
        this.f4561a = kVar;
        this.f4563c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!u6.c.a(this.f4563c, rVar.f4563c)) {
            return false;
        }
        return n6.l.l(this.f4561a, rVar.f4561a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4561a, String.valueOf(this.f4563c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4563c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4562b = jSONObject;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4561a, i10);
        w7.e0.l(parcel, 3, this.f4562b);
        w7.e0.r(parcel, q6);
    }
}
