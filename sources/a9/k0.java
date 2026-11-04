package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class k0 extends q6.a {
    public static final Parcelable.Creator<k0> CREATOR = new c(27);
    public final int f214a;
    public final String f215b;
    public final byte[] f216c;
    public final String d;

    public k0(int i3, String str, String str2, byte[] bArr) {
        this.f214a = i3;
        this.f215b = str;
        this.f216c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f216c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f214a);
        sb2.append(",");
        sb2.append(this.f215b);
        sb2.append(", size=");
        return a1.g.s(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f214a);
        j8.a.m(parcel, 3, this.f215b);
        j8.a.d(parcel, 4, this.f216c);
        j8.a.m(parcel, 5, this.d);
        j8.a.t(parcel, s6);
    }
}
