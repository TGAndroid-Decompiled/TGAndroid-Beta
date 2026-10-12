package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m.f3;
import org.json.JSONException;
import org.json.JSONObject;
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(15);
    public final n7.s0 f4480a;
    public final n7.s0 f4481b;
    public final n7.s0 f4482c;
    public final n7.s0 d;
    public final n7.s0 f4483e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        n7.s0 t10;
        n6.m.h(bArr);
        n7.s0 t11 = n7.s0.t(bArr.length, bArr);
        n6.m.h(bArr2);
        n7.s0 t12 = n7.s0.t(bArr2.length, bArr2);
        n6.m.h(bArr3);
        n7.s0 t13 = n7.s0.t(bArr3.length, bArr3);
        n6.m.h(bArr4);
        n7.s0 t14 = n7.s0.t(bArr4.length, bArr4);
        if (bArr5 == null) {
            t10 = null;
        } else {
            t10 = n7.s0.t(bArr5.length, bArr5);
        }
        this.f4480a = t11;
        this.f4481b = t12;
        this.f4482c = t13;
        this.d = t14;
        this.f4483e = t10;
    }

    public final JSONObject b() {
        byte[] u10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", u6.b.c(this.f4481b.u()));
            jSONObject.put("authenticatorData", u6.b.c(this.f4482c.u()));
            jSONObject.put("signature", u6.b.c(this.d.u()));
            n7.s0 s0Var = this.f4483e;
            if (s0Var != null) {
                if (s0Var == null) {
                    u10 = null;
                } else {
                    u10 = s0Var.u();
                }
                jSONObject.put("userHandle", u6.b.c(u10));
                return jSONObject;
            }
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (n6.m.l(this.f4480a, iVar.f4480a) && n6.m.l(this.f4481b, iVar.f4481b) && n6.m.l(this.f4482c, iVar.f4482c) && n6.m.l(this.d, iVar.d) && n6.m.l(this.f4483e, iVar.f4483e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f4480a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4481b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4482c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4483e}))});
    }

    public final String toString() {
        byte[] u10;
        f3 f3Var = new f3(getClass().getSimpleName());
        n7.k0 k0Var = n7.m0.d;
        byte[] u11 = this.f4480a.u();
        f3Var.Z(k0Var.c(u11.length, u11), "keyHandle");
        byte[] u12 = this.f4481b.u();
        f3Var.Z(k0Var.c(u12.length, u12), "clientDataJSON");
        byte[] u13 = this.f4482c.u();
        f3Var.Z(k0Var.c(u13.length, u13), "authenticatorData");
        byte[] u14 = this.d.u();
        f3Var.Z(k0Var.c(u14.length, u14), "signature");
        n7.s0 s0Var = this.f4483e;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        if (u10 != null) {
            f3Var.Z(k0Var.c(u10.length, u10), "userHandle");
        }
        return f3Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.c(parcel, 2, this.f4480a.u());
        w7.c0.c(parcel, 3, this.f4481b.u());
        w7.c0.c(parcel, 4, this.f4482c.u());
        w7.c0.c(parcel, 5, this.d.u());
        n7.s0 s0Var = this.f4483e;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        w7.c0.c(parcel, 6, u10);
        w7.c0.r(parcel, q6);
    }
}
