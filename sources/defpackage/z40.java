package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class z40 extends c50 {
    public static final Parcelable.Creator<z40> CREATOR = new rhe((byte) 12);
    public final qae a;
    public final qae b;
    public final qae c;
    public final qae d;
    public final qae e;

    public z40(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        qae o;
        fre.h(bArr);
        qae o2 = qae.o(bArr.length, bArr);
        fre.h(bArr2);
        qae o3 = qae.o(bArr2.length, bArr2);
        fre.h(bArr3);
        qae o4 = qae.o(bArr3.length, bArr3);
        fre.h(bArr4);
        qae o5 = qae.o(bArr4.length, bArr4);
        if (bArr5 == null) {
            o = null;
        } else {
            o = qae.o(bArr5.length, bArr5);
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
            jSONObject.put("clientDataJSON", und.b(this.b.p()));
            jSONObject.put("authenticatorData", und.b(this.c.p()));
            jSONObject.put("signature", und.b(this.d.p()));
            qae qaeVar = this.e;
            if (qaeVar != null) {
                if (qaeVar == null) {
                    p = null;
                } else {
                    p = qaeVar.p();
                }
                jSONObject.put("userHandle", und.b(p));
            }
            return jSONObject;
        } catch (JSONException e) {
            fyb.j("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z40) {
            z40 z40Var = (z40) obj;
            if (cqe.a(this.a, z40Var.a) && cqe.a(this.b, z40Var.b) && cqe.a(this.c, z40Var.c) && cqe.a(this.d, z40Var.d) && cqe.a(this.e, z40Var.e)) {
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
        vk9 vk9Var = new vk9(getClass().getSimpleName(), (byte) 25);
        v6e v6eVar = m7e.d;
        byte[] p2 = this.a.p();
        vk9Var.B(v6eVar.c(p2.length, p2), "keyHandle");
        byte[] p3 = this.b.p();
        vk9Var.B(v6eVar.c(p3.length, p3), "clientDataJSON");
        byte[] p4 = this.c.p();
        vk9Var.B(v6eVar.c(p4.length, p4), "authenticatorData");
        byte[] p5 = this.d.p();
        vk9Var.B(v6eVar.c(p5.length, p5), "signature");
        qae qaeVar = this.e;
        if (qaeVar == null) {
            p = null;
        } else {
            p = qaeVar.p();
        }
        if (p != null) {
            vk9Var.B(v6eVar.c(p.length, p), "userHandle");
        }
        return vk9Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] p;
        int r = jte.r(parcel, 20293);
        jte.c(parcel, 2, this.a.p());
        jte.c(parcel, 3, this.b.p());
        jte.c(parcel, 4, this.c.p());
        jte.c(parcel, 5, this.d.p());
        qae qaeVar = this.e;
        if (qaeVar == null) {
            p = null;
        } else {
            p = qaeVar.p();
        }
        jte.c(parcel, 6, p);
        jte.s(parcel, r);
    }
}
