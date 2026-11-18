package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new db.k(29);
    public final k0 f11510a;
    public final u0 f11511b;
    public final h f11512c;
    public final v0 d;
    public final String f11513e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f11510a = k0Var;
        this.f11511b = u0Var;
        this.f11512c = hVar;
        this.d = v0Var;
        this.f11513e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f11512c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f11514a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e10) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
                }
            }
            k0 k0Var = this.f11510a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.b());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.b());
            }
            String str = this.f11513e;
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
        if (!q6.m.l(this.f11510a, gVar.f11510a) || !q6.m.l(this.f11511b, gVar.f11511b) || !q6.m.l(this.f11512c, gVar.f11512c) || !q6.m.l(this.d, gVar.d) || !q6.m.l(this.f11513e, gVar.f11513e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11510a, this.f11511b, this.f11512c, this.d, this.f11513e});
    }

    public final String toString() {
        return a8.p0.p("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f11510a, i7);
        bc.k(parcel, 2, this.f11511b, i7);
        bc.k(parcel, 3, this.f11512c, i7);
        bc.k(parcel, 4, this.d, i7);
        bc.l(parcel, 5, this.f11513e);
        bc.s(parcel, r10);
    }
}
