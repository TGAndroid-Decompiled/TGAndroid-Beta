package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class g extends a6.a {
    public static final Parcelable.Creator<g> CREATOR = new n0(22);
    public final k0 f19381a;
    public final u0 f19382b;
    public final h f19383c;
    public final v0 d;
    public final String f19384e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.f19381a = k0Var;
        this.f19382b = u0Var;
        this.f19383c = hVar;
        this.d = v0Var;
        this.f19384e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.f19383c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.f19385a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e10) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
                }
            }
            k0 k0Var = this.f19381a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.b());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.b());
            }
            String str = this.f19384e;
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
        if (!z5.l.l(this.f19381a, gVar.f19381a) || !z5.l.l(this.f19382b, gVar.f19382b) || !z5.l.l(this.f19383c, gVar.f19383c) || !z5.l.l(this.d, gVar.d) || !z5.l.l(this.f19384e, gVar.f19384e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19381a, this.f19382b, this.f19383c, this.d, this.f19384e});
    }

    public final String toString() {
        return a4.w.n("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 1, this.f19381a, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f19382b, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f19383c, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 4, this.d, i10);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.f19384e);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
