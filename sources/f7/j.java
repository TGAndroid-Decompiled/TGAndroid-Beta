package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import org.telegram.ui.ky0;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new t0(5);
    public final q7.s0 f11391a;
    public final q7.s0 f11392b;
    public final q7.s0 f11393c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        q6.m.g(bArr);
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.g(bArr2);
        q7.s0 o10 = q7.s0.o(bArr2.length, bArr2);
        q6.m.g(bArr3);
        q7.s0 o11 = q7.s0.o(bArr3.length, bArr3);
        this.f11391a = o4;
        this.f11392b = o10;
        this.f11393c = o11;
        q6.m.g(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: f7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (q6.m.k(this.f11391a, jVar.f11391a) && q6.m.k(this.f11392b, jVar.f11392b) && q6.m.k(this.f11393c, jVar.f11393c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f11391a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11392b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11393c}))});
    }

    public final String toString() {
        ky0 ky0Var = new ky0(getClass().getSimpleName(), 9);
        q7.k0 k0Var = q7.m0.d;
        byte[] p10 = this.f11391a.p();
        ky0Var.N(k0Var.c(p10.length, p10), "keyHandle");
        byte[] p11 = this.f11392b.p();
        ky0Var.N(k0Var.c(p11.length, p11), "clientDataJSON");
        byte[] p12 = this.f11393c.p();
        ky0Var.N(k0Var.c(p12.length, p12), "attestationObject");
        ky0Var.N(Arrays.toString(this.d), "transports");
        return ky0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.c(parcel, 2, this.f11391a.p());
        xb.c(parcel, 3, this.f11392b.p());
        xb.c(parcel, 4, this.f11393c.p());
        xb.m(parcel, 5, this.d);
        xb.s(parcel, r10);
    }
}
