package e6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends q6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f9763a;
    public String f9764b;
    public final JSONObject f9765c;

    public r(k kVar, JSONObject jSONObject) {
        this.f9763a = kVar;
        this.f9765c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!w6.c.a(this.f9765c, rVar.f9765c)) {
            return false;
        }
        return p6.m.k(this.f9763a, rVar.f9763a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9763a, String.valueOf(this.f9765c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        String jSONObject;
        JSONObject jSONObject2 = this.f9765c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f9764b = jSONObject;
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.f9763a, i3);
        j8.a.m(parcel, 3, this.f9764b);
        j8.a.t(parcel, s6);
    }
}
