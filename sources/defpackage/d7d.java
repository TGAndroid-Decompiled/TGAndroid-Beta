package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class d7d extends b4 {
    public static final Parcelable.Creator<d7d> CREATOR = new t4d((byte) 19);
    public final qae a;
    public final qae b;
    public final qae c;
    public final int d;

    public d7d(qae qaeVar, qae qaeVar2, qae qaeVar3, int i) {
        this.a = qaeVar;
        this.b = qaeVar2;
        this.c = qaeVar3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d7d) {
            d7d d7dVar = (d7d) obj;
            if (cqe.a(this.a, d7dVar.a) && cqe.a(this.b, d7dVar.b) && cqe.a(this.c, d7dVar.c) && this.d == d7dVar.d) {
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
        qae qaeVar = this.a;
        if (qaeVar == null) {
            p = null;
        } else {
            p = qaeVar.p();
        }
        String b = und.b(p);
        qae qaeVar2 = this.b;
        if (qaeVar2 == null) {
            p2 = null;
        } else {
            p2 = qaeVar2.p();
        }
        String b2 = und.b(p2);
        qae qaeVar3 = this.c;
        if (qaeVar3 != null) {
            bArr = qaeVar3.p();
        }
        String b3 = und.b(bArr);
        StringBuilder l = yjb.l("HmacSecretExtension{coseKeyAgreement=", b, ", saltEnc=", b2, ", saltAuth=");
        l.append(b3);
        l.append(", getPinUvAuthProtocol=");
        return de9.l(l, this.d, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] p;
        byte[] p2;
        int r = jte.r(parcel, 20293);
        byte[] bArr = null;
        qae qaeVar = this.a;
        if (qaeVar == null) {
            p = null;
        } else {
            p = qaeVar.p();
        }
        jte.c(parcel, 1, p);
        qae qaeVar2 = this.b;
        if (qaeVar2 == null) {
            p2 = null;
        } else {
            p2 = qaeVar2.p();
        }
        jte.c(parcel, 2, p2);
        qae qaeVar3 = this.c;
        if (qaeVar3 != null) {
            bArr = qaeVar3.p();
        }
        jte.c(parcel, 3, bArr);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        jte.s(parcel, r);
    }
}
