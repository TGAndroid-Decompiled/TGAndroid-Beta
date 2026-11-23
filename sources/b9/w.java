package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
import java.util.List;
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR = new c(20);
    public final int f3090a;
    public final List f3091b;

    public w(int i7, ArrayList arrayList) {
        this.f3090a = i7;
        this.f3091b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.f3090a);
        bc.p(parcel, 3, this.f3091b);
        bc.s(parcel, r10);
    }
}
