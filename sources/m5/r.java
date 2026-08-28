package m5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends y5.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f17464a;
    public String f17465b;
    public final JSONObject f17466c;

    public r(k kVar, JSONObject jSONObject) {
        this.f17464a = kVar;
        this.f17466c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!e6.c.a(this.f17466c, rVar.f17466c)) {
            return false;
        }
        return x5.l.l(this.f17464a, rVar.f17464a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17464a, String.valueOf(this.f17466c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        String jSONObject;
        JSONObject jSONObject2 = this.f17466c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f17465b = jSONObject;
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.f17464a, i9);
        p8.l(parcel, 3, this.f17465b);
        p8.r(parcel, q10);
    }
}
