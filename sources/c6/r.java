package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f4458a;
    public String f4459b;
    public final JSONObject f4460c;

    public r(k kVar, JSONObject jSONObject) {
        this.f4458a = kVar;
        this.f4460c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!u6.c.a(this.f4460c, rVar.f4460c)) {
            return false;
        }
        return n6.l.l(this.f4458a, rVar.f4458a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4458a, String.valueOf(this.f4460c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4460c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4459b = jSONObject;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4458a, i10);
        w7.e0.l(parcel, 3, this.f4459b);
        w7.e0.r(parcel, q6);
    }
}
