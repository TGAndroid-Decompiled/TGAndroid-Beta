package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
    public final String f16795a;
    public final byte[] f16796b;
    public final int f16797c;

    public a(int i10, String str, byte[] bArr) {
        this.f16795a = str;
        this.f16796b = bArr;
        this.f16797c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f16795a);
        f0.c(parcel, 3, this.f16796b);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f16797c);
        f0.r(parcel, q6);
    }
}
