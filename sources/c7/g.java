package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r0(10);
    public final k0 f4618a;
    public final u0 f4619b;
    public final h f4620c;
    public final v0 d;
    public final String f4621e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f4618a = k0Var;
        this.f4619b = u0Var;
        this.f4620c = hVar;
        this.d = v0Var;
        this.f4621e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f4620c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f4622a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e7) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e7);
                }
            }
            k0 k0Var = this.f4618a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.b());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.b());
            }
            String str = this.f4621e;
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
        if (!n6.l.l(this.f4618a, gVar.f4618a) || !n6.l.l(this.f4619b, gVar.f4619b) || !n6.l.l(this.f4620c, gVar.f4620c) || !n6.l.l(this.d, gVar.d) || !n6.l.l(this.f4621e, gVar.f4621e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4618a, this.f4619b, this.f4620c, this.d, this.f4621e});
    }

    public final String toString() {
        return a4.a.p("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 1, this.f4618a, i10);
        w7.e0.k(parcel, 2, this.f4619b, i10);
        w7.e0.k(parcel, 3, this.f4620c, i10);
        w7.e0.k(parcel, 4, this.d, i10);
        w7.e0.l(parcel, 5, this.f4621e);
        w7.e0.r(parcel, q6);
    }
}
