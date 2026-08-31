package l5;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j$.util.Objects;
import j7.g5;
import java.util.Arrays;
import l4.j;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(5);
    public final boolean f11717a;
    public final byte[] f11718b;
    public final String f11719c;

    public c(boolean z4, byte[] bArr, String str) {
        if (z4) {
            m.h(bArr);
            m.h(str);
        }
        this.f11717a = z4;
        this.f11718b = bArr;
        this.f11719c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11717a == cVar.f11717a && Arrays.equals(this.f11718b, cVar.f11718b) && Objects.equals(this.f11719c, cVar.f11719c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11718b) + (Objects.hash(Boolean.valueOf(this.f11717a), this.f11719c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f11717a ? 1 : 0);
        g5.c(parcel, 2, this.f11718b);
        g5.l(parcel, 3, this.f11719c);
        g5.r(parcel, q10);
    }
}
