package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class mee extends b4 {
    public static final Parcelable.Creator<mee> CREATOR = new sje((byte) 4);
    public final boolean a;
    public final rce b;

    public mee(boolean z, rce rceVar) {
        this.a = z;
        this.b = rceVar;
    }

    public final JSONObject b() {
        byte[] p;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            rce rceVar = this.b;
            if (rceVar == null) {
                p = null;
            } else {
                p = rceVar.p();
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
            rjb.k("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mee) {
            mee meeVar = (mee) obj;
            if (this.a == meeVar.a && fse.a(this.b, meeVar.b)) {
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
        return kt6.o("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] p;
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        rce rceVar = this.b;
        if (rceVar == null) {
            p = null;
        } else {
            p = rceVar.p();
        }
        mve.c(parcel, 2, p);
        mve.s(parcel, r);
    }
}
