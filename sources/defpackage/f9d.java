package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class f9d extends b4 {
    public static final Parcelable.Creator<f9d> CREATOR = new v6d((byte) 19);
    public final rce a;
    public final rce b;
    public final rce c;
    public final int d;

    public f9d(rce rceVar, rce rceVar2, rce rceVar3, int i) {
        this.a = rceVar;
        this.b = rceVar2;
        this.c = rceVar3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f9d) {
            f9d f9dVar = (f9d) obj;
            if (fse.a(this.a, f9dVar.a) && fse.a(this.b, f9dVar.b) && fse.a(this.c, f9dVar.c) && this.d == f9dVar.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        byte[] p;
        byte[] p2;
        byte[] bArr = null;
        rce rceVar = this.a;
        if (rceVar == null) {
            p = null;
        } else {
            p = rceVar.p();
        }
        String b = xpd.b(p);
        rce rceVar2 = this.b;
        if (rceVar2 == null) {
            p2 = null;
        } else {
            p2 = rceVar2.p();
        }
        String b2 = xpd.b(p2);
        rce rceVar3 = this.c;
        if (rceVar3 != null) {
            bArr = rceVar3.p();
        }
        String b3 = xpd.b(bArr);
        StringBuilder m = mlb.m("HmacSecretExtension{coseKeyAgreement=", b, ", saltEnc=", b2, ", saltAuth=");
        m.append(b3);
        m.append(", getPinUvAuthProtocol=");
        return hg9.k(m, this.d, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] p;
        byte[] p2;
        int r = mve.r(parcel, 20293);
        byte[] bArr = null;
        rce rceVar = this.a;
        if (rceVar == null) {
            p = null;
        } else {
            p = rceVar.p();
        }
        mve.c(parcel, 1, p);
        rce rceVar2 = this.b;
        if (rceVar2 == null) {
            p2 = null;
        } else {
            p2 = rceVar2.p();
        }
        mve.c(parcel, 2, p2);
        rce rceVar3 = this.c;
        if (rceVar3 != null) {
            bArr = rceVar3.p();
        }
        mve.c(parcel, 3, bArr);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        mve.s(parcel, r);
    }
}
