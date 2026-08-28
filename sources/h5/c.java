package h5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import j$.util.Objects;
import java.util.Arrays;
import x5.l;
public final class c extends y5.a {
    public static final Parcelable.Creator<c> CREATOR = new h(4);
    public final boolean f9839a;
    public final byte[] f9840b;
    public final String f9841c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f9839a = z10;
        this.f9840b = bArr;
        this.f9841c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f9839a == cVar.f9839a && Arrays.equals(this.f9840b, cVar.f9840b) && Objects.equals(this.f9841c, cVar.f9841c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9840b) + (Objects.hash(Boolean.valueOf(this.f9839a), this.f9841c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f9839a ? 1 : 0);
        p8.c(parcel, 2, this.f9840b);
        p8.l(parcel, 3, this.f9841c);
        p8.r(parcel, q10);
    }
}
