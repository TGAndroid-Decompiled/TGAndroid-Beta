package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
    public final String f15438a;
    public final byte[] f15439b;
    public final int f15440c;

    public a(int i10, String str, byte[] bArr) {
        this.f15438a = str;
        this.f15439b = bArr;
        this.f15440c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f15438a);
        f0.c(parcel, 3, this.f15439b);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f15440c);
        f0.r(parcel, q6);
    }
}
