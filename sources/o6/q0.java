package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.th;
public final class q0 extends a6.a {
    public static final Parcelable.Creator<q0> CREATOR = new n0(4);
    public final z6.s0 f19415a;
    public final z6.s0 f19416b;
    public final z6.s0 f19417c;
    public final int d;

    public q0(z6.s0 s0Var, z6.s0 s0Var2, z6.s0 s0Var3, int i10) {
        this.f19415a = s0Var;
        this.f19416b = s0Var2;
        this.f19417c = s0Var3;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (!z5.l.l(this.f19415a, q0Var.f19415a) || !z5.l.l(this.f19416b, q0Var.f19416b) || !z5.l.l(this.f19417c, q0Var.f19417c) || this.d != q0Var.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19415a, this.f19416b, this.f19417c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] u10;
        byte[] u11;
        byte[] bArr = null;
        z6.s0 s0Var = this.f19415a;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        String c3 = g6.b.c(u10);
        z6.s0 s0Var2 = this.f19416b;
        if (s0Var2 == null) {
            u11 = null;
        } else {
            u11 = s0Var2.u();
        }
        String c6 = g6.b.c(u11);
        z6.s0 s0Var3 = this.f19417c;
        if (s0Var3 != null) {
            bArr = s0Var3.u();
        }
        String c10 = g6.b.c(bArr);
        StringBuilder k9 = th.k("HmacSecretExtension{coseKeyAgreement=", c3, ", saltEnc=", c6, ", saltAuth=");
        k9.append(c10);
        k9.append(", getPinUvAuthProtocol=");
        return a4.w.l(this.d, "}", k9);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        byte[] u10;
        byte[] u11;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        byte[] bArr = null;
        z6.s0 s0Var = this.f19415a;
        if (s0Var == null) {
            u10 = null;
        } else {
            u10 = s0Var.u();
        }
        com.google.android.gms.internal.cast.o.c(parcel, 1, u10);
        z6.s0 s0Var2 = this.f19416b;
        if (s0Var2 == null) {
            u11 = null;
        } else {
            u11 = s0Var2.u();
        }
        com.google.android.gms.internal.cast.o.c(parcel, 2, u11);
        z6.s0 s0Var3 = this.f19417c;
        if (s0Var3 != null) {
            bArr = s0Var3.u();
        }
        com.google.android.gms.internal.cast.o.c(parcel, 3, bArr);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
