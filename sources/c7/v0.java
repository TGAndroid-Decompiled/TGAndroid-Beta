package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class v0 extends o6.a {
    public static final Parcelable.Creator<v0> CREATOR = new r0(14);
    public final boolean f4496a;
    public final n7.s0 f4497b;

    public v0(boolean z10, n7.s0 s0Var) {
        this.f4496a = z10;
        this.f4497b = s0Var;
    }

    public final JSONObject b() {
        byte[] u10;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f4496a) {
                jSONObject.put("enabled", true);
            }
            n7.s0 s0Var = this.f4497b;
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
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f4496a != v0Var.f4496a || !n6.l.l(this.f4497b, v0Var.f4497b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4496a), this.f4497b});
    }

    public final String toString() {
        return a4.a.q("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f4496a ? 1 : 0);
        n7.s0 s0Var = this.f4497b;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        w7.g0.c(parcel, 2, u10);
        w7.g0.r(parcel, q6);
    }
}
