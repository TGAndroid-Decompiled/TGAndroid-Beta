package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import org.telegram.ui.nd0;
public final class j extends l {
    public static final Parcelable.Creator<j> CREATOR = new t0(5);
    public final q7.s0 f11522a;
    public final q7.s0 f11523b;
    public final q7.s0 f11524c;
    public final String[] d;

    public j(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        q6.m.h(bArr);
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.h(bArr2);
        q7.s0 o10 = q7.s0.o(bArr2.length, bArr2);
        q6.m.h(bArr3);
        q7.s0 o11 = q7.s0.o(bArr3.length, bArr3);
        this.f11522a = o4;
        this.f11523b = o10;
        this.f11524c = o11;
        q6.m.h(strArr);
        this.d = strArr;
    }

    public final org.json.JSONObject b() {
        throw new UnsupportedOperationException("Method not decompiled: f7.j.b():org.json.JSONObject");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (q6.m.l(this.f11522a, jVar.f11522a) && q6.m.l(this.f11523b, jVar.f11523b) && q6.m.l(this.f11524c, jVar.f11524c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f11522a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11523b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f11524c}))});
    }

    public final String toString() {
        nd0 nd0Var = new nd0(getClass().getSimpleName(), 10);
        q7.k0 k0Var = q7.m0.d;
        byte[] p10 = this.f11522a.p();
        nd0Var.L(k0Var.c(p10.length, p10), "keyHandle");
        byte[] p11 = this.f11523b.p();
        nd0Var.L(k0Var.c(p11.length, p11), "clientDataJSON");
        byte[] p12 = this.f11524c.p();
        nd0Var.L(k0Var.c(p12.length, p12), "attestationObject");
        nd0Var.L(Arrays.toString(this.d), "transports");
        return nd0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.c(parcel, 2, this.f11522a.p());
        bc.c(parcel, 3, this.f11523b.p());
        bc.c(parcel, 4, this.f11524c.p());
        bc.m(parcel, 5, this.d);
        bc.s(parcel, r10);
    }
}
