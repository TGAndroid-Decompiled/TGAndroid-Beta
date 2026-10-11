package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.d0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
    public final String f16296a;
    public final byte[] f16297b;
    public final int f16298c;

    public a(int i10, String str, byte[] bArr) {
        this.f16296a = str;
        this.f16297b = bArr;
        this.f16298c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 2, this.f16296a);
        d0.c(parcel, 3, this.f16297b);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.f16298c);
        d0.r(parcel, q6);
    }
}
