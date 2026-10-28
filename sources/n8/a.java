package n8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(5);
    public final String f18727a;
    public final byte[] f18728b;
    public final int f18729c;

    public a(int i10, String str, byte[] bArr) {
        this.f18727a = str;
        this.f18728b = bArr;
        this.f18729c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f18727a);
        df.c(parcel, 3, this.f18728b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f18729c);
        df.r(parcel, q5);
    }
}
