package o8;

import android.os.Parcel;
import android.os.Parcelable;
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new n8.g(5);
    public final long f20935a;
    public final a[] f20936b;
    public final int f20937c;
    public final boolean d;

    public f(long j10, a[] aVarArr, int i3, boolean z10) {
        this.f20935a = j10;
        this.f20936b = aVarArr;
        this.d = z10;
        if (z10) {
            this.f20937c = i3;
        } else {
            this.f20937c = -1;
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 8);
        parcel.writeLong(this.f20935a);
        j8.a.p(parcel, 3, this.f20936b, i3);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.f20937c);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
