package m5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import org.json.JSONObject;

public final class s extends z5.a {
    public static final Parcelable.Creator<s> CREATOR = new w(18);

    public final k f17843a;

    public String f17844b;

    public final JSONObject f17845c;

    public s(k kVar, JSONObject jSONObject) {
        this.f17843a = kVar;
        this.f17845c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (f6.c.a(this.f17845c, sVar.f17845c)) {
            return y5.l.l(this.f17843a, sVar.f17843a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17843a, String.valueOf(this.f17845c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f17845c;
        this.f17844b = jSONObject == null ? null : jSONObject.toString();
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.f17843a, i10);
        r8.l(parcel, 3, this.f17844b);
        r8.r(parcel, iQ);
    }
}
