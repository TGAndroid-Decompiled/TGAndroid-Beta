package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.md0;
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new t0(4);
    public final q7.s0 f11549a;
    public final q7.s0 f11550b;
    public final q7.s0 f11551c;
    public final q7.s0 d;
    public final q7.s0 f11552e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        q7.s0 o4;
        q6.m.h(bArr);
        q7.s0 o10 = q7.s0.o(bArr.length, bArr);
        q6.m.h(bArr2);
        q7.s0 o11 = q7.s0.o(bArr2.length, bArr2);
        q6.m.h(bArr3);
        q7.s0 o12 = q7.s0.o(bArr3.length, bArr3);
        q6.m.h(bArr4);
        q7.s0 o13 = q7.s0.o(bArr4.length, bArr4);
        if (bArr5 == null) {
            o4 = null;
        } else {
            o4 = q7.s0.o(bArr5.length, bArr5);
        }
        this.f11549a = o10;
        this.f11550b = o11;
        this.f11551c = o12;
        this.d = o13;
        this.f11552e = o4;
    }

    public final JSONObject b() {
        byte[] p10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", x6.b.c(this.f11550b.p()));
            jSONObject.put("authenticatorData", x6.b.c(this.f11551c.p()));
            jSONObject.put("signature", x6.b.c(this.d.p()));
            q7.s0 s0Var = this.f11552e;
            if (s0Var != null) {
                if (s0Var == null) {
                    p10 = null;
                } else {
                    p10 = s0Var.p();
                }
                jSONObject.put("userHandle", x6.b.c(p10));
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
            if (q6.m.l(this.f11549a, iVar.f11549a) && q6.m.l(this.f11550b, iVar.f11550b) && q6.m.l(this.f11551c, iVar.f11551c) && q6.m.l(this.d, iVar.d) && q6.m.l(this.f11552e, iVar.f11552e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f11549a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11550b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11551c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11552e}))});
    }

    public final String toString() {
        byte[] p10;
        md0 md0Var = new md0(getClass().getSimpleName(), 10);
        q7.k0 k0Var = q7.m0.d;
        byte[] p11 = this.f11549a.p();
        md0Var.L(k0Var.c(p11.length, p11), "keyHandle");
        byte[] p12 = this.f11550b.p();
        md0Var.L(k0Var.c(p12.length, p12), "clientDataJSON");
        byte[] p13 = this.f11551c.p();
        md0Var.L(k0Var.c(p13.length, p13), "authenticatorData");
        byte[] p14 = this.d.p();
        md0Var.L(k0Var.c(p14.length, p14), "signature");
        q7.s0 s0Var = this.f11552e;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        if (p10 != null) {
            md0Var.L(k0Var.c(p10.length, p10), "userHandle");
        }
        return md0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        byte[] p10;
        int r10 = bc.r(parcel, 20293);
        bc.c(parcel, 2, this.f11549a.p());
        bc.c(parcel, 3, this.f11550b.p());
        bc.c(parcel, 4, this.f11551c.p());
        bc.c(parcel, 5, this.d.p());
        q7.s0 s0Var = this.f11552e;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        bc.c(parcel, 6, p10);
        bc.s(parcel, r10);
    }
}
