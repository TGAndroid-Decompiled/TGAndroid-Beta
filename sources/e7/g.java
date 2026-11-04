package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new r0(14);
    public final k0 f9822a;
    public final u0 f9823b;
    public final h f9824c;
    public final v0 d;
    public final String f9825e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f9822a = k0Var;
        this.f9823b = u0Var;
        this.f9824c = hVar;
        this.d = v0Var;
        this.f9825e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f9824c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f9826a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e10) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
                }
            }
            k0 k0Var = this.f9822a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.b());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.b());
            }
            String str = this.f9825e;
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
        if (!p6.m.k(this.f9822a, gVar.f9822a) || !p6.m.k(this.f9823b, gVar.f9823b) || !p6.m.k(this.f9824c, gVar.f9824c) || !p6.m.k(this.d, gVar.d) || !p6.m.k(this.f9825e, gVar.f9825e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9822a, this.f9823b, this.f9824c, this.d, this.f9825e});
    }

    public final String toString() {
        return a1.g.q("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 1, this.f9822a, i3);
        j8.a.l(parcel, 2, this.f9823b, i3);
        j8.a.l(parcel, 3, this.f9824c, i3);
        j8.a.l(parcel, 4, this.d, i3);
        j8.a.m(parcel, 5, this.f9825e);
        j8.a.t(parcel, s6);
    }
}
