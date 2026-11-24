package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class nbf extends b4 {
    public static final Parcelable.Creator<nbf> CREATOR = new e2f((byte) 19);
    public final long a;
    public final rce b;
    public final rce c;
    public final rce d;

    public nbf(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        ite.h(bArr);
        rce o = rce.o(bArr.length, bArr);
        ite.h(bArr2);
        rce o2 = rce.o(bArr2.length, bArr2);
        ite.h(bArr3);
        rce o3 = rce.o(bArr3.length, bArr3);
        this.a = j;
        this.b = o;
        this.c = o2;
        this.d = o3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nbf) {
            nbf nbfVar = (nbf) obj;
            if (this.a == nbfVar.a && fse.a(this.b, nbfVar.b) && fse.a(this.c, nbfVar.c) && fse.a(this.d, nbfVar.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 8);
        parcel.writeLong(this.a);
        mve.c(parcel, 2, this.b.p());
        mve.c(parcel, 3, this.c.p());
        mve.c(parcel, 4, this.d.p());
        mve.s(parcel, r);
    }
}
