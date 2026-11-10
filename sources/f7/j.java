package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import org.telegram.ui.ly0;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new t0(5);
    public final q7.s0 f11396a;
    public final q7.s0 f11397b;
    public final q7.s0 f11398c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        q6.m.g(bArr);
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.g(bArr2);
        q7.s0 o10 = q7.s0.o(bArr2.length, bArr2);
        q6.m.g(bArr3);
        q7.s0 o11 = q7.s0.o(bArr3.length, bArr3);
        this.f11396a = o4;
        this.f11397b = o10;
        this.f11398c = o11;
        q6.m.g(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: f7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (q6.m.k(this.f11396a, jVar.f11396a) && q6.m.k(this.f11397b, jVar.f11397b) && q6.m.k(this.f11398c, jVar.f11398c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f11396a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11397b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11398c}))});
    }

    public final String toString() {
        ly0 ly0Var = new ly0(getClass().getSimpleName(), 9);
        q7.k0 k0Var = q7.m0.d;
        byte[] p10 = this.f11396a.p();
        ly0Var.N(k0Var.c(p10.length, p10), "keyHandle");
        byte[] p11 = this.f11397b.p();
        ly0Var.N(k0Var.c(p11.length, p11), "clientDataJSON");
        byte[] p12 = this.f11398c.p();
        ly0Var.N(k0Var.c(p12.length, p12), "attestationObject");
        ly0Var.N(Arrays.toString(this.d), "transports");
        return ly0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.c(parcel, 2, this.f11396a.p());
        xb.c(parcel, 3, this.f11397b.p());
        xb.c(parcel, 4, this.f11398c.p());
        xb.m(parcel, 5, this.d);
        xb.s(parcel, r10);
    }
}
