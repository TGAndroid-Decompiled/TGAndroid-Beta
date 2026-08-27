package h5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import j$.util.Objects;
import java.util.Arrays;
import y5.l;

public final class c extends z5.a {
    public static final Parcelable.Creator<c> CREATOR = new h(3);

    public final boolean f8269a;

    public final byte[] f8270b;

    public final String f8271c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f8269a = z10;
        this.f8270b = bArr;
        this.f8271c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8269a == cVar.f8269a && Arrays.equals(this.f8270b, cVar.f8270b) && Objects.equals(this.f8271c, cVar.f8271c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8270b) + (Objects.hash(Boolean.valueOf(this.f8269a), this.f8271c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f8269a ? 1 : 0);
        r8.c(parcel, 2, this.f8270b);
        r8.l(parcel, 3, this.f8271c);
        r8.r(parcel, iQ);
    }
}
