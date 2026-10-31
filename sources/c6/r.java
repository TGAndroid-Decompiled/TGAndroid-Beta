package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
import w7.h0;
public final class r extends o6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f3931a;
    public String f3932b;
    public final JSONObject f3933c;

    public r(k kVar, JSONObject jSONObject) {
        this.f3931a = kVar;
        this.f3933c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!u6.c.a(this.f3933c, rVar.f3933c)) {
            return false;
        }
        return n6.l.k(this.f3931a, rVar.f3931a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3931a, String.valueOf(this.f3933c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f3933c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f3932b = jSONObject;
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 2, this.f3931a, i10);
        h0.l(parcel, 3, this.f3932b);
        h0.r(parcel, q6);
    }
}
