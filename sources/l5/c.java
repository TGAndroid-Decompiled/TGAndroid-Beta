package l5;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j$.util.Objects;
import j7.f5;
import java.util.Arrays;
import l4.j;
public final class c extends c6.a {
    public static final Parcelable.Creator<c> CREATOR = new j(5);
    public final boolean f11341a;
    public final byte[] f11342b;
    public final String f11343c;

    public c(boolean z4, byte[] bArr, String str) {
        if (z4) {
            m.h(bArr);
            m.h(str);
        }
        this.f11341a = z4;
        this.f11342b = bArr;
        this.f11343c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f11341a == cVar.f11341a && Arrays.equals(this.f11342b, cVar.f11342b) && Objects.equals(this.f11343c, cVar.f11343c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11342b) + (Objects.hash(Boolean.valueOf(this.f11341a), this.f11343c) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f11341a ? 1 : 0);
        f5.c(parcel, 2, this.f11342b);
        f5.l(parcel, 3, this.f11343c);
        f5.r(parcel, q10);
    }
}
