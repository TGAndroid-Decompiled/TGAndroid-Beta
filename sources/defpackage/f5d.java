package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public final class f5d extends c4 {
    public static final Parcelable.Creator<f5d> CREATOR = new mx6((byte) 26);
    public final List a;

    public f5d(List list) {
        list.getClass();
        this.a = list;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.h(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
