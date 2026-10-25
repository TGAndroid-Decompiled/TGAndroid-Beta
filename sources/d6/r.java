package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends p6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f8128a;
    public String f8129b;
    public final JSONObject f8130c;

    public r(k kVar, JSONObject jSONObject) {
        this.f8128a = kVar;
        this.f8130c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!v6.c.a(this.f8130c, rVar.f8130c)) {
            return false;
        }
        return o6.l.l(this.f8128a, rVar.f8128a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8128a, String.valueOf(this.f8130c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f8130c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f8129b = jSONObject;
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f8128a, i10);
        df.l(parcel, 3, this.f8129b);
        df.r(parcel, q5);
    }
}
