package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends p6.a {
    public static final Parcelable.Creator<g> CREATOR = new r0(11);
    public final k0 f8182a;
    public final u0 f8183b;
    public final h f8184c;
    public final v0 d;
    public final String e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f8182a = k0Var;
        this.f8183b = u0Var;
        this.f8184c = hVar;
        this.d = v0Var;
        this.e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f8184c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f8185a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            k0 k0Var = this.f8182a;
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
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!o6.l.l(this.f8182a, gVar.f8182a) || !o6.l.l(this.f8183b, gVar.f8183b) || !o6.l.l(this.f8184c, gVar.f8184c) || !o6.l.l(this.d, gVar.d) || !o6.l.l(this.e, gVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8182a, this.f8183b, this.f8184c, this.d, this.e});
    }

    public final String toString() {
        return a1.g.p("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f8182a, i10);
        df.k(parcel, 2, this.f8183b, i10);
        df.k(parcel, 3, this.f8184c, i10);
        df.k(parcel, 4, this.d, i10);
        df.l(parcel, 5, this.e);
        df.r(parcel, q5);
    }
}
