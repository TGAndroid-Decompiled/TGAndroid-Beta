package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class z50 extends c60 {
    public static final Parcelable.Creator<z50> CREATOR = new sje((byte) 12);
    public final rce a;
    public final rce b;
    public final rce c;
    public final rce d;
    public final rce e;

    public z50(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        rce o;
        ite.h(bArr);
        rce o2 = rce.o(bArr.length, bArr);
        ite.h(bArr2);
        rce o3 = rce.o(bArr2.length, bArr2);
        ite.h(bArr3);
        rce o4 = rce.o(bArr3.length, bArr3);
        ite.h(bArr4);
        rce o5 = rce.o(bArr4.length, bArr4);
        if (bArr5 == null) {
            o = null;
        } else {
            o = rce.o(bArr5.length, bArr5);
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
            jSONObject.put("clientDataJSON", xpd.b(this.b.p()));
            jSONObject.put("authenticatorData", xpd.b(this.c.p()));
            jSONObject.put("signature", xpd.b(this.d.p()));
            rce rceVar = this.e;
            if (rceVar != null) {
                if (rceVar == null) {
                    p = null;
                } else {
                    p = rceVar.p();
                }
                jSONObject.put("userHandle", xpd.b(p));
            }
            return jSONObject;
        } catch (JSONException e) {
            rjb.k("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z50) {
            z50 z50Var = (z50) obj;
            if (fse.a(this.a, z50Var.a) && fse.a(this.b, z50Var.b) && fse.a(this.c, z50Var.c) && fse.a(this.d, z50Var.d) && fse.a(this.e, z50Var.e)) {
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
        wm9 wm9Var = new wm9(getClass().getSimpleName(), (byte) 25);
        w8e w8eVar = n9e.d;
        byte[] p2 = this.a.p();
        wm9Var.B(w8eVar.c(p2.length, p2), "keyHandle");
        byte[] p3 = this.b.p();
        wm9Var.B(w8eVar.c(p3.length, p3), "clientDataJSON");
        byte[] p4 = this.c.p();
        wm9Var.B(w8eVar.c(p4.length, p4), "authenticatorData");
        byte[] p5 = this.d.p();
        wm9Var.B(w8eVar.c(p5.length, p5), "signature");
        rce rceVar = this.e;
        if (rceVar == null) {
            p = null;
        } else {
            p = rceVar.p();
        }
        if (p != null) {
            wm9Var.B(w8eVar.c(p.length, p), "userHandle");
        }
        return wm9Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] p;
        int r = mve.r(parcel, 20293);
        mve.c(parcel, 2, this.a.p());
        mve.c(parcel, 3, this.b.p());
        mve.c(parcel, 4, this.c.p());
        mve.c(parcel, 5, this.d.p());
        rce rceVar = this.e;
        if (rceVar == null) {
            p = null;
        } else {
            p = rceVar.p();
        }
        mve.c(parcel, 6, p);
        mve.s(parcel, r);
    }
}
