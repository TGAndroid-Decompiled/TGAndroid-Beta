package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new db.k(29);
    public final k0 f11504a;
    public final u0 f11505b;
    public final h f11506c;
    public final v0 d;
    public final String f11507e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f11504a = k0Var;
        this.f11505b = u0Var;
        this.f11506c = hVar;
        this.d = v0Var;
        this.f11507e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f11506c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f11508a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e10) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
                }
            }
            k0 k0Var = this.f11504a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.b());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.b());
            }
            String str = this.f11507e;
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
        if (!q6.m.l(this.f11504a, gVar.f11504a) || !q6.m.l(this.f11505b, gVar.f11505b) || !q6.m.l(this.f11506c, gVar.f11506c) || !q6.m.l(this.d, gVar.d) || !q6.m.l(this.f11507e, gVar.f11507e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11504a, this.f11505b, this.f11506c, this.d, this.f11507e});
    }

    public final String toString() {
        return a8.p0.p("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.f11504a, i7);
        cc.k(parcel, 2, this.f11505b, i7);
        cc.k(parcel, 3, this.f11506c, i7);
        cc.k(parcel, 4, this.d, i7);
        cc.l(parcel, 5, this.f11507e);
        cc.s(parcel, r10);
    }
}
