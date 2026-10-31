package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(16);
    public final n7.s0 f3997a;
    public final n7.s0 f3998b;
    public final n7.s0 f3999c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        n6.l.g(bArr);
        n7.s0 s10 = n7.s0.s(bArr.length, bArr);
        n6.l.g(bArr2);
        n7.s0 s11 = n7.s0.s(bArr2.length, bArr2);
        n6.l.g(bArr3);
        n7.s0 s12 = n7.s0.s(bArr3.length, bArr3);
        this.f3997a = s10;
        this.f3998b = s11;
        this.f3999c = s12;
        n6.l.g(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: c7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (n6.l.k(this.f3997a, jVar.f3997a) && n6.l.k(this.f3998b, jVar.f3998b) && n6.l.k(this.f3999c, jVar.f3999c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f3997a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f3998b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f3999c}))});
    }

    public final String toString() {
        li.k kVar = new li.k(getClass().getSimpleName());
        n7.k0 k0Var = n7.m0.d;
        byte[] t10 = this.f3997a.t();
        kVar.M(k0Var.c(t10.length, t10), "keyHandle");
        byte[] t11 = this.f3998b.t();
        kVar.M(k0Var.c(t11.length, t11), "clientDataJSON");
        byte[] t12 = this.f3999c.t();
        kVar.M(k0Var.c(t12.length, t12), "attestationObject");
        kVar.M(Arrays.toString(this.d), "transports");
        return kVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.c(parcel, 2, this.f3997a.t());
        w7.h0.c(parcel, 3, this.f3998b.t());
        w7.h0.c(parcel, 4, this.f3999c.t());
        w7.h0.m(parcel, 5, this.d);
        w7.h0.r(parcel, q6);
    }
}
