package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class x50 extends b4 {
    public static final Parcelable.Creator<x50> CREATOR = new jid((byte) 7);
    public final xac a;
    public final z0e b;
    public final y50 c;
    public final mee d;
    public final String e;

    public x50(xac xacVar, z0e z0eVar, y50 y50Var, mee meeVar, String str) {
        this.a = xacVar;
        this.b = z0eVar;
        this.c = y50Var;
        this.d = meeVar;
        this.e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            y50 y50Var = this.c;
            if (y50Var != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", y50Var.a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            xac xacVar = this.a;
            if (xacVar != null) {
                jSONObject.put("uvm", xacVar.b());
            }
            mee meeVar = this.d;
            if (meeVar != null) {
                jSONObject.put("prf", meeVar.b());
            }
            String str = this.e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            rjb.k("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x50)) {
            return false;
        }
        x50 x50Var = (x50) obj;
        if (!fse.a(this.a, x50Var.a) || !fse.a(this.b, x50Var.b) || !fse.a(this.c, x50Var.c) || !fse.a(this.d, x50Var.d) || !fse.a(this.e, x50Var.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return kt6.o("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.k(parcel, 2, this.b, i);
        mve.k(parcel, 3, this.c, i);
        mve.k(parcel, 4, this.d, i);
        mve.l(parcel, 5, this.e);
        mve.s(parcel, r);
    }
}
