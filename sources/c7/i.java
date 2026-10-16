package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m.h3;
import org.json.JSONException;
import org.json.JSONObject;
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(15);
    public final n7.t0 f4592a;
    public final n7.t0 f4593b;
    public final n7.t0 f4594c;
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
        this.f4592a = s11;
        this.f4593b = s12;
        this.f4594c = s13;
        this.d = s14;
        this.e = s10;
    }

    public final JSONObject b() {
        byte[] t10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", u6.b.c(this.f4593b.t()));
            jSONObject.put("authenticatorData", u6.b.c(this.f4594c.t()));
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
            if (n6.l.l(this.f4592a, iVar.f4592a) && n6.l.l(this.f4593b, iVar.f4593b) && n6.l.l(this.f4594c, iVar.f4594c) && n6.l.l(this.d, iVar.d) && n6.l.l(this.e, iVar.e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f4592a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4593b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4594c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        byte[] t10;
        h3 h3Var = new h3(getClass().getSimpleName());
        n7.l0 l0Var = n7.n0.d;
        byte[] t11 = this.f4592a.t();
        h3Var.Y(l0Var.c(t11.length, t11), "keyHandle");
        byte[] t12 = this.f4593b.t();
        h3Var.Y(l0Var.c(t12.length, t12), "clientDataJSON");
        byte[] t13 = this.f4594c.t();
        h3Var.Y(l0Var.c(t13.length, t13), "authenticatorData");
        byte[] t14 = this.d.t();
        h3Var.Y(l0Var.c(t14.length, t14), "signature");
        n7.t0 t0Var = this.e;
        if (t0Var == null) {
            t10 = null;
        } else {
            t10 = t0Var.t();
        }
        if (t10 != null) {
            h3Var.Y(l0Var.c(t10.length, t10), "userHandle");
        }
        return h3Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] t10;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.c(parcel, 2, this.f4592a.t());
        w7.f0.c(parcel, 3, this.f4593b.t());
        w7.f0.c(parcel, 4, this.f4594c.t());
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
