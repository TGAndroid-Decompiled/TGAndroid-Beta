package f8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class d extends p6.a {
    public static final Parcelable.Creator<d> CREATOR = new f6.i(3);
    public final byte[] f10242a;

    public d(byte[] bArr) {
        this.f10242a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.c(parcel, 2, this.f10242a);
        df.r(parcel, q5);
    }
}
