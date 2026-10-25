package a8;

import android.os.Parcel;
import android.os.Parcelable;
public final class tg extends p6.a {
    public static final Parcelable.Creator<tg> CREATOR = new vg(0);
    public final int f941a;
    public final int f942b;
    public final int f943c;
    public final int d;
    public final long e;

    public tg(int i10, int i11, int i12, long j10, int i13) {
        this.f941a = i10;
        this.f942b = i11;
        this.f943c = i12;
        this.d = i13;
        this.e = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f941a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.f942b);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.f943c);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        df.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        df.r(parcel, q5);
    }
}
