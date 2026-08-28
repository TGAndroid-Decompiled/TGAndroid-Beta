package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class m0 extends y5.a implements h8.g {
    public static final Parcelable.Creator<m0> CREATOR = new c(27);
    public final int f11007a;
    public final String f11008b;
    public final byte[] f11009c;
    public final String d;

    public m0(int i9, String str, String str2, byte[] bArr) {
        this.f11007a = i9;
        this.f11008b = str;
        this.f11009c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f11009c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f11007a);
        sb2.append(",");
        sb2.append(this.f11008b);
        sb2.append(", size=");
        return aa.d.r(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11007a);
        p8.l(parcel, 3, this.f11008b);
        p8.c(parcel, 4, this.f11009c);
        p8.l(parcel, 5, this.d);
        p8.r(parcel, q10);
    }
}
