package a9;

import android.os.Parcel;
import android.os.Parcelable;
public final class o0 extends q6.a {
    public static final Parcelable.Creator<o0> CREATOR = new n0(1);
    public final String f231a;
    public final String f232b;
    public final long f233c;

    public o0(long j10, String str, String str2) {
        this.f231a = str;
        this.f232b = str2;
        this.f233c = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f231a);
        j8.a.m(parcel, 3, this.f232b);
        j8.a.r(parcel, 4, 8);
        parcel.writeLong(this.f233c);
        j8.a.t(parcel, s6);
    }
}
