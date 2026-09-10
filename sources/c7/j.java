package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m.e3;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(16);
    public final n7.t0 f4522a;
    public final n7.t0 f4523b;
    public final n7.t0 f4524c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        n6.l.h(bArr);
        n7.t0 t10 = n7.t0.t(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.t0 t11 = n7.t0.t(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.t0 t12 = n7.t0.t(bArr3.length, bArr3);
        this.f4522a = t10;
        this.f4523b = t11;
        this.f4524c = t12;
        n6.l.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: c7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (n6.l.l(this.f4522a, jVar.f4522a) && n6.l.l(this.f4523b, jVar.f4523b) && n6.l.l(this.f4524c, jVar.f4524c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f4522a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4523b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4524c}))});
    }

    public final String toString() {
        e3 e3Var = new e3(getClass().getSimpleName(), 7);
        n7.l0 l0Var = n7.n0.d;
        byte[] u10 = this.f4522a.u();
        e3Var.Y(l0Var.c(u10.length, u10), "keyHandle");
        byte[] u11 = this.f4523b.u();
        e3Var.Y(l0Var.c(u11.length, u11), "clientDataJSON");
        byte[] u12 = this.f4524c.u();
        e3Var.Y(l0Var.c(u12.length, u12), "attestationObject");
        e3Var.Y(Arrays.toString(this.d), "transports");
        return e3Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.c(parcel, 2, this.f4522a.u());
        w7.e0.c(parcel, 3, this.f4523b.u());
        w7.e0.c(parcel, 4, this.f4524c.u());
        w7.e0.m(parcel, 5, this.d);
        w7.e0.r(parcel, q6);
    }
}
