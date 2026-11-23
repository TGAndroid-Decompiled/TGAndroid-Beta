package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import c8.cc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class v0 extends r6.a {
    public static final Parcelable.Creator<v0> CREATOR = new t0(3);
    public final boolean f11577a;
    public final q7.s0 f11578b;

    public v0(boolean z10, q7.s0 s0Var) {
        this.f11577a = z10;
        this.f11578b = s0Var;
    }

    public final JSONObject b() {
        byte[] p10;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f11577a) {
                jSONObject.put("enabled", true);
            }
            q7.s0 s0Var = this.f11578b;
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
        if (this.f11577a != v0Var.f11577a || !q6.m.l(this.f11578b, v0Var.f11578b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11577a), this.f11578b});
    }

    public final String toString() {
        return a8.p0.p("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        byte[] p10;
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f11577a ? 1 : 0);
        q7.s0 s0Var = this.f11578b;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        cc.c(parcel, 2, p10);
        cc.s(parcel, r10);
    }
}
