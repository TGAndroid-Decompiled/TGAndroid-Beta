package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.c0;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new j(28);
    public final String f16019a;
    public final byte[] f16020b;
    public final int f16021c;

    public a(int i10, String str, byte[] bArr) {
        this.f16019a = str;
        this.f16020b = bArr;
        this.f16021c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.l(parcel, 2, this.f16019a);
        c0.c(parcel, 3, this.f16020b);
        c0.s(parcel, 4, 4);
        parcel.writeInt(this.f16021c);
        c0.r(parcel, q6);
    }
}
