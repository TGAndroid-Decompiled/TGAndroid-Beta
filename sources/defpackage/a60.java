package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class a60 extends c60 {
    public static final Parcelable.Creator<a60> CREATOR = new sje((byte) 18);
    public final rce a;
    public final rce b;
    public final rce c;
    public final String[] d;

    public a60(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        ite.h(bArr);
        rce o = rce.o(bArr.length, bArr);
        ite.h(bArr2);
        rce o2 = rce.o(bArr2.length, bArr2);
        ite.h(bArr3);
        rce o3 = rce.o(bArr3.length, bArr3);
        this.a = o;
        this.b = o2;
        this.c = o3;
        ite.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a60.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a60) {
            a60 a60Var = (a60) obj;
            if (fse.a(this.a, a60Var.a) && fse.a(this.b, a60Var.b) && fse.a(this.c, a60Var.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    public final String toString() {
        wm9 wm9Var = new wm9(getClass().getSimpleName(), (byte) 25);
        w8e w8eVar = n9e.d;
        byte[] p = this.a.p();
        wm9Var.B(w8eVar.c(p.length, p), "keyHandle");
        byte[] p2 = this.b.p();
        wm9Var.B(w8eVar.c(p2.length, p2), "clientDataJSON");
        byte[] p3 = this.c.p();
        wm9Var.B(w8eVar.c(p3.length, p3), "attestationObject");
        wm9Var.B(Arrays.toString(this.d), "transports");
        return wm9Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.c(parcel, 2, this.a.p());
        mve.c(parcel, 3, this.b.p());
        mve.c(parcel, 4, this.c.p());
        mve.m(parcel, 5, this.d);
        mve.s(parcel, r);
    }
}
