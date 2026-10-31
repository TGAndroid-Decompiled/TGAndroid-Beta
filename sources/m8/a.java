package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.h0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new g8.g(27);
    public final String f13018a;
    public final byte[] f13019b;
    public final int f13020c;

    public a(int i10, String str, byte[] bArr) {
        this.f13018a = str;
        this.f13019b = bArr;
        this.f13020c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f13018a);
        h0.c(parcel, 3, this.f13019b);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.f13020c);
        h0.r(parcel, q6);
    }
}
