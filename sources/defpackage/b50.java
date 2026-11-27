package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class b50 extends e50 {
    public static final Parcelable.Creator<b50> CREATOR = new ime((byte) 12);
    public final gfe a;
    public final gfe b;
    public final gfe c;
    public final gfe d;
    public final gfe e;

    public b50(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        gfe o;
        xve.h(bArr);
        gfe o2 = gfe.o(bArr.length, bArr);
        xve.h(bArr2);
        gfe o3 = gfe.o(bArr2.length, bArr2);
        xve.h(bArr3);
        gfe o4 = gfe.o(bArr3.length, bArr3);
        xve.h(bArr4);
        gfe o5 = gfe.o(bArr4.length, bArr4);
        if (bArr5 == null) {
            o = null;
        } else {
            o = gfe.o(bArr5.length, bArr5);
        }
        this.a = o2;
        this.b = o3;
        this.c = o4;
        this.d = o5;
        this.e = o;
    }

    public final JSONObject b() {
        byte[] p;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", lsd.b(this.b.p()));
            jSONObject.put("authenticatorData", lsd.b(this.c.p()));
            jSONObject.put("signature", lsd.b(this.d.p()));
            gfe gfeVar = this.e;
            if (gfeVar != null) {
                if (gfeVar == null) {
                    p = null;
                } else {
                    p = gfeVar.p();
                }
                jSONObject.put("userHandle", lsd.b(p));
            }
            return jSONObject;
        } catch (JSONException e) {
            grb.j("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b50) {
            b50 b50Var = (b50) obj;
            if (vue.a(this.a, b50Var.a) && vue.a(this.b, b50Var.b) && vue.a(this.c, b50Var.c) && vue.a(this.d, b50Var.d) && vue.a(this.e, b50Var.e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        byte[] p;
        ko9 ko9Var = new ko9(getClass().getSimpleName(), (byte) 25);
        lbe lbeVar = cce.d;
        byte[] p2 = this.a.p();
        ko9Var.B(lbeVar.c(p2.length, p2), "keyHandle");
        byte[] p3 = this.b.p();
        ko9Var.B(lbeVar.c(p3.length, p3), "clientDataJSON");
        byte[] p4 = this.c.p();
        ko9Var.B(lbeVar.c(p4.length, p4), "authenticatorData");
        byte[] p5 = this.d.p();
        ko9Var.B(lbeVar.c(p5.length, p5), "signature");
        gfe gfeVar = this.e;
        if (gfeVar == null) {
            p = null;
        } else {
            p = gfeVar.p();
        }
        if (p != null) {
            ko9Var.B(lbeVar.c(p.length, p), "userHandle");
        }
        return ko9Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] p;
        int r = bye.r(parcel, 20293);
        bye.c(parcel, 2, this.a.p());
        bye.c(parcel, 3, this.b.p());
        bye.c(parcel, 4, this.c.p());
        bye.c(parcel, 5, this.d.p());
        gfe gfeVar = this.e;
        if (gfeVar == null) {
            p = null;
        } else {
            p = gfeVar.p();
        }
        bye.c(parcel, 6, p);
        bye.s(parcel, r);
    }
}
