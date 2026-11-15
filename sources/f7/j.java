package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
import org.telegram.ui.ld0;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new t0(5);
    public final q7.s0 f11205a;
    public final q7.s0 f11206b;
    public final q7.s0 f11207c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        q6.m.g(bArr);
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.g(bArr2);
        q7.s0 o10 = q7.s0.o(bArr2.length, bArr2);
        q6.m.g(bArr3);
        q7.s0 o11 = q7.s0.o(bArr3.length, bArr3);
        this.f11205a = o4;
        this.f11206b = o10;
        this.f11207c = o11;
        q6.m.g(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: f7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (q6.m.k(this.f11205a, jVar.f11205a) && q6.m.k(this.f11206b, jVar.f11206b) && q6.m.k(this.f11207c, jVar.f11207c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f11205a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11206b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11207c}))});
    }

    public final String toString() {
        ld0 ld0Var = new ld0(getClass().getSimpleName(), 10);
        q7.k0 k0Var = q7.m0.d;
        byte[] p10 = this.f11205a.p();
        ld0Var.L(k0Var.c(p10.length, p10), "keyHandle");
        byte[] p11 = this.f11206b.p();
        ld0Var.L(k0Var.c(p11.length, p11), "clientDataJSON");
        byte[] p12 = this.f11207c.p();
        ld0Var.L(k0Var.c(p12.length, p12), "attestationObject");
        ld0Var.L(Arrays.toString(this.d), "transports");
        return ld0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.c(parcel, 2, this.f11205a.p());
        yb.c(parcel, 3, this.f11206b.p());
        yb.c(parcel, 4, this.f11207c.p());
        yb.m(parcel, 5, this.d);
        yb.s(parcel, r10);
    }
}
