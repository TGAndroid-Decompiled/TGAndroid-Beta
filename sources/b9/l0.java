package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class l0 extends r6.a {
    public static final Parcelable.Creator<l0> CREATOR = new c(27);
    public final int f3027a;
    public final String f3028b;
    public final byte[] f3029c;
    public final String d;

    public l0(int i7, String str, String str2, byte[] bArr) {
        this.f3027a = i7;
        this.f3028b = str;
        this.f3029c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f3029c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f3027a);
        sb2.append(",");
        sb2.append(this.f3028b);
        sb2.append(", size=");
        return a8.p0.s(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.f3027a);
        yb.l(parcel, 3, this.f3028b);
        yb.c(parcel, 4, this.f3029c);
        yb.l(parcel, 5, this.d);
        yb.s(parcel, r10);
    }
}
