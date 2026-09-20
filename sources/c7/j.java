package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(16);
    public final n7.s0 f4109a;
    public final n7.s0 f4110b;
    public final n7.s0 f4111c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        n6.l.h(bArr);
        n7.s0 t10 = n7.s0.t(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.s0 t11 = n7.s0.t(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.s0 t12 = n7.s0.t(bArr3.length, bArr3);
        this.f4109a = t10;
        this.f4110b = t11;
        this.f4111c = t12;
        n6.l.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: c7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (n6.l.l(this.f4109a, jVar.f4109a) && n6.l.l(this.f4110b, jVar.f4110b) && n6.l.l(this.f4111c, jVar.f4111c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f4109a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4110b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4111c}))});
    }

    public final String toString() {
        lf.h hVar = new lf.h(getClass().getSimpleName());
        n7.k0 k0Var = n7.m0.d;
        byte[] u10 = this.f4109a.u();
        hVar.Z(k0Var.c(u10.length, u10), "keyHandle");
        byte[] u11 = this.f4110b.u();
        hVar.Z(k0Var.c(u11.length, u11), "clientDataJSON");
        byte[] u12 = this.f4111c.u();
        hVar.Z(k0Var.c(u12.length, u12), "attestationObject");
        hVar.Z(Arrays.toString(this.d), "transports");
        return hVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.c(parcel, 2, this.f4109a.u());
        w7.f0.c(parcel, 3, this.f4110b.u());
        w7.f0.c(parcel, 4, this.f4111c.u());
        w7.f0.m(parcel, 5, this.d);
        w7.f0.r(parcel, q6);
    }
}
