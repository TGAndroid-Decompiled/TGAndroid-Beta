package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m.h3;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(16);
    public final n7.t0 f4596a;
    public final n7.t0 f4597b;
    public final n7.t0 f4598c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        n6.l.h(bArr);
        n7.t0 s10 = n7.t0.s(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.t0 s11 = n7.t0.s(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.t0 s12 = n7.t0.s(bArr3.length, bArr3);
        this.f4596a = s10;
        this.f4597b = s11;
        this.f4598c = s12;
        n6.l.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: c7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (n6.l.l(this.f4596a, jVar.f4596a) && n6.l.l(this.f4597b, jVar.f4597b) && n6.l.l(this.f4598c, jVar.f4598c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f4596a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4597b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4598c}))});
    }

    public final String toString() {
        h3 h3Var = new h3(getClass().getSimpleName());
        n7.l0 l0Var = n7.n0.d;
        byte[] t10 = this.f4596a.t();
        h3Var.Y(l0Var.c(t10.length, t10), "keyHandle");
        byte[] t11 = this.f4597b.t();
        h3Var.Y(l0Var.c(t11.length, t11), "clientDataJSON");
        byte[] t12 = this.f4598c.t();
        h3Var.Y(l0Var.c(t12.length, t12), "attestationObject");
        h3Var.Y(Arrays.toString(this.d), "transports");
        return h3Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.c(parcel, 2, this.f4596a.t());
        w7.f0.c(parcel, 3, this.f4597b.t());
        w7.f0.c(parcel, 4, this.f4598c.t());
        w7.f0.m(parcel, 5, this.d);
        w7.f0.r(parcel, q6);
    }
}
