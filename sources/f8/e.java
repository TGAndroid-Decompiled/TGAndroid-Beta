package f8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new f6.i(4);
    public final byte[] f10244a;

    public e(byte[] bArr) {
        this.f10244a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.c(parcel, 2, this.f10244a);
        df.r(parcel, q5);
    }
}
