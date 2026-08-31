package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;
import java.util.List;
public final class v0 extends c6.a {
    public static final Parcelable.Creator<v0> CREATOR = new o0(7);
    public final int f13584a;
    public final long f13585b;
    public final List f13586c;

    public v0(int i10, long j10, ArrayList arrayList) {
        this.f13584a = i10;
        this.f13585b = j10;
        this.f13586c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13584a);
        g5.s(parcel, 3, 8);
        parcel.writeLong(this.f13585b);
        g5.p(parcel, 4, this.f13586c);
        g5.r(parcel, q10);
    }
}
