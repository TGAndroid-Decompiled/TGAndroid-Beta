package j5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import j$.util.Objects;
import java.util.Arrays;
import z5.l;
public final class c extends a6.a {
    public static final Parcelable.Creator<c> CREATOR = new i4.g(16);
    public final boolean f10876a;
    public final byte[] f10877b;
    public final String f10878c;

    public c(boolean z10, byte[] bArr, String str) {
        if (z10) {
            l.h(bArr);
            l.h(str);
        }
        this.f10876a = z10;
        this.f10877b = bArr;
        this.f10878c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f10876a == cVar.f10876a && Arrays.equals(this.f10877b, cVar.f10877b) && Objects.equals(this.f10878c, cVar.f10878c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10877b) + (Objects.hash(Boolean.valueOf(this.f10876a), this.f10878c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.f10876a ? 1 : 0);
        o.c(parcel, 2, this.f10877b);
        o.l(parcel, 3, this.f10878c);
        o.r(parcel, q6);
    }
}
