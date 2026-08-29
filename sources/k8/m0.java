package k8;

import android.os.Parcel;
import android.os.Parcelable;
public final class m0 extends a6.a implements j8.g {
    public static final Parcelable.Creator<m0> CREATOR = new c(27);
    public final int f13530a;
    public final String f13531b;
    public final byte[] f13532c;
    public final String d;

    public m0(int i10, String str, String str2, byte[] bArr) {
        this.f13530a = i10;
        this.f13531b = str;
        this.f13532c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f13532c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String obj = valueOf.toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.f13530a);
        sb2.append(",");
        sb2.append(this.f13531b);
        sb2.append(", size=");
        return a4.w.q(sb2, obj, "]");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13530a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f13531b);
        com.google.android.gms.internal.cast.o.c(parcel, 4, this.f13532c);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
