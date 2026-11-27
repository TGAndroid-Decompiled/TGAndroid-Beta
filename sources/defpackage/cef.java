package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class cef extends c4 {
    public static final Parcelable.Creator<cef> CREATOR = new t4f((byte) 19);
    public final long a;
    public final gfe b;
    public final gfe c;
    public final gfe d;

    public cef(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        xve.h(bArr);
        gfe o = gfe.o(bArr.length, bArr);
        xve.h(bArr2);
        gfe o2 = gfe.o(bArr2.length, bArr2);
        xve.h(bArr3);
        gfe o3 = gfe.o(bArr3.length, bArr3);
        this.a = j;
        this.b = o;
        this.c = o2;
        this.d = o3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cef) {
            cef cefVar = (cef) obj;
            if (this.a == cefVar.a && vue.a(this.b, cefVar.b) && vue.a(this.c, cefVar.c) && vue.a(this.d, cefVar.d)) {
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
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 8);
        parcel.writeLong(this.a);
        bye.c(parcel, 2, this.b.p());
        bye.c(parcel, 3, this.c.p());
        bye.c(parcel, 4, this.d.p());
        bye.s(parcel, r);
    }
}
