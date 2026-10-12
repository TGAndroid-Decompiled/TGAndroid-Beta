package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r0(10);
    public final k0 f4473a;
    public final u0 f4474b;
    public final h f4475c;
    public final v0 d;
    public final String f4476e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f4473a = k0Var;
        this.f4474b = u0Var;
        this.f4475c = hVar;
        this.d = v0Var;
        this.f4476e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f4475c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f4477a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e7) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e7);
                }
            }
            k0 k0Var = this.f4473a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.b());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.b());
            }
            String str = this.f4476e;
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
        if (!n6.m.l(this.f4473a, gVar.f4473a) || !n6.m.l(this.f4474b, gVar.f4474b) || !n6.m.l(this.f4475c, gVar.f4475c) || !n6.m.l(this.d, gVar.d) || !n6.m.l(this.f4476e, gVar.f4476e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4473a, this.f4474b, this.f4475c, this.d, this.f4476e});
    }

    public final String toString() {
        return a1.g.q("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.k(parcel, 1, this.f4473a, i10);
        w7.c0.k(parcel, 2, this.f4474b, i10);
        w7.c0.k(parcel, 3, this.f4475c, i10);
        w7.c0.k(parcel, 4, this.d, i10);
        w7.c0.l(parcel, 5, this.f4476e);
        w7.c0.r(parcel, q6);
    }
}
