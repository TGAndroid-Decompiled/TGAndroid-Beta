package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
    public final String f16859a;
    public final byte[] f16860b;
    public final int f16861c;

    public a(int i10, String str, byte[] bArr) {
        this.f16859a = str;
        this.f16860b = bArr;
        this.f16861c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f16859a);
        f0.c(parcel, 3, this.f16860b);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f16861c);
        f0.r(parcel, q6);
    }
}
