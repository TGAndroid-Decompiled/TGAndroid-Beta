package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class l0 extends c6.a implements l8.g {
    public static final Parcelable.Creator<l0> CREATOR = new c(27);
    public final int f13540a;
    public final String f13541b;
    public final byte[] f13542c;
    public final String d;

    public l0(int i10, String str, String str2, byte[] bArr) {
        this.f13540a = i10;
        this.f13541b = str;
        this.f13542c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f13542c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb = new StringBuilder("MessageEventParcelable[");
        sb.append(this.f13540a);
        sb.append(",");
        sb.append(this.f13541b);
        sb.append(", size=");
        return android.support.v4.media.a.r(sb, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13540a);
        g5.l(parcel, 3, this.f13541b);
        g5.c(parcel, 4, this.f13542c);
        g5.l(parcel, 5, this.d);
        g5.r(parcel, q10);
    }
}
