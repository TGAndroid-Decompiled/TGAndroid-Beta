package o6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class v0 extends a6.a {
    public static final Parcelable.Creator<v0> CREATOR = new n0(26);
    public final boolean f19452a;
    public final z6.s0 f19453b;

    public v0(boolean z10, z6.s0 s0Var) {
        this.f19452a = z10;
        this.f19453b = s0Var;
    }

    public final JSONObject b() {
        byte[] u10;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f19452a) {
                jSONObject.put("enabled", true);
            }
            z6.s0 s0Var = this.f19453b;
            if (s0Var == null) {
                u10 = null;
            } else {
                u10 = s0Var.u();
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
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f19452a != v0Var.f19452a || !z5.l.l(this.f19453b, v0Var.f19453b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19452a), this.f19453b});
    }

    public final String toString() {
        return a4.w.n("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f19452a ? 1 : 0);
        z6.s0 s0Var = this.f19453b;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        com.google.android.gms.internal.cast.o.c(parcel, 2, u10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
