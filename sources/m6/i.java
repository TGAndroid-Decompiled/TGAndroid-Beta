package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(15);
    public final x6.s0 f17528a;
    public final x6.s0 f17529b;
    public final x6.s0 f17530c;
    public final x6.s0 d;
    public final x6.s0 f17531e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        x6.s0 t10;
        x5.l.h(bArr);
        x6.s0 t11 = x6.s0.t(bArr.length, bArr);
        x5.l.h(bArr2);
        x6.s0 t12 = x6.s0.t(bArr2.length, bArr2);
        x5.l.h(bArr3);
        x6.s0 t13 = x6.s0.t(bArr3.length, bArr3);
        x5.l.h(bArr4);
        x6.s0 t14 = x6.s0.t(bArr4.length, bArr4);
        if (bArr5 == null) {
            t10 = null;
        } else {
            t10 = x6.s0.t(bArr5.length, bArr5);
        }
        this.f17528a = t11;
        this.f17529b = t12;
        this.f17530c = t13;
        this.d = t14;
        this.f17531e = t10;
    }

    public final JSONObject b() {
        byte[] u10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", e6.b.c(this.f17529b.u()));
            jSONObject.put("authenticatorData", e6.b.c(this.f17530c.u()));
            jSONObject.put("signature", e6.b.c(this.d.u()));
            x6.s0 s0Var = this.f17531e;
            if (s0Var != null) {
                if (s0Var == null) {
                    u10 = null;
                } else {
                    u10 = s0Var.u();
                }
                jSONObject.put("userHandle", e6.b.c(u10));
                return jSONObject;
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (x5.l.l(this.f17528a, iVar.f17528a) && x5.l.l(this.f17529b, iVar.f17529b) && x5.l.l(this.f17530c, iVar.f17530c) && x5.l.l(this.d, iVar.d) && x5.l.l(this.f17531e, iVar.f17531e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f17528a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f17529b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f17530c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f17531e}))});
    }

    public final String toString() {
        byte[] u10;
        t5.c cVar = new t5.c(getClass().getSimpleName(), 12);
        x6.k0 k0Var = x6.m0.d;
        byte[] u11 = this.f17528a.u();
        cVar.j(k0Var.c(u11.length, u11), "keyHandle");
        byte[] u12 = this.f17529b.u();
        cVar.j(k0Var.c(u12.length, u12), "clientDataJSON");
        byte[] u13 = this.f17530c.u();
        cVar.j(k0Var.c(u13.length, u13), "authenticatorData");
        byte[] u14 = this.d.u();
        cVar.j(k0Var.c(u14.length, u14), "signature");
        x6.s0 s0Var = this.f17531e;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        if (u10 != null) {
            cVar.j(k0Var.c(u10.length, u10), "userHandle");
        }
        return cVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        byte[] u10;
        int q10 = p8.q(parcel, 20293);
        p8.c(parcel, 2, this.f17528a.u());
        p8.c(parcel, 3, this.f17529b.u());
        p8.c(parcel, 4, this.f17530c.u());
        p8.c(parcel, 5, this.d.u());
        x6.s0 s0Var = this.f17531e;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        p8.c(parcel, 6, u10);
        p8.r(parcel, q10);
    }
}
