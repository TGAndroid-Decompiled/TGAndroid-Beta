package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class eka extends c4 {
    public static final Parcelable.Creator<eka> CREATOR = new m9d((byte) 22);
    public ArrayList a;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.n(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
