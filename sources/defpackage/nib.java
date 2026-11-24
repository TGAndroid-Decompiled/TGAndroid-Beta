package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class nib extends b4 {
    public static final Parcelable.Creator<nib> CREATOR = new d3d((byte) 0);
    public final int a;
    public List b;

    public nib(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.p(parcel, 2, this.b);
        mve.s(parcel, r);
    }
}
