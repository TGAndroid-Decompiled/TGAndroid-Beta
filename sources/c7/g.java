package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r0(10);
    public final k0 f4512a;
    public final u0 f4513b;
    public final h f4514c;
    public final v0 d;
    public final String e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f4512a = k0Var;
        this.f4513b = u0Var;
        this.f4514c = hVar;
        this.d = v0Var;
        this.e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f4514c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f4515a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            k0 k0Var = this.f4512a;
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
        if (!n6.l.l(this.f4512a, gVar.f4512a) || !n6.l.l(this.f4513b, gVar.f4513b) || !n6.l.l(this.f4514c, gVar.f4514c) || !n6.l.l(this.d, gVar.d) || !n6.l.l(this.e, gVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4512a, this.f4513b, this.f4514c, this.d, this.e});
    }

    public final String toString() {
        return a4.a.p("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 1, this.f4512a, i10);
        w7.e0.k(parcel, 2, this.f4513b, i10);
        w7.e0.k(parcel, 3, this.f4514c, i10);
        w7.e0.k(parcel, 4, this.d, i10);
        w7.e0.l(parcel, 5, this.e);
        w7.e0.r(parcel, q6);
    }
}
