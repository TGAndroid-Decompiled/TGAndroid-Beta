package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new o0(26);

    public final y6.s0 f18364a;

    public final y6.s0 f18365b;

    public final y6.s0 f18366c;
    public final y6.s0 d;

    public final y6.s0 f18367e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        y5.l.h(bArr);
        y6.s0 s0VarT = y6.s0.t(bArr.length, bArr);
        y5.l.h(bArr2);
        y6.s0 s0VarT2 = y6.s0.t(bArr2.length, bArr2);
        y5.l.h(bArr3);
        y6.s0 s0VarT3 = y6.s0.t(bArr3.length, bArr3);
        y5.l.h(bArr4);
        y6.s0 s0VarT4 = y6.s0.t(bArr4.length, bArr4);
        y6.s0 s0VarT5 = bArr5 == null ? null : y6.s0.t(bArr5.length, bArr5);
        this.f18364a = s0VarT;
        this.f18365b = s0VarT2;
        this.f18366c = s0VarT3;
        this.d = s0VarT4;
        this.f18367e = s0VarT5;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", f6.b.c(this.f18365b.u()));
            jSONObject.put("authenticatorData", f6.b.c(this.f18366c.u()));
            jSONObject.put("signature", f6.b.c(this.d.u()));
            y6.s0 s0Var = this.f18367e;
            if (s0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", f6.b.c(s0Var == null ? null : s0Var.u()));
            return jSONObject;
        } catch (JSONException e9) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e9);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return y5.l.l(this.f18364a, iVar.f18364a) && y5.l.l(this.f18365b, iVar.f18365b) && y5.l.l(this.f18366c, iVar.f18366c) && y5.l.l(this.d, iVar.d) && y5.l.l(this.f18367e, iVar.f18367e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f18364a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f18365b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f18366c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f18367e}))});
    }

    public final String toString() {
        u2.b bVar = new u2.b(getClass().getSimpleName(), 12);
        y6.k0 k0Var = y6.m0.d;
        byte[] bArrU = this.f18364a.u();
        bVar.j(k0Var.c(bArrU.length, bArrU), "keyHandle");
        byte[] bArrU2 = this.f18365b.u();
        bVar.j(k0Var.c(bArrU2.length, bArrU2), "clientDataJSON");
        byte[] bArrU3 = this.f18366c.u();
        bVar.j(k0Var.c(bArrU3.length, bArrU3), "authenticatorData");
        byte[] bArrU4 = this.d.u();
        bVar.j(k0Var.c(bArrU4.length, bArrU4), "signature");
        y6.s0 s0Var = this.f18367e;
        byte[] bArrU5 = s0Var == null ? null : s0Var.u();
        if (bArrU5 != null) {
            bVar.j(k0Var.c(bArrU5.length, bArrU5), "userHandle");
        }
        return bVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.c(parcel, 2, this.f18364a.u());
        r8.c(parcel, 3, this.f18365b.u());
        r8.c(parcel, 4, this.f18366c.u());
        r8.c(parcel, 5, this.d.u());
        y6.s0 s0Var = this.f18367e;
        r8.c(parcel, 6, s0Var == null ? null : s0Var.u());
        r8.r(parcel, iQ);
    }
}
