package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class l0 extends r6.a {
    public static final Parcelable.Creator<l0> CREATOR = new c(27);
    public final int f2995a;
    public final String f2996b;
    public final byte[] f2997c;
    public final String d;

    public l0(int i7, String str, String str2, byte[] bArr) {
        this.f2995a = i7;
        this.f2996b = str;
        this.f2997c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f2997c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f2995a);
        sb2.append(",");
        sb2.append(this.f2996b);
        sb2.append(", size=");
        return a8.p0.s(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f2995a);
        cc.l(parcel, 3, this.f2996b);
        cc.c(parcel, 4, this.f2997c);
        cc.l(parcel, 5, this.d);
        cc.s(parcel, r10);
    }
}
