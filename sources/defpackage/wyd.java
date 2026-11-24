package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class wyd extends b4 {
    public static final Parcelable.Creator<wyd> CREATOR = new qyd((byte) 12);
    public final qae a;
    public final qae b;

    public wyd(qae qaeVar, qae qaeVar2) {
        this.a = qaeVar;
        this.b = qaeVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wyd) {
            wyd wydVar = (wyd) obj;
            if (cqe.a(this.a, wydVar.a) && cqe.a(this.b, wydVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] p;
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
        if (qaeVar2 != null) {
            bArr = qaeVar2.p();
        }
        jte.c(parcel, 2, bArr);
        jte.s(parcel, r);
    }
}
