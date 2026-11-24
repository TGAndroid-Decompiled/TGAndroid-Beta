package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class p6a extends b4 {
    public static final Parcelable.Creator<p6a> CREATOR = new rpd((byte) 4);
    public final gr6 a;
    public String b;
    public final JSONObject c;

    public p6a(gr6 gr6Var, JSONObject jSONObject) {
        this.a = gr6Var;
        this.c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6a)) {
            return false;
        }
        p6a p6aVar = (p6a) obj;
        if (!vu5.a(this.c, p6aVar.c)) {
            return false;
        }
        return cqe.a(this.a, p6aVar.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, String.valueOf(this.c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.c;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.b = jSONObject;
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        jte.l(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
