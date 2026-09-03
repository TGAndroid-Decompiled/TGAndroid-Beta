package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.ArrayList;
import java.util.List;
public final class v0 extends c6.a {
    public static final Parcelable.Creator<v0> CREATOR = new o0(7);
    public final int f13586a;
    public final long f13587b;
    public final List f13588c;

    public v0(int i10, long j10, ArrayList arrayList) {
        this.f13586a = i10;
        this.f13587b = j10;
        this.f13588c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.f13586a);
        g5.s(parcel, 3, 8);
        parcel.writeLong(this.f13587b);
        g5.p(parcel, 4, this.f13588c);
        g5.r(parcel, q10);
    }
}
