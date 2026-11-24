package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class l9f extends b4 {
    public static final Parcelable.Creator<l9f> CREATOR = new c0f((byte) 19);
    public final long a;
    public final qae b;
    public final qae c;
    public final qae d;

    public l9f(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        fre.h(bArr);
        qae o = qae.o(bArr.length, bArr);
        fre.h(bArr2);
        qae o2 = qae.o(bArr2.length, bArr2);
        fre.h(bArr3);
        qae o3 = qae.o(bArr3.length, bArr3);
        this.a = j;
        this.b = o;
        this.c = o2;
        this.d = o3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l9f) {
            l9f l9fVar = (l9f) obj;
            if (this.a == l9fVar.a && cqe.a(this.b, l9fVar.b) && cqe.a(this.c, l9fVar.c) && cqe.a(this.d, l9fVar.d)) {
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
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 8);
        parcel.writeLong(this.a);
        jte.c(parcel, 2, this.b.p());
        jte.c(parcel, 3, this.c.p());
        jte.c(parcel, 4, this.d.p());
        jte.s(parcel, r);
    }
}
