package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f4532a;
    public String f4533b;
    public final JSONObject f4534c;

    public r(k kVar, JSONObject jSONObject) {
        this.f4532a = kVar;
        this.f4534c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!u6.c.a(this.f4534c, rVar.f4534c)) {
            return false;
        }
        return n6.l.l(this.f4532a, rVar.f4532a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4532a, String.valueOf(this.f4534c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4534c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4533b = jSONObject;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4532a, i10);
        w7.f0.l(parcel, 3, this.f4533b);
        w7.f0.r(parcel, q6);
    }
}
