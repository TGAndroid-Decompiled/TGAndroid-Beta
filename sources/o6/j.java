package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new n0(28);
    public final z6.s0 f19393a;
    public final z6.s0 f19394b;
    public final z6.s0 f19395c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        z5.l.h(bArr);
        z6.s0 t10 = z6.s0.t(bArr.length, bArr);
        z5.l.h(bArr2);
        z6.s0 t11 = z6.s0.t(bArr2.length, bArr2);
        z5.l.h(bArr3);
        z6.s0 t12 = z6.s0.t(bArr3.length, bArr3);
        this.f19393a = t10;
        this.f19394b = t11;
        this.f19395c = t12;
        z5.l.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: o6.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (z5.l.l(this.f19393a, jVar.f19393a) && z5.l.l(this.f19394b, jVar.f19394b) && z5.l.l(this.f19395c, jVar.f19395c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f19393a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f19394b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f19395c}))});
    }

    public final String toString() {
        v5.c cVar = new v5.c(getClass().getSimpleName(), 11);
        z6.k0 k0Var = z6.m0.d;
        byte[] u10 = this.f19393a.u();
        cVar.j(k0Var.c(u10.length, u10), "keyHandle");
        byte[] u11 = this.f19394b.u();
        cVar.j(k0Var.c(u11.length, u11), "clientDataJSON");
        byte[] u12 = this.f19395c.u();
        cVar.j(k0Var.c(u12.length, u12), "attestationObject");
        cVar.j(Arrays.toString(this.d), "transports");
        return cVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.c(parcel, 2, this.f19393a.u());
        com.google.android.gms.internal.cast.o.c(parcel, 3, this.f19394b.u());
        com.google.android.gms.internal.cast.o.c(parcel, 4, this.f19395c.u());
        com.google.android.gms.internal.cast.o.m(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
