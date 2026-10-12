package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f4416a;
    public String f4417b;
    public final JSONObject f4418c;

    public r(k kVar, JSONObject jSONObject) {
        this.f4416a = kVar;
        this.f4418c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!u6.c.a(this.f4418c, rVar.f4418c)) {
            return false;
        }
        return n6.m.l(this.f4416a, rVar.f4416a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4416a, String.valueOf(this.f4418c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4418c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4417b = jSONObject;
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.k(parcel, 2, this.f4416a, i10);
        w7.c0.l(parcel, 3, this.f4417b);
        w7.c0.r(parcel, q6);
    }
}
