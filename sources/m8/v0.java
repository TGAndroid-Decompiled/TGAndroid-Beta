package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.List;
public final class v0 extends c6.a {
    public static final Parcelable.Creator<v0> CREATOR = new o0(7);
    public final int f13852a;
    public final long f13853b;
    public final List f13854c;

    public v0(int i10, long j10, ArrayList arrayList) {
        this.f13852a = i10;
        this.f13853b = j10;
        this.f13854c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.f13852a);
        f5.s(parcel, 3, 8);
        parcel.writeLong(this.f13853b);
        f5.p(parcel, 4, this.f13854c);
        f5.r(parcel, q10);
    }
}
