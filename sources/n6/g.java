package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class g extends z5.a {
    public static final Parcelable.Creator<g> CREATOR = new o0(21);

    public final k0 f18357a;

    public final u0 f18358b;

    public final h f18359c;
    public final v0 d;

    public final String f18360e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f18357a = k0Var;
        this.f18358b = u0Var;
        this.f18359c = hVar;
        this.d = v0Var;
        this.f18360e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f18359c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f18361a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e9) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e9);
                }
            }
            k0 k0Var = this.f18357a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.b());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.b());
            }
            String str = this.f18360e;
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
        return y5.l.l(this.f18357a, gVar.f18357a) && y5.l.l(this.f18358b, gVar.f18358b) && y5.l.l(this.f18359c, gVar.f18359c) && y5.l.l(this.d, gVar.d) && y5.l.l(this.f18360e, gVar.f18360e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18357a, this.f18358b, this.f18359c, this.d, this.f18360e});
    }

    public final String toString() {
        return a9.p.m("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.f18357a, i10);
        r8.k(parcel, 2, this.f18358b, i10);
        r8.k(parcel, 3, this.f18359c, i10);
        r8.k(parcel, 4, this.d, i10);
        r8.l(parcel, 5, this.f18360e);
        r8.r(parcel, iQ);
    }
}
