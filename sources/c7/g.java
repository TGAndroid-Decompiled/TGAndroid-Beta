package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r0(10);
    public final k0 f4474a;
    public final u0 f4475b;
    public final h f4476c;
    public final v0 d;
    public final String f4477e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f4474a = k0Var;
        this.f4475b = u0Var;
        this.f4476c = hVar;
        this.d = v0Var;
        this.f4477e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f4476c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f4478a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e7) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e7);
                }
            }
            k0 k0Var = this.f4474a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.b());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.b());
            }
            String str = this.f4477e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!n6.m.l(this.f4474a, gVar.f4474a) || !n6.m.l(this.f4475b, gVar.f4475b) || !n6.m.l(this.f4476c, gVar.f4476c) || !n6.m.l(this.d, gVar.d) || !n6.m.l(this.f4477e, gVar.f4477e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4474a, this.f4475b, this.f4476c, this.d, this.f4477e});
    }

    public final String toString() {
        return a1.g.q("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.k(parcel, 1, this.f4474a, i10);
        w7.d0.k(parcel, 2, this.f4475b, i10);
        w7.d0.k(parcel, 3, this.f4476c, i10);
        w7.d0.k(parcel, 4, this.d, i10);
        w7.d0.l(parcel, 5, this.f4477e);
        w7.d0.r(parcel, q6);
    }
}
