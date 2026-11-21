package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import c8.bc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class v0 extends r6.a {
    public static final Parcelable.Creator<v0> CREATOR = new t0(3);
    public final boolean f11611a;
    public final q7.s0 f11612b;

    public v0(boolean z10, q7.s0 s0Var) {
        this.f11611a = z10;
        this.f11612b = s0Var;
    }

    public final JSONObject b() {
        byte[] p10;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f11611a) {
                jSONObject.put("enabled", true);
            }
            q7.s0 s0Var = this.f11612b;
            if (s0Var == null) {
                p10 = null;
            } else {
                p10 = s0Var.p();
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
        if (this.f11611a != v0Var.f11611a || !q6.m.l(this.f11612b, v0Var.f11612b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11611a), this.f11612b});
    }

    public final String toString() {
        return a8.p0.p("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        byte[] p10;
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f11611a ? 1 : 0);
        q7.s0 s0Var = this.f11612b;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        bc.c(parcel, 2, p10);
        bc.s(parcel, r10);
    }
}
