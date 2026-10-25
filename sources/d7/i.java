package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(16);
    public final o7.s0 f8188a;
    public final o7.s0 f8189b;
    public final o7.s0 f8190c;
    public final o7.s0 d;
    public final o7.s0 e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        o7.s0 s10;
        o6.l.h(bArr);
        o7.s0 s11 = o7.s0.s(bArr.length, bArr);
        o6.l.h(bArr2);
        o7.s0 s12 = o7.s0.s(bArr2.length, bArr2);
        o6.l.h(bArr3);
        o7.s0 s13 = o7.s0.s(bArr3.length, bArr3);
        o6.l.h(bArr4);
        o7.s0 s14 = o7.s0.s(bArr4.length, bArr4);
        if (bArr5 == null) {
            s10 = null;
        } else {
            s10 = o7.s0.s(bArr5.length, bArr5);
        }
        this.f8188a = s11;
        this.f8189b = s12;
        this.f8190c = s13;
        this.d = s14;
        this.e = s10;
    }

    public final JSONObject b() {
        byte[] t10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", v6.b.c(this.f8189b.t()));
            jSONObject.put("authenticatorData", v6.b.c(this.f8190c.t()));
            jSONObject.put("signature", v6.b.c(this.d.t()));
            o7.s0 s0Var = this.e;
            if (s0Var != null) {
                if (s0Var == null) {
                    t10 = null;
                } else {
                    t10 = s0Var.t();
                }
                jSONObject.put("userHandle", v6.b.c(t10));
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
            if (o6.l.l(this.f8188a, iVar.f8188a) && o6.l.l(this.f8189b, iVar.f8189b) && o6.l.l(this.f8190c, iVar.f8190c) && o6.l.l(this.d, iVar.d) && o6.l.l(this.e, iVar.e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f8188a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f8189b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f8190c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        byte[] t10;
        k6.c cVar = new k6.c(getClass().getSimpleName());
        o7.k0 k0Var = o7.m0.d;
        byte[] t11 = this.f8188a.t();
        cVar.K(k0Var.c(t11.length, t11), "keyHandle");
        byte[] t12 = this.f8189b.t();
        cVar.K(k0Var.c(t12.length, t12), "clientDataJSON");
        byte[] t13 = this.f8190c.t();
        cVar.K(k0Var.c(t13.length, t13), "authenticatorData");
        byte[] t14 = this.d.t();
        cVar.K(k0Var.c(t14.length, t14), "signature");
        o7.s0 s0Var = this.e;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        if (t10 != null) {
            cVar.K(k0Var.c(t10.length, t10), "userHandle");
        }
        return cVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] t10;
        int q5 = df.q(parcel, 20293);
        df.c(parcel, 2, this.f8188a.t());
        df.c(parcel, 3, this.f8189b.t());
        df.c(parcel, 4, this.f8190c.t());
        df.c(parcel, 5, this.d.t());
        o7.s0 s0Var = this.e;
        if (s0Var == null) {
            t10 = null;
        } else {
            t10 = s0Var.t();
        }
        df.c(parcel, 6, t10);
        df.r(parcel, q5);
    }
}
