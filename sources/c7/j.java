package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(16);
    public final n7.t0 f4108a;
    public final n7.t0 f4109b;
    public final n7.t0 f4110c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        n6.l.h(bArr);
        n7.t0 t10 = n7.t0.t(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.t0 t11 = n7.t0.t(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.t0 t12 = n7.t0.t(bArr3.length, bArr3);
        this.f4108a = t10;
        this.f4109b = t11;
        this.f4110c = t12;
        n6.l.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: c7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (n6.l.l(this.f4108a, jVar.f4108a) && n6.l.l(this.f4109b, jVar.f4109b) && n6.l.l(this.f4110c, jVar.f4110c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f4108a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4109b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4110c}))});
    }

    public final String toString() {
        lf.i iVar = new lf.i(getClass().getSimpleName());
        n7.l0 l0Var = n7.n0.d;
        byte[] u10 = this.f4108a.u();
        iVar.Z(l0Var.c(u10.length, u10), "keyHandle");
        byte[] u11 = this.f4109b.u();
        iVar.Z(l0Var.c(u11.length, u11), "clientDataJSON");
        byte[] u12 = this.f4110c.u();
        iVar.Z(l0Var.c(u12.length, u12), "attestationObject");
        iVar.Z(Arrays.toString(this.d), "transports");
        return iVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.c(parcel, 2, this.f4108a.u());
        w7.e0.c(parcel, 3, this.f4109b.u());
        w7.e0.c(parcel, 4, this.f4110c.u());
        w7.e0.m(parcel, 5, this.d);
        w7.e0.r(parcel, q6);
    }
}
