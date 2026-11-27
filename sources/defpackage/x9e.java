package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class x9e extends c4 {
    public static final Parcelable.Creator<x9e> CREATOR = new g3e((byte) 5);
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public x9e(int i, String str, String str2, byte[] bArr) {
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
        return c00.k(sb, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.l(parcel, 3, this.b);
        bye.c(parcel, 4, this.c);
        bye.l(parcel, 5, this.d);
        bye.s(parcel, r);
    }
}
