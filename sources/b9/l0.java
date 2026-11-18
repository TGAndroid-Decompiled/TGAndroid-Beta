package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class l0 extends r6.a {
    public static final Parcelable.Creator<l0> CREATOR = new c(27);
    public final int f3025a;
    public final String f3026b;
    public final byte[] f3027c;
    public final String d;

    public l0(int i7, String str, String str2, byte[] bArr) {
        this.f3025a = i7;
        this.f3026b = str;
        this.f3027c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f3027c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f3025a);
        sb2.append(",");
        sb2.append(this.f3026b);
        sb2.append(", size=");
        return a8.p0.s(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3025a);
        bc.l(parcel, 3, this.f3026b);
        bc.c(parcel, 4, this.f3027c);
        bc.l(parcel, 5, this.d);
        bc.s(parcel, r10);
    }
}
