package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class z40 extends c4 {
    public static final Parcelable.Creator<z40> CREATOR = new zkd((byte) 7);
    public final wcc a;
    public final m3e b;
    public final a50 c;
    public final bhe d;
    public final String e;

    public z40(wcc wccVar, m3e m3eVar, a50 a50Var, bhe bheVar, String str) {
        this.a = wccVar;
        this.b = m3eVar;
        this.c = a50Var;
        this.d = bheVar;
        this.e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            a50 a50Var = this.c;
            if (a50Var != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", a50Var.a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            wcc wccVar = this.a;
            if (wccVar != null) {
                jSONObject.put("uvm", wccVar.b());
            }
            bhe bheVar = this.d;
            if (bheVar != null) {
                jSONObject.put("prf", bheVar.b());
            }
            String str = this.e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            grb.j("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z40)) {
            return false;
        }
        z40 z40Var = (z40) obj;
        if (!vue.a(this.a, z40Var.a) || !vue.a(this.b, z40Var.b) || !vue.a(this.c, z40Var.c) || !vue.a(this.d, z40Var.d) || !vue.a(this.e, z40Var.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return qd4.y("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.k(parcel, 2, this.b, i);
        bye.k(parcel, 3, this.c, i);
        bye.k(parcel, 4, this.d, i);
        bye.l(parcel, 5, this.e);
        bye.s(parcel, r);
    }
}
