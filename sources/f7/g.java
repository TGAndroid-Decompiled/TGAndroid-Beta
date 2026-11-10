package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new db.k(29);
    public final k0 f11384a;
    public final u0 f11385b;
    public final h f11386c;
    public final v0 d;
    public final String f11387e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f11384a = k0Var;
        this.f11385b = u0Var;
        this.f11386c = hVar;
        this.d = v0Var;
        this.f11387e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f11386c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f11388a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e10) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
                }
            }
            k0 k0Var = this.f11384a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.b());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.b());
            }
            String str = this.f11387e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e11) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!q6.m.k(this.f11384a, gVar.f11384a) || !q6.m.k(this.f11385b, gVar.f11385b) || !q6.m.k(this.f11386c, gVar.f11386c) || !q6.m.k(this.d, gVar.d) || !q6.m.k(this.f11387e, gVar.f11387e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11384a, this.f11385b, this.f11386c, this.d, this.f11387e});
    }

    public final String toString() {
        return a8.p0.p("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.f11384a, i7);
        xb.k(parcel, 2, this.f11385b, i7);
        xb.k(parcel, 3, this.f11386c, i7);
        xb.k(parcel, 4, this.d, i7);
        xb.l(parcel, 5, this.f11387e);
        xb.s(parcel, r10);
    }
}
