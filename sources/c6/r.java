package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f4417a;
    public String f4418b;
    public final JSONObject f4419c;

    public r(k kVar, JSONObject jSONObject) {
        this.f4417a = kVar;
        this.f4419c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!u6.c.a(this.f4419c, rVar.f4419c)) {
            return false;
        }
        return n6.m.l(this.f4417a, rVar.f4417a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4417a, String.valueOf(this.f4419c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4419c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4418b = jSONObject;
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.k(parcel, 2, this.f4417a, i10);
        w7.d0.l(parcel, 3, this.f4418b);
        w7.d0.r(parcel, q6);
    }
}
