package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class x40 extends b4 {
    public static final Parcelable.Creator<x40> CREATOR = new igd((byte) 7);
    public final w8c a;
    public final wyd b;
    public final y40 c;
    public final lce d;
    public final String e;

    public x40(w8c w8cVar, wyd wydVar, y40 y40Var, lce lceVar, String str) {
        this.a = w8cVar;
        this.b = wydVar;
        this.c = y40Var;
        this.d = lceVar;
        this.e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            y40 y40Var = this.c;
            if (y40Var != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", y40Var.a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            w8c w8cVar = this.a;
            if (w8cVar != null) {
                jSONObject.put("uvm", w8cVar.b());
            }
            lce lceVar = this.d;
            if (lceVar != null) {
                jSONObject.put("prf", lceVar.b());
            }
            String str = this.e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            fyb.j("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x40)) {
            return false;
        }
        x40 x40Var = (x40) obj;
        if (!cqe.a(this.a, x40Var.a) || !cqe.a(this.b, x40Var.b) || !cqe.a(this.c, x40Var.c) || !cqe.a(this.d, x40Var.d) || !cqe.a(this.e, x40Var.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return tb4.y("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.k(parcel, 2, this.b, i);
        jte.k(parcel, 3, this.c, i);
        jte.k(parcel, 4, this.d, i);
        jte.l(parcel, 5, this.e);
        jte.s(parcel, r);
    }
}
