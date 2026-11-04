package e7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class v0 extends q6.a {
    public static final Parcelable.Creator<v0> CREATOR = new r0(18);
    public final boolean f9894a;
    public final p7.t0 f9895b;

    public v0(boolean z10, p7.t0 t0Var) {
        this.f9894a = z10;
        this.f9895b = t0Var;
    }

    public final JSONObject b() {
        byte[] p10;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f9894a) {
                jSONObject.put("enabled", true);
            }
            p7.t0 t0Var = this.f9895b;
            if (t0Var == null) {
                p10 = null;
            } else {
                p10 = t0Var.p();
            }
            if (p10 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(p10, 32), 11));
                if (p10.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(p10, 32, 64), 11));
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
        if (this.f9894a != v0Var.f9894a || !p6.m.k(this.f9895b, v0Var.f9895b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9894a), this.f9895b});
    }

    public final String toString() {
        return a1.g.q("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        byte[] p10;
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f9894a ? 1 : 0);
        p7.t0 t0Var = this.f9895b;
        if (t0Var == null) {
            p10 = null;
        } else {
            p10 = t0Var.p();
        }
        j8.a.d(parcel, 2, p10);
        j8.a.t(parcel, s6);
    }
}
