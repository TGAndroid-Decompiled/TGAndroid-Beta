package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class r extends a6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k f19323a;
    public String f19324b;
    public final JSONObject f19325c;

    public r(k kVar, JSONObject jSONObject) {
        this.f19323a = kVar;
        this.f19325c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!g6.c.a(this.f19325c, rVar.f19325c)) {
            return false;
        }
        return z5.l.l(this.f19323a, rVar.f19323a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19323a, String.valueOf(this.f19325c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f19325c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f19324b = jSONObject;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f19323a, i10);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f19324b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
