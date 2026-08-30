package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class l0 extends c6.a implements l8.g {
    public static final Parcelable.Creator<l0> CREATOR = new c(27);
    public final int f13824a;
    public final String f13825b;
    public final byte[] f13826c;
    public final String d;

    public l0(int i10, String str, String str2, byte[] bArr) {
        this.f13824a = i10;
        this.f13825b = str;
        this.f13826c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f13826c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb = new StringBuilder("MessageEventParcelable[");
        sb.append(this.f13824a);
        sb.append(",");
        sb.append(this.f13825b);
        sb.append(", size=");
        return android.support.v4.media.a.r(sb, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13824a);
        f5.l(parcel, 3, this.f13825b);
        f5.c(parcel, 4, this.f13826c);
        f5.l(parcel, 5, this.d);
        f5.r(parcel, q10);
    }
}
