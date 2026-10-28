package o6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
public final class j extends p6.a {
    public static final Parcelable.Creator<j> CREATOR = new n4.x(12);
    public final int f19143a;
    public final int f19144b;
    public final int f19145c;
    public final long d;
    public final long e;
    public final String f19146f;
    public final String h;
    public final int f19147n;
    public final int f19148r;

    public j(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f19143a = i10;
        this.f19144b = i11;
        this.f19145c = i12;
        this.d = j10;
        this.e = j11;
        this.f19146f = str;
        this.h = str2;
        this.f19147n = i13;
        this.f19148r = i14;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f19143a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f19144b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f19145c);
        df.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        df.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        df.l(parcel, 6, this.f19146f);
        df.l(parcel, 7, this.h);
        df.s(parcel, 8, 4);
        parcel.writeInt(this.f19147n);
        df.s(parcel, 9, 4);
        parcel.writeInt(this.f19148r);
        df.r(parcel, q5);
    }
}
