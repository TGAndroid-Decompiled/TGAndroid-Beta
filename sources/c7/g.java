package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r0(10);
    public final k0 f4583a;
    public final u0 f4584b;
    public final h f4585c;
    public final v0 d;
    public final String e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f4583a = k0Var;
        this.f4584b = u0Var;
        this.f4585c = hVar;
        this.d = v0Var;
        this.e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f4585c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f4586a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            k0 k0Var = this.f4583a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.b());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.b());
            }
            String str = this.e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!n6.l.l(this.f4583a, gVar.f4583a) || !n6.l.l(this.f4584b, gVar.f4584b) || !n6.l.l(this.f4585c, gVar.f4585c) || !n6.l.l(this.d, gVar.d) || !n6.l.l(this.e, gVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4583a, this.f4584b, this.f4585c, this.d, this.e});
    }

    public final String toString() {
        return a1.g.p("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.k(parcel, 1, this.f4583a, i10);
        w7.g0.k(parcel, 2, this.f4584b, i10);
        w7.g0.k(parcel, 3, this.f4585c, i10);
        w7.g0.k(parcel, 4, this.d, i10);
        w7.g0.l(parcel, 5, this.e);
        w7.g0.r(parcel, q6);
    }
}
