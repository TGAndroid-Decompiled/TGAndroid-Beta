package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.f0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
    public final String f14962a;
    public final byte[] f14963b;
    public final int f14964c;

    public a(String str, byte[] bArr, int i10) {
        this.f14962a = str;
        this.f14963b = bArr;
        this.f14964c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.l(parcel, 2, this.f14962a);
        f0.c(parcel, 3, this.f14963b);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.f14964c);
        f0.r(parcel, q6);
    }
}
