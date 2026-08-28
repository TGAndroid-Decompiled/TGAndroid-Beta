package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.List;
public final class w0 extends y5.a {
    public static final Parcelable.Creator<w0> CREATOR = new p0(7);
    public final int f11050a;
    public final long f11051b;
    public final List f11052c;

    public w0(int i9, long j10, ArrayList arrayList) {
        this.f11050a = i9;
        this.f11051b = j10;
        this.f11052c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f11050a);
        p8.s(parcel, 3, 8);
        parcel.writeLong(this.f11051b);
        p8.p(parcel, 4, this.f11052c);
        p8.r(parcel, q10);
    }
}
