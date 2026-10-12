package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(16);
    public final n7.s0 f4593a;
    public final n7.s0 f4594b;
    public final n7.s0 f4595c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        n6.l.h(bArr);
        n7.s0 s10 = n7.s0.s(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.s0 s11 = n7.s0.s(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.s0 s12 = n7.s0.s(bArr3.length, bArr3);
        this.f4593a = s10;
        this.f4594b = s11;
        this.f4595c = s12;
        n6.l.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: c7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (n6.l.l(this.f4593a, jVar.f4593a) && n6.l.l(this.f4594b, jVar.f4594b) && n6.l.l(this.f4595c, jVar.f4595c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f4593a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4594b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4595c}))});
    }

    public final String toString() {
        li.k kVar = new li.k(getClass().getSimpleName());
        n7.k0 k0Var = n7.m0.d;
        byte[] t10 = this.f4593a.t();
        kVar.Y(k0Var.c(t10.length, t10), "keyHandle");
        byte[] t11 = this.f4594b.t();
        kVar.Y(k0Var.c(t11.length, t11), "clientDataJSON");
        byte[] t12 = this.f4595c.t();
        kVar.Y(k0Var.c(t12.length, t12), "attestationObject");
        kVar.Y(Arrays.toString(this.d), "transports");
        return kVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.c(parcel, 2, this.f4593a.t());
        w7.g0.c(parcel, 3, this.f4594b.t());
        w7.g0.c(parcel, 4, this.f4595c.t());
        w7.g0.m(parcel, 5, this.d);
        w7.g0.r(parcel, q6);
    }
}
