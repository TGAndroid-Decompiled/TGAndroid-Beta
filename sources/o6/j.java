package o6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class j extends p6.a {
    public static final Parcelable.Creator<j> CREATOR = new n4.x(12);
    public final int f19144a;
    public final int f19145b;
    public final int f19146c;
    public final long d;
    public final long e;
    public final String f19147f;
    public final String h;
    public final int f19148n;
    public final int f19149r;

    public j(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f19144a = i10;
        this.f19145b = i11;
        this.f19146c = i12;
        this.d = j10;
        this.e = j11;
        this.f19147f = str;
        this.h = str2;
        this.f19148n = i13;
        this.f19149r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f19144a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f19145b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f19146c);
        df.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        df.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        df.l(parcel, 6, this.f19147f);
        df.l(parcel, 7, this.h);
        df.s(parcel, 8, 4);
        parcel.writeInt(this.f19148n);
        df.s(parcel, 9, 4);
        parcel.writeInt(this.f19149r);
        df.r(parcel, q5);
    }
}
