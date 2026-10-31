package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r0(10);
    public final k0 f3987a;
    public final u0 f3988b;
    public final h f3989c;
    public final v0 d;
    public final String e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f3987a = k0Var;
        this.f3988b = u0Var;
        this.f3989c = hVar;
        this.d = v0Var;
        this.e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f3989c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f3990a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            k0 k0Var = this.f3987a;
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
        if (!n6.l.k(this.f3987a, gVar.f3987a) || !n6.l.k(this.f3988b, gVar.f3988b) || !n6.l.k(this.f3989c, gVar.f3989c) || !n6.l.k(this.d, gVar.d) || !n6.l.k(this.e, gVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3987a, this.f3988b, this.f3989c, this.d, this.e});
    }

    public final String toString() {
        return a1.g.n("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.k(parcel, 1, this.f3987a, i10);
        w7.h0.k(parcel, 2, this.f3988b, i10);
        w7.h0.k(parcel, 3, this.f3989c, i10);
        w7.h0.k(parcel, 4, this.d, i10);
        w7.h0.l(parcel, 5, this.e);
        w7.h0.r(parcel, q6);
    }
}
