package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class v0 extends o6.a {
    public static final Parcelable.Creator<v0> CREATOR = new r0(14);
    public final boolean f4649a;
    public final n7.s0 f4650b;

    public v0(boolean z10, n7.s0 s0Var) {
        this.f4649a = z10;
        this.f4650b = s0Var;
    }

    public final JSONObject b() {
        byte[] t10;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f4649a) {
                jSONObject.put("enabled", true);
            }
            n7.s0 s0Var = this.f4650b;
            if (s0Var == null) {
                t10 = null;
            } else {
                t10 = s0Var.t();
            }
            if (t10 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(t10, 32), 11));
                if (t10.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(t10, 32, 64), 11));
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
        if (this.f4649a != v0Var.f4649a || !n6.l.l(this.f4650b, v0Var.f4650b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4649a), this.f4650b});
    }

    public final String toString() {
        return a1.g.p("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] t10;
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f4649a ? 1 : 0);
        n7.s0 s0Var = this.f4650b;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        w7.g0.c(parcel, 2, t10);
        w7.g0.r(parcel, q6);
    }
}
