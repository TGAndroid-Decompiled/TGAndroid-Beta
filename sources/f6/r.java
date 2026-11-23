package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f11445a;
    public String f11446b;
    public final JSONObject f11447c;

    public r(k kVar, JSONObject jSONObject) {
        this.f11445a = kVar;
        this.f11447c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!x6.c.a(this.f11447c, rVar.f11447c)) {
            return false;
        }
        return q6.m.l(this.f11445a, rVar.f11445a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11445a, String.valueOf(this.f11447c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11447c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11446b = jSONObject;
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f11445a, i7);
        cc.l(parcel, 3, this.f11446b);
        cc.s(parcel, r10);
    }
}
