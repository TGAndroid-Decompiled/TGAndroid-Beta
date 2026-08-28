package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends y5.a {
    public static final Parcelable.Creator<g> CREATOR = new r0(10);
    public final k0 f17521a;
    public final u0 f17522b;
    public final h f17523c;
    public final v0 d;
    public final String f17524e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f17521a = k0Var;
        this.f17522b = u0Var;
        this.f17523c = hVar;
        this.d = v0Var;
        this.f17524e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f17523c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f17525a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e10) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
                }
            }
            k0 k0Var = this.f17521a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.b());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.b());
            }
            String str = this.f17524e;
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
        if (!x5.l.l(this.f17521a, gVar.f17521a) || !x5.l.l(this.f17522b, gVar.f17522b) || !x5.l.l(this.f17523c, gVar.f17523c) || !x5.l.l(this.d, gVar.d) || !x5.l.l(this.f17524e, gVar.f17524e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17521a, this.f17522b, this.f17523c, this.d, this.f17524e});
    }

    public final String toString() {
        return aa.d.o("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.f17521a, i9);
        p8.k(parcel, 2, this.f17522b, i9);
        p8.k(parcel, 3, this.f17523c, i9);
        p8.k(parcel, 4, this.d, i9);
        p8.l(parcel, 5, this.f17524e);
        p8.r(parcel, q10);
    }
}
