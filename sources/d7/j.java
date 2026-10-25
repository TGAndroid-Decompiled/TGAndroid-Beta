package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(17);
    public final o7.s0 f8192a;
    public final o7.s0 f8193b;
    public final o7.s0 f8194c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        o6.l.h(bArr);
        o7.s0 s10 = o7.s0.s(bArr.length, bArr);
        o6.l.h(bArr2);
        o7.s0 s11 = o7.s0.s(bArr2.length, bArr2);
        o6.l.h(bArr3);
        o7.s0 s12 = o7.s0.s(bArr3.length, bArr3);
        this.f8192a = s10;
        this.f8193b = s11;
        this.f8194c = s12;
        o6.l.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: d7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (o6.l.l(this.f8192a, jVar.f8192a) && o6.l.l(this.f8193b, jVar.f8193b) && o6.l.l(this.f8194c, jVar.f8194c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f8192a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f8193b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f8194c}))});
    }

    public final String toString() {
        k6.c cVar = new k6.c(getClass().getSimpleName());
        o7.k0 k0Var = o7.m0.d;
        byte[] t10 = this.f8192a.t();
        cVar.K(k0Var.c(t10.length, t10), "keyHandle");
        byte[] t11 = this.f8193b.t();
        cVar.K(k0Var.c(t11.length, t11), "clientDataJSON");
        byte[] t12 = this.f8194c.t();
        cVar.K(k0Var.c(t12.length, t12), "attestationObject");
        cVar.K(Arrays.toString(this.d), "transports");
        return cVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.c(parcel, 2, this.f8192a.t());
        df.c(parcel, 3, this.f8193b.t());
        df.c(parcel, 4, this.f8194c.t());
        df.m(parcel, 5, this.d);
        df.r(parcel, q5);
    }
}
