package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m.e3;
import org.json.JSONException;
import org.json.JSONObject;
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(15);
    public final n7.t0 f4518a;
    public final n7.t0 f4519b;
    public final n7.t0 f4520c;
    public final n7.t0 d;
    public final n7.t0 e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        n7.t0 t10;
        n6.l.h(bArr);
        n7.t0 t11 = n7.t0.t(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.t0 t12 = n7.t0.t(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.t0 t13 = n7.t0.t(bArr3.length, bArr3);
        n6.l.h(bArr4);
        n7.t0 t14 = n7.t0.t(bArr4.length, bArr4);
        if (bArr5 == null) {
            t10 = null;
        } else {
            t10 = n7.t0.t(bArr5.length, bArr5);
        }
        this.f4518a = t11;
        this.f4519b = t12;
        this.f4520c = t13;
        this.d = t14;
        this.e = t10;
    }

    public final JSONObject b() {
        byte[] u10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", u6.b.c(this.f4519b.u()));
            jSONObject.put("authenticatorData", u6.b.c(this.f4520c.u()));
            jSONObject.put("signature", u6.b.c(this.d.u()));
            n7.t0 t0Var = this.e;
            if (t0Var != null) {
                if (t0Var == null) {
                    u10 = null;
                } else {
                    u10 = t0Var.u();
                }
                jSONObject.put("userHandle", u6.b.c(u10));
                return jSONObject;
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (n6.l.l(this.f4518a, iVar.f4518a) && n6.l.l(this.f4519b, iVar.f4519b) && n6.l.l(this.f4520c, iVar.f4520c) && n6.l.l(this.d, iVar.d) && n6.l.l(this.e, iVar.e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f4518a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4519b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4520c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        byte[] u10;
        e3 e3Var = new e3(getClass().getSimpleName(), 7);
        n7.l0 l0Var = n7.n0.d;
        byte[] u11 = this.f4518a.u();
        e3Var.Y(l0Var.c(u11.length, u11), "keyHandle");
        byte[] u12 = this.f4519b.u();
        e3Var.Y(l0Var.c(u12.length, u12), "clientDataJSON");
        byte[] u13 = this.f4520c.u();
        e3Var.Y(l0Var.c(u13.length, u13), "authenticatorData");
        byte[] u14 = this.d.u();
        e3Var.Y(l0Var.c(u14.length, u14), "signature");
        n7.t0 t0Var = this.e;
        if (t0Var == null) {
            u10 = null;
        } else {
            u10 = t0Var.u();
        }
        if (u10 != null) {
            e3Var.Y(l0Var.c(u10.length, u10), "userHandle");
        }
        return e3Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.c(parcel, 2, this.f4518a.u());
        w7.e0.c(parcel, 3, this.f4519b.u());
        w7.e0.c(parcel, 4, this.f4520c.u());
        w7.e0.c(parcel, 5, this.d.u());
        n7.t0 t0Var = this.e;
        if (t0Var == null) {
            u10 = null;
        } else {
            u10 = t0Var.u();
        }
        w7.e0.c(parcel, 6, u10);
        w7.e0.r(parcel, q6);
    }
}
