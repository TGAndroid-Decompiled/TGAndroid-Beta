package k8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class w0 extends a6.a {
    public static final Parcelable.Creator<w0> CREATOR = new p0(7);
    public final int f13573a;
    public final long f13574b;
    public final List f13575c;

    public w0(int i10, long j10, ArrayList arrayList) {
        this.f13573a = i10;
        this.f13574b = j10;
        this.f13575c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.f13573a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 8);
        parcel.writeLong(this.f13574b);
        com.google.android.gms.internal.cast.o.p(parcel, 4, this.f13575c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
