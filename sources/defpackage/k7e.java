package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class k7e extends b4 {
    public static final Parcelable.Creator<k7e> CREATOR = new t0e((byte) 5);
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public k7e(int i, String str, String str2, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb = new StringBuilder("MessageEventParcelable[");
        sb.append(this.a);
        sb.append(",");
        sb.append(this.b);
        sb.append(", size=");
        return b10.j(sb, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.l(parcel, 3, this.b);
        mve.c(parcel, 4, this.c);
        mve.l(parcel, 5, this.d);
        mve.s(parcel, r);
    }
}
