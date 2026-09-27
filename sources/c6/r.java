package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f4038a;
    public String f4039b;
    public final JSONObject f4040c;

    public r(k kVar, JSONObject jSONObject) {
        this.f4038a = kVar;
        this.f4040c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!u6.c.a(this.f4040c, rVar.f4040c)) {
            return false;
        }
        return n6.l.l(this.f4038a, rVar.f4038a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4038a, String.valueOf(this.f4040c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4040c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4039b = jSONObject;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4038a, i10);
        w7.f0.l(parcel, 3, this.f4039b);
        w7.f0.r(parcel, q6);
    }
}
