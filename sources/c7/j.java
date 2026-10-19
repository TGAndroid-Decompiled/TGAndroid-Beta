package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m.g3;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new r0(16);
    public final n7.s0 f4966a;
    public final n7.s0 f4967b;
    public final n7.s0 f4968c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        n6.l.h(bArr);
        n7.s0 s10 = n7.s0.s(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.s0 s11 = n7.s0.s(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.s0 s12 = n7.s0.s(bArr3.length, bArr3);
        this.f4966a = s10;
        this.f4967b = s11;
        this.f4968c = s12;
        n6.l.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: c7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (n6.l.l(this.f4966a, jVar.f4966a) && n6.l.l(this.f4967b, jVar.f4967b) && n6.l.l(this.f4968c, jVar.f4968c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f4966a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4967b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f4968c}))});
    }

    public final String toString() {
        g3 g3Var = new g3(getClass().getSimpleName());
        n7.k0 k0Var = n7.m0.d;
        byte[] t10 = this.f4966a.t();
        g3Var.Y(k0Var.c(t10.length, t10), "keyHandle");
        byte[] t11 = this.f4967b.t();
        g3Var.Y(k0Var.c(t11.length, t11), "clientDataJSON");
        byte[] t12 = this.f4968c.t();
        g3Var.Y(k0Var.c(t12.length, t12), "attestationObject");
        g3Var.Y(Arrays.toString(this.d), "transports");
        return g3Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.c(parcel, 2, this.f4966a.t());
        w7.f0.c(parcel, 3, this.f4967b.t());
        w7.f0.c(parcel, 4, this.f4968c.t());
        w7.f0.m(parcel, 5, this.d);
        w7.f0.r(parcel, q6);
    }
}
