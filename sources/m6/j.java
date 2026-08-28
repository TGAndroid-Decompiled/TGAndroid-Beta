package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(16);
    public final x6.s0 f17533a;
    public final x6.s0 f17534b;
    public final x6.s0 f17535c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        x5.l.h(bArr);
        x6.s0 t10 = x6.s0.t(bArr.length, bArr);
        x5.l.h(bArr2);
        x6.s0 t11 = x6.s0.t(bArr2.length, bArr2);
        x5.l.h(bArr3);
        x6.s0 t12 = x6.s0.t(bArr3.length, bArr3);
        this.f17533a = t10;
        this.f17534b = t11;
        this.f17535c = t12;
        x5.l.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: m6.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (x5.l.l(this.f17533a, jVar.f17533a) && x5.l.l(this.f17534b, jVar.f17534b) && x5.l.l(this.f17535c, jVar.f17535c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f17533a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f17534b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f17535c}))});
    }

    public final String toString() {
        t5.c cVar = new t5.c(getClass().getSimpleName(), 12);
        x6.k0 k0Var = x6.m0.d;
        byte[] u10 = this.f17533a.u();
        cVar.j(k0Var.c(u10.length, u10), "keyHandle");
        byte[] u11 = this.f17534b.u();
        cVar.j(k0Var.c(u11.length, u11), "clientDataJSON");
        byte[] u12 = this.f17535c.u();
        cVar.j(k0Var.c(u12.length, u12), "attestationObject");
        cVar.j(Arrays.toString(this.d), "transports");
        return cVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.c(parcel, 2, this.f17533a.u());
        p8.c(parcel, 3, this.f17534b.u());
        p8.c(parcel, 4, this.f17535c.u());
        p8.m(parcel, 5, this.d);
        p8.r(parcel, q10);
    }
}
