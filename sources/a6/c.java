package a6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import j$.util.Objects;
import java.util.Arrays;
import q6.m;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new w.a(5);
    public final boolean f281a;
    public final byte[] f282b;
    public final String f283c;

    public c(boolean z9, byte[] bArr, String str) {
        if (z9) {
            m.g(bArr);
            m.g(str);
        }
        this.f281a = z9;
        this.f282b = bArr;
        this.f283c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f281a == cVar.f281a && Arrays.equals(this.f282b, cVar.f282b) && Objects.equals(this.f283c, cVar.f283c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f282b) + (Objects.hash(Boolean.valueOf(this.f281a), this.f283c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f281a ? 1 : 0);
        wb.c(parcel, 2, this.f282b);
        wb.l(parcel, 3, this.f283c);
        wb.s(parcel, r10);
    }
}
