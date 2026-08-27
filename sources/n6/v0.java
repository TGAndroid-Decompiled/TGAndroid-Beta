package n6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import h7.r8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class v0 extends z5.a {
    public static final Parcelable.Creator<v0> CREATOR = new o0(25);

    public final boolean f18428a;

    public final y6.s0 f18429b;

    public v0(boolean z10, y6.s0 s0Var) {
        this.f18428a = z10;
        this.f18429b = s0Var;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f18428a) {
                jSONObject.put("enabled", true);
            }
            y6.s0 s0Var = this.f18429b;
            byte[] bArrU = s0Var == null ? null : s0Var.u();
            if (bArrU != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrU, 32), 11));
                if (bArrU.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrU, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e9) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e9);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f18428a == v0Var.f18428a && y5.l.l(this.f18429b, v0Var.f18429b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f18428a), this.f18429b});
    }

    public final String toString() {
        return a9.p.m("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f18428a ? 1 : 0);
        y6.s0 s0Var = this.f18429b;
        r8.c(parcel, 2, s0Var == null ? null : s0Var.u());
        r8.r(parcel, iQ);
    }
}
