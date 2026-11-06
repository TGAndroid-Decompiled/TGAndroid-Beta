package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.hy0;
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new t0(4);
    public final q7.s0 f11386a;
    public final q7.s0 f11387b;
    public final q7.s0 f11388c;
    public final q7.s0 d;
    public final q7.s0 f11389e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        q7.s0 o4;
        q6.m.g(bArr);
        q7.s0 o10 = q7.s0.o(bArr.length, bArr);
        q6.m.g(bArr2);
        q7.s0 o11 = q7.s0.o(bArr2.length, bArr2);
        q6.m.g(bArr3);
        q7.s0 o12 = q7.s0.o(bArr3.length, bArr3);
        q6.m.g(bArr4);
        q7.s0 o13 = q7.s0.o(bArr4.length, bArr4);
        if (bArr5 == null) {
            o4 = null;
        } else {
            o4 = q7.s0.o(bArr5.length, bArr5);
        }
        this.f11386a = o10;
        this.f11387b = o11;
        this.f11388c = o12;
        this.d = o13;
        this.f11389e = o4;
    }

    public final JSONObject b() {
        byte[] p10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", x6.b.c(this.f11387b.p()));
            jSONObject.put("authenticatorData", x6.b.c(this.f11388c.p()));
            jSONObject.put("signature", x6.b.c(this.d.p()));
            q7.s0 s0Var = this.f11389e;
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
            if (q6.m.k(this.f11386a, iVar.f11386a) && q6.m.k(this.f11387b, iVar.f11387b) && q6.m.k(this.f11388c, iVar.f11388c) && q6.m.k(this.d, iVar.d) && q6.m.k(this.f11389e, iVar.f11389e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f11386a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11387b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11388c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11389e}))});
    }

    public final String toString() {
        byte[] p10;
        hy0 hy0Var = new hy0(getClass().getSimpleName(), 9);
        q7.k0 k0Var = q7.m0.d;
        byte[] p11 = this.f11386a.p();
        hy0Var.N(k0Var.c(p11.length, p11), "keyHandle");
        byte[] p12 = this.f11387b.p();
        hy0Var.N(k0Var.c(p12.length, p12), "clientDataJSON");
        byte[] p13 = this.f11388c.p();
        hy0Var.N(k0Var.c(p13.length, p13), "authenticatorData");
        byte[] p14 = this.d.p();
        hy0Var.N(k0Var.c(p14.length, p14), "signature");
        q7.s0 s0Var = this.f11389e;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        if (p10 != null) {
            hy0Var.N(k0Var.c(p10.length, p10), "userHandle");
        }
        return hy0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        byte[] p10;
        int r10 = wb.r(parcel, 20293);
        wb.c(parcel, 2, this.f11386a.p());
        wb.c(parcel, 3, this.f11387b.p());
        wb.c(parcel, 4, this.f11388c.p());
        wb.c(parcel, 5, this.d.p());
        q7.s0 s0Var = this.f11389e;
        if (s0Var == null) {
            p10 = null;
        } else {
            p10 = s0Var.p();
        }
        wb.c(parcel, 6, p10);
        wb.s(parcel, r10);
    }
}
