package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class w4d extends c4 {
    public static final Parcelable.Creator<w4d> CREATOR = new mx6((byte) 24);
    public final ArrayList a;

    public w4d(ArrayList arrayList) {
        arrayList.getClass();
        this.a = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.p(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
