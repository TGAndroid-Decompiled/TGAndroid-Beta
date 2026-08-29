package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new n0(27);
    public final z6.s0 f19388a;
    public final z6.s0 f19389b;
    public final z6.s0 f19390c;
    public final z6.s0 d;
    public final z6.s0 f19391e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        z6.s0 t10;
        z5.l.h(bArr);
        z6.s0 t11 = z6.s0.t(bArr.length, bArr);
        z5.l.h(bArr2);
        z6.s0 t12 = z6.s0.t(bArr2.length, bArr2);
        z5.l.h(bArr3);
        z6.s0 t13 = z6.s0.t(bArr3.length, bArr3);
        z5.l.h(bArr4);
        z6.s0 t14 = z6.s0.t(bArr4.length, bArr4);
        if (bArr5 == null) {
            t10 = null;
        } else {
            t10 = z6.s0.t(bArr5.length, bArr5);
        }
        this.f19388a = t11;
        this.f19389b = t12;
        this.f19390c = t13;
        this.d = t14;
        this.f19391e = t10;
    }

    public final JSONObject b() {
        byte[] u10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", g6.b.c(this.f19389b.u()));
            jSONObject.put("authenticatorData", g6.b.c(this.f19390c.u()));
            jSONObject.put("signature", g6.b.c(this.d.u()));
            z6.s0 s0Var = this.f19391e;
            if (s0Var != null) {
                if (s0Var == null) {
                    u10 = null;
                } else {
                    u10 = s0Var.u();
                }
                jSONObject.put("userHandle", g6.b.c(u10));
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
            if (z5.l.l(this.f19388a, iVar.f19388a) && z5.l.l(this.f19389b, iVar.f19389b) && z5.l.l(this.f19390c, iVar.f19390c) && z5.l.l(this.d, iVar.d) && z5.l.l(this.f19391e, iVar.f19391e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f19388a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f19389b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f19390c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f19391e}))});
    }

    public final String toString() {
        byte[] u10;
        v5.c cVar = new v5.c(getClass().getSimpleName(), 11);
        z6.k0 k0Var = z6.m0.d;
        byte[] u11 = this.f19388a.u();
        cVar.j(k0Var.c(u11.length, u11), "keyHandle");
        byte[] u12 = this.f19389b.u();
        cVar.j(k0Var.c(u12.length, u12), "clientDataJSON");
        byte[] u13 = this.f19390c.u();
        cVar.j(k0Var.c(u13.length, u13), "authenticatorData");
        byte[] u14 = this.d.u();
        cVar.j(k0Var.c(u14.length, u14), "signature");
        z6.s0 s0Var = this.f19391e;
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
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.c(parcel, 2, this.f19388a.u());
        com.google.android.gms.internal.cast.o.c(parcel, 3, this.f19389b.u());
        com.google.android.gms.internal.cast.o.c(parcel, 4, this.f19390c.u());
        com.google.android.gms.internal.cast.o.c(parcel, 5, this.d.u());
        z6.s0 s0Var = this.f19391e;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        com.google.android.gms.internal.cast.o.c(parcel, 6, u10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
