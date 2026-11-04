package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(20);
    public final p7.t0 f9834a;
    public final p7.t0 f9835b;
    public final p7.t0 f9836c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        p6.m.g(bArr);
        p7.t0 o10 = p7.t0.o(bArr.length, bArr);
        p6.m.g(bArr2);
        p7.t0 o11 = p7.t0.o(bArr2.length, bArr2);
        p6.m.g(bArr3);
        p7.t0 o12 = p7.t0.o(bArr3.length, bArr3);
        this.f9834a = o10;
        this.f9835b = o11;
        this.f9836c = o12;
        p6.m.g(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: e7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (p6.m.k(this.f9834a, jVar.f9834a) && p6.m.k(this.f9835b, jVar.f9835b) && p6.m.k(this.f9836c, jVar.f9836c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f9834a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f9835b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f9836c}))});
    }

    public final String toString() {
        p7.d dVar = new p7.d(getClass().getSimpleName(), 1);
        p7.l0 l0Var = p7.n0.d;
        byte[] p10 = this.f9834a.p();
        dVar.I(l0Var.c(p10.length, p10), "keyHandle");
        byte[] p11 = this.f9835b.p();
        dVar.I(l0Var.c(p11.length, p11), "clientDataJSON");
        byte[] p12 = this.f9836c.p();
        dVar.I(l0Var.c(p12.length, p12), "attestationObject");
        dVar.I(Arrays.toString(this.d), "transports");
        return dVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.d(parcel, 2, this.f9834a.p());
        j8.a.d(parcel, 3, this.f9835b.p());
        j8.a.d(parcel, 4, this.f9836c.p());
        j8.a.n(parcel, 5, this.d);
        j8.a.t(parcel, s6);
    }
}
