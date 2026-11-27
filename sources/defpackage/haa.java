package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
public final class haa extends c4 {
    public static final Parcelable.Creator<haa> CREATOR = new hud((byte) 4);
    public final kt6 a;
    public String b;
    public final JSONObject c;

    public haa(kt6 kt6Var, JSONObject jSONObject) {
        this.a = kt6Var;
        this.c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haa)) {
            return false;
        }
        haa haaVar = (haa) obj;
        if (!ax5.a(this.c, haaVar.c)) {
            return false;
        }
        return vue.a(this.a, haaVar.a);
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
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        bye.l(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
