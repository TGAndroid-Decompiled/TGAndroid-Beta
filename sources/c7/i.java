package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m.g3;
import org.json.JSONException;
import org.json.JSONObject;
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(15);
    public final n7.t0 f4963a;
    public final n7.t0 f4964b;
    public final n7.t0 f4965c;
    public final n7.t0 d;
    public final n7.t0 e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        n7.t0 s10;
        n6.l.h(bArr);
        n7.t0 s11 = n7.t0.s(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.t0 s12 = n7.t0.s(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.t0 s13 = n7.t0.s(bArr3.length, bArr3);
        n6.l.h(bArr4);
        n7.t0 s14 = n7.t0.s(bArr4.length, bArr4);
        if (bArr5 == null) {
            s10 = null;
        } else {
            s10 = n7.t0.s(bArr5.length, bArr5);
        }
        this.f4963a = s11;
        this.f4964b = s12;
        this.f4965c = s13;
        this.d = s14;
        this.e = s10;
    }

    public final JSONObject b() {
        byte[] t10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", u6.b.c(this.f4964b.t()));
            jSONObject.put("authenticatorData", u6.b.c(this.f4965c.t()));
            jSONObject.put("signature", u6.b.c(this.d.t()));
            n7.t0 t0Var = this.e;
            if (t0Var != null) {
                if (t0Var == null) {
                    t10 = null;
                } else {
                    t10 = t0Var.t();
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
            if (n6.l.l(this.f4963a, iVar.f4963a) && n6.l.l(this.f4964b, iVar.f4964b) && n6.l.l(this.f4965c, iVar.f4965c) && n6.l.l(this.d, iVar.d) && n6.l.l(this.e, iVar.e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f4963a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4964b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4965c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        byte[] t10;
        g3 g3Var = new g3(getClass().getSimpleName());
        n7.l0 l0Var = n7.n0.d;
        byte[] t11 = this.f4963a.t();
        g3Var.Y(l0Var.c(t11.length, t11), "keyHandle");
        byte[] t12 = this.f4964b.t();
        g3Var.Y(l0Var.c(t12.length, t12), "clientDataJSON");
        byte[] t13 = this.f4965c.t();
        g3Var.Y(l0Var.c(t13.length, t13), "authenticatorData");
        byte[] t14 = this.d.t();
        g3Var.Y(l0Var.c(t14.length, t14), "signature");
        n7.t0 t0Var = this.e;
        if (t0Var == null) {
            t10 = null;
        } else {
            t10 = t0Var.t();
        }
        if (t10 != null) {
            g3Var.Y(l0Var.c(t10.length, t10), "userHandle");
        }
        return g3Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] t10;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.c(parcel, 2, this.f4963a.t());
        w7.f0.c(parcel, 3, this.f4964b.t());
        w7.f0.c(parcel, 4, this.f4965c.t());
        w7.f0.c(parcel, 5, this.d.t());
        n7.t0 t0Var = this.e;
        if (t0Var == null) {
            t10 = null;
        } else {
            t10 = t0Var.t();
        }
        w7.f0.c(parcel, 6, t10);
        w7.f0.r(parcel, q6);
    }
}
