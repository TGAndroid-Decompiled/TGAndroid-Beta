package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class c50 extends e50 {
    public static final Parcelable.Creator<c50> CREATOR = new ime((byte) 18);
    public final gfe a;
    public final gfe b;
    public final gfe c;
    public final String[] d;

    public c50(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        xve.h(bArr);
        gfe o = gfe.o(bArr.length, bArr);
        xve.h(bArr2);
        gfe o2 = gfe.o(bArr2.length, bArr2);
        xve.h(bArr3);
        gfe o3 = gfe.o(bArr3.length, bArr3);
        this.a = o;
        this.b = o2;
        this.c = o3;
        xve.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c50.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c50) {
            c50 c50Var = (c50) obj;
            if (vue.a(this.a, c50Var.a) && vue.a(this.b, c50Var.b) && vue.a(this.c, c50Var.c)) {
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
        ko9 ko9Var = new ko9(getClass().getSimpleName(), (byte) 25);
        lbe lbeVar = cce.d;
        byte[] p = this.a.p();
        ko9Var.B(lbeVar.c(p.length, p), "keyHandle");
        byte[] p2 = this.b.p();
        ko9Var.B(lbeVar.c(p2.length, p2), "clientDataJSON");
        byte[] p3 = this.c.p();
        ko9Var.B(lbeVar.c(p3.length, p3), "attestationObject");
        ko9Var.B(Arrays.toString(this.d), "transports");
        return ko9Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.c(parcel, 2, this.a.p());
        bye.c(parcel, 3, this.b.p());
        bye.c(parcel, 4, this.c.p());
        bye.m(parcel, 5, this.d);
        bye.s(parcel, r);
    }
}
