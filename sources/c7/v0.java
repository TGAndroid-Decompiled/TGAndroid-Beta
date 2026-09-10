package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class v0 extends o6.a {
    public static final Parcelable.Creator<v0> CREATOR = new r0(14);
    public final boolean f4578a;
    public final n7.t0 f4579b;

    public v0(boolean z10, n7.t0 t0Var) {
        this.f4578a = z10;
        this.f4579b = t0Var;
    }

    public final JSONObject b() {
        byte[] u10;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f4578a) {
                jSONObject.put("enabled", true);
            }
            n7.t0 t0Var = this.f4579b;
            if (t0Var == null) {
                u10 = null;
            } else {
                u10 = t0Var.u();
            }
            if (u10 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(u10, 32), 11));
                if (u10.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(u10, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f4578a != v0Var.f4578a || !n6.l.l(this.f4579b, v0Var.f4579b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4578a), this.f4579b});
    }

    public final String toString() {
        return a4.a.p("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f4578a ? 1 : 0);
        n7.t0 t0Var = this.f4579b;
        if (t0Var == null) {
            u10 = null;
        } else {
            u10 = t0Var.u();
        }
        w7.e0.c(parcel, 2, u10);
        w7.e0.r(parcel, q6);
    }
}
