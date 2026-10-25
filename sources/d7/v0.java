package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class v0 extends p6.a {
    public static final Parcelable.Creator<v0> CREATOR = new r0(15);
    public final boolean f8248a;
    public final o7.s0 f8249b;

    public v0(boolean z10, o7.s0 s0Var) {
        this.f8248a = z10;
        this.f8249b = s0Var;
    }

    public final JSONObject b() {
        byte[] t10;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f8248a) {
                jSONObject.put("enabled", true);
            }
            o7.s0 s0Var = this.f8249b;
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
        if (this.f8248a != v0Var.f8248a || !o6.l.l(this.f8249b, v0Var.f8249b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f8248a), this.f8249b});
    }

    public final String toString() {
        return a1.g.p("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] t10;
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f8248a ? 1 : 0);
        o7.s0 s0Var = this.f8249b;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        df.c(parcel, 2, t10);
        df.r(parcel, q5);
    }
}
