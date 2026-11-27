package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class bhe extends c4 {
    public static final Parcelable.Creator<bhe> CREATOR = new ime((byte) 4);
    public final boolean a;
    public final gfe b;

    public bhe(boolean z, gfe gfeVar) {
        this.a = z;
        this.b = gfeVar;
    }

    public final JSONObject b() {
        byte[] p;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            gfe gfeVar = this.b;
            if (gfeVar == null) {
                p = null;
            } else {
                p = gfeVar.p();
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
            grb.j("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bhe) {
            bhe bheVar = (bhe) obj;
            if (this.a == bheVar.a && vue.a(this.b, bheVar.b)) {
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
        return qd4.y("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] p;
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        gfe gfeVar = this.b;
        if (gfeVar == null) {
            p = null;
        } else {
            p = gfeVar.p();
        }
        bye.c(parcel, 2, p);
        bye.s(parcel, r);
    }
}
