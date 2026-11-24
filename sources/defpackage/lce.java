package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class lce extends b4 {
    public static final Parcelable.Creator<lce> CREATOR = new rhe((byte) 4);
    public final boolean a;
    public final qae b;

    public lce(boolean z, qae qaeVar) {
        this.a = z;
        this.b = qaeVar;
    }

    public final JSONObject b() {
        byte[] p;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            qae qaeVar = this.b;
            if (qaeVar == null) {
                p = null;
            } else {
                p = qaeVar.p();
            }
            if (p != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(p, 32), 11));
                if (p.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(p, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            fyb.j("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lce) {
            lce lceVar = (lce) obj;
            if (this.a == lceVar.a && cqe.a(this.b, lceVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return tb4.y("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] p;
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        qae qaeVar = this.b;
        if (qaeVar == null) {
            p = null;
        } else {
            p = qaeVar.p();
        }
        jte.c(parcel, 2, p);
        jte.s(parcel, r);
    }
}
