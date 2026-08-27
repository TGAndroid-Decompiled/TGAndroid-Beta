package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;
import java.util.List;

public final class o extends z5.a {
    public static final Parcelable.Creator<o> CREATOR = new c(10);

    public final int f12814a;

    public final List f12815b;

    public o(int i10, ArrayList arrayList) {
        this.f12814a = i10;
        this.f12815b = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12814a);
        r8.p(parcel, 3, this.f12815b);
        r8.r(parcel, iQ);
    }
}
