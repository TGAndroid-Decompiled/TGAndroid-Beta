package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f4418a;
    public String f4419b;
    public final JSONObject f4420c;

    public r(k kVar, JSONObject jSONObject) {
        this.f4418a = kVar;
        this.f4420c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!u6.c.a(this.f4420c, rVar.f4420c)) {
            return false;
        }
        return n6.l.l(this.f4418a, rVar.f4418a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4418a, String.valueOf(this.f4420c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4420c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4419b = jSONObject;
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.k(parcel, 2, this.f4418a, i10);
        w7.d0.l(parcel, 3, this.f4419b);
        w7.d0.r(parcel, q6);
    }
}
