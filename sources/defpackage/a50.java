package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class a50 extends c50 {
    public static final Parcelable.Creator<a50> CREATOR = new rhe((byte) 18);
    public final qae a;
    public final qae b;
    public final qae c;
    public final String[] d;

    public a50(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        fre.h(bArr);
        qae o = qae.o(bArr.length, bArr);
        fre.h(bArr2);
        qae o2 = qae.o(bArr2.length, bArr2);
        fre.h(bArr3);
        qae o3 = qae.o(bArr3.length, bArr3);
        this.a = o;
        this.b = o2;
        this.c = o3;
        fre.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a50.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a50) {
            a50 a50Var = (a50) obj;
            if (cqe.a(this.a, a50Var.a) && cqe.a(this.b, a50Var.b) && cqe.a(this.c, a50Var.c)) {
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
        vk9 vk9Var = new vk9(getClass().getSimpleName(), (byte) 25);
        v6e v6eVar = m7e.d;
        byte[] p = this.a.p();
        vk9Var.B(v6eVar.c(p.length, p), "keyHandle");
        byte[] p2 = this.b.p();
        vk9Var.B(v6eVar.c(p2.length, p2), "clientDataJSON");
        byte[] p3 = this.c.p();
        vk9Var.B(v6eVar.c(p3.length, p3), "attestationObject");
        vk9Var.B(Arrays.toString(this.d), "transports");
        return vk9Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.c(parcel, 2, this.a.p());
        jte.c(parcel, 3, this.b.p());
        jte.c(parcel, 4, this.c.p());
        jte.m(parcel, 5, this.d);
        jte.s(parcel, r);
    }
}
