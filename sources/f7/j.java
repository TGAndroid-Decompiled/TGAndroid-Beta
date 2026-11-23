package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import org.telegram.ui.Components.i61;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new t0(5);
    public final q7.s0 f11516a;
    public final q7.s0 f11517b;
    public final q7.s0 f11518c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        q6.m.h(bArr);
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.h(bArr2);
        q7.s0 o10 = q7.s0.o(bArr2.length, bArr2);
        q6.m.h(bArr3);
        q7.s0 o11 = q7.s0.o(bArr3.length, bArr3);
        this.f11516a = o4;
        this.f11517b = o10;
        this.f11518c = o11;
        q6.m.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: f7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (q6.m.l(this.f11516a, jVar.f11516a) && q6.m.l(this.f11517b, jVar.f11517b) && q6.m.l(this.f11518c, jVar.f11518c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f11516a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11517b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11518c}))});
    }

    public final String toString() {
        i61 i61Var = new i61(getClass().getSimpleName());
        q7.k0 k0Var = q7.m0.d;
        byte[] p10 = this.f11516a.p();
        i61Var.R(k0Var.c(p10.length, p10), "keyHandle");
        byte[] p11 = this.f11517b.p();
        i61Var.R(k0Var.c(p11.length, p11), "clientDataJSON");
        byte[] p12 = this.f11518c.p();
        i61Var.R(k0Var.c(p12.length, p12), "attestationObject");
        i61Var.R(Arrays.toString(this.d), "transports");
        return i61Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.c(parcel, 2, this.f11516a.p());
        cc.c(parcel, 3, this.f11517b.p());
        cc.c(parcel, 4, this.f11518c.p());
        cc.m(parcel, 5, this.d);
        cc.s(parcel, r10);
    }
}
