package m6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import g7.p8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class v0 extends y5.a {
    public static final Parcelable.Creator<v0> CREATOR = new r0(14);
    public final boolean f17592a;
    public final x6.s0 f17593b;

    public v0(boolean z10, x6.s0 s0Var) {
        this.f17592a = z10;
        this.f17593b = s0Var;
    }

    public final JSONObject b() {
        byte[] u10;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f17592a) {
                jSONObject.put("enabled", true);
            }
            x6.s0 s0Var = this.f17593b;
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
        if (this.f17592a != v0Var.f17592a || !x5.l.l(this.f17593b, v0Var.f17593b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f17592a), this.f17593b});
    }

    public final String toString() {
        return aa.d.o("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        byte[] u10;
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f17592a ? 1 : 0);
        x6.s0 s0Var = this.f17593b;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        p8.c(parcel, 2, u10);
        p8.r(parcel, q10);
    }
}
