package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new db.k(29);
    public final k0 f11379a;
    public final u0 f11380b;
    public final h f11381c;
    public final v0 d;
    public final String f11382e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f11379a = k0Var;
        this.f11380b = u0Var;
        this.f11381c = hVar;
        this.d = v0Var;
        this.f11382e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f11381c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f11383a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e10) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
                }
            }
            k0 k0Var = this.f11379a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.b());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.b());
            }
            String str = this.f11382e;
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
        if (!q6.m.k(this.f11379a, gVar.f11379a) || !q6.m.k(this.f11380b, gVar.f11380b) || !q6.m.k(this.f11381c, gVar.f11381c) || !q6.m.k(this.d, gVar.d) || !q6.m.k(this.f11382e, gVar.f11382e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11379a, this.f11380b, this.f11381c, this.d, this.f11382e});
    }

    public final String toString() {
        return a8.p0.p("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 1, this.f11379a, i7);
        wb.k(parcel, 2, this.f11380b, i7);
        wb.k(parcel, 3, this.f11381c, i7);
        wb.k(parcel, 4, this.d, i7);
        wb.l(parcel, 5, this.f11382e);
        wb.s(parcel, r10);
    }
}
