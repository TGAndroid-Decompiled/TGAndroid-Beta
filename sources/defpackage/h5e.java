package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class h5e extends b4 {
    public static final Parcelable.Creator<h5e> CREATOR = new qyd((byte) 5);
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public h5e(int i, String str, String str2, byte[] bArr) {
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
        return b00.j(sb, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        jte.l(parcel, 3, this.b);
        jte.c(parcel, 4, this.c);
        jte.l(parcel, 5, this.d);
        jte.s(parcel, r);
    }
}
