package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(19);
    public final p7.t0 f9829a;
    public final p7.t0 f9830b;
    public final p7.t0 f9831c;
    public final p7.t0 d;
    public final p7.t0 f9832e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        p7.t0 o10;
        p6.m.g(bArr);
        p7.t0 o11 = p7.t0.o(bArr.length, bArr);
        p6.m.g(bArr2);
        p7.t0 o12 = p7.t0.o(bArr2.length, bArr2);
        p6.m.g(bArr3);
        p7.t0 o13 = p7.t0.o(bArr3.length, bArr3);
        p6.m.g(bArr4);
        p7.t0 o14 = p7.t0.o(bArr4.length, bArr4);
        if (bArr5 == null) {
            o10 = null;
        } else {
            o10 = p7.t0.o(bArr5.length, bArr5);
        }
        this.f9829a = o11;
        this.f9830b = o12;
        this.f9831c = o13;
        this.d = o14;
        this.f9832e = o10;
    }

    public final JSONObject b() {
        byte[] p10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", w6.b.c(this.f9830b.p()));
            jSONObject.put("authenticatorData", w6.b.c(this.f9831c.p()));
            jSONObject.put("signature", w6.b.c(this.d.p()));
            p7.t0 t0Var = this.f9832e;
            if (t0Var != null) {
                if (t0Var == null) {
                    p10 = null;
                } else {
                    p10 = t0Var.p();
                }
                jSONObject.put("userHandle", w6.b.c(p10));
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
            if (p6.m.k(this.f9829a, iVar.f9829a) && p6.m.k(this.f9830b, iVar.f9830b) && p6.m.k(this.f9831c, iVar.f9831c) && p6.m.k(this.d, iVar.d) && p6.m.k(this.f9832e, iVar.f9832e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f9829a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f9830b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f9831c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f9832e}))});
    }

    public final String toString() {
        byte[] p10;
        p7.d dVar = new p7.d(getClass().getSimpleName(), 1);
        p7.l0 l0Var = p7.n0.d;
        byte[] p11 = this.f9829a.p();
        dVar.I(l0Var.c(p11.length, p11), "keyHandle");
        byte[] p12 = this.f9830b.p();
        dVar.I(l0Var.c(p12.length, p12), "clientDataJSON");
        byte[] p13 = this.f9831c.p();
        dVar.I(l0Var.c(p13.length, p13), "authenticatorData");
        byte[] p14 = this.d.p();
        dVar.I(l0Var.c(p14.length, p14), "signature");
        p7.t0 t0Var = this.f9832e;
        if (t0Var == null) {
            p10 = null;
        } else {
            p10 = t0Var.p();
        }
        if (p10 != null) {
            dVar.I(l0Var.c(p10.length, p10), "userHandle");
        }
        return dVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        byte[] p10;
        int s6 = j8.a.s(parcel, 20293);
        j8.a.d(parcel, 2, this.f9829a.p());
        j8.a.d(parcel, 3, this.f9830b.p());
        j8.a.d(parcel, 4, this.f9831c.p());
        j8.a.d(parcel, 5, this.d.p());
        p7.t0 t0Var = this.f9832e;
        if (t0Var == null) {
            p10 = null;
        } else {
            p10 = t0Var.p();
        }
        j8.a.d(parcel, 6, p10);
        j8.a.t(parcel, s6);
    }
}
