package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(15);
    public final n7.s0 f4589a;
    public final n7.s0 f4590b;
    public final n7.s0 f4591c;
    public final n7.s0 d;
    public final n7.s0 e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        n7.s0 s10;
        n6.l.h(bArr);
        n7.s0 s11 = n7.s0.s(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.s0 s12 = n7.s0.s(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.s0 s13 = n7.s0.s(bArr3.length, bArr3);
        n6.l.h(bArr4);
        n7.s0 s14 = n7.s0.s(bArr4.length, bArr4);
        if (bArr5 == null) {
            s10 = null;
        } else {
            s10 = n7.s0.s(bArr5.length, bArr5);
        }
        this.f4589a = s11;
        this.f4590b = s12;
        this.f4591c = s13;
        this.d = s14;
        this.e = s10;
    }

    public final JSONObject b() {
        byte[] t10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", u6.b.c(this.f4590b.t()));
            jSONObject.put("authenticatorData", u6.b.c(this.f4591c.t()));
            jSONObject.put("signature", u6.b.c(this.d.t()));
            n7.s0 s0Var = this.e;
            if (s0Var != null) {
                if (s0Var == null) {
                    t10 = null;
                } else {
                    t10 = s0Var.t();
                }
                jSONObject.put("userHandle", u6.b.c(t10));
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
            if (n6.l.l(this.f4589a, iVar.f4589a) && n6.l.l(this.f4590b, iVar.f4590b) && n6.l.l(this.f4591c, iVar.f4591c) && n6.l.l(this.d, iVar.d) && n6.l.l(this.e, iVar.e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f4589a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4590b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4591c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        byte[] t10;
        li.k kVar = new li.k(getClass().getSimpleName());
        n7.k0 k0Var = n7.m0.d;
        byte[] t11 = this.f4589a.t();
        kVar.Y(k0Var.c(t11.length, t11), "keyHandle");
        byte[] t12 = this.f4590b.t();
        kVar.Y(k0Var.c(t12.length, t12), "clientDataJSON");
        byte[] t13 = this.f4591c.t();
        kVar.Y(k0Var.c(t13.length, t13), "authenticatorData");
        byte[] t14 = this.d.t();
        kVar.Y(k0Var.c(t14.length, t14), "signature");
        n7.s0 s0Var = this.e;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        if (t10 != null) {
            kVar.Y(k0Var.c(t10.length, t10), "userHandle");
        }
        return kVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] t10;
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.c(parcel, 2, this.f4589a.t());
        w7.g0.c(parcel, 3, this.f4590b.t());
        w7.g0.c(parcel, 4, this.f4591c.t());
        w7.g0.c(parcel, 5, this.d.t());
        n7.s0 s0Var = this.e;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        w7.g0.c(parcel, 6, t10);
        w7.g0.r(parcel, q6);
    }
}
