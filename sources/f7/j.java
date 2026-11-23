package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import org.telegram.ui.md0;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new t0(5);
    public final q7.s0 f11554a;
    public final q7.s0 f11555b;
    public final q7.s0 f11556c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        q6.m.h(bArr);
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.h(bArr2);
        q7.s0 o10 = q7.s0.o(bArr2.length, bArr2);
        q6.m.h(bArr3);
        q7.s0 o11 = q7.s0.o(bArr3.length, bArr3);
        this.f11554a = o4;
        this.f11555b = o10;
        this.f11556c = o11;
        q6.m.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: f7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (q6.m.l(this.f11554a, jVar.f11554a) && q6.m.l(this.f11555b, jVar.f11555b) && q6.m.l(this.f11556c, jVar.f11556c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f11554a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11555b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11556c}))});
    }

    public final String toString() {
        md0 md0Var = new md0(getClass().getSimpleName(), 10);
        q7.k0 k0Var = q7.m0.d;
        byte[] p10 = this.f11554a.p();
        md0Var.L(k0Var.c(p10.length, p10), "keyHandle");
        byte[] p11 = this.f11555b.p();
        md0Var.L(k0Var.c(p11.length, p11), "clientDataJSON");
        byte[] p12 = this.f11556c.p();
        md0Var.L(k0Var.c(p12.length, p12), "attestationObject");
        md0Var.L(Arrays.toString(this.d), "transports");
        return md0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.c(parcel, 2, this.f11554a.p());
        bc.c(parcel, 3, this.f11555b.p());
        bc.c(parcel, 4, this.f11556c.p());
        bc.m(parcel, 5, this.d);
        bc.s(parcel, r10);
    }
}
