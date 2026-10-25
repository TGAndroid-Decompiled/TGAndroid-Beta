package n8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new x(5);
    public final String f18728a;
    public final byte[] f18729b;
    public final int f18730c;

    public a(int i10, String str, byte[] bArr) {
        this.f18728a = str;
        this.f18729b = bArr;
        this.f18730c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f18728a);
        df.c(parcel, 3, this.f18729b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f18730c);
        df.r(parcel, q5);
    }
}
