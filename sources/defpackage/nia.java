package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class nia extends b4 {
    public static final Parcelable.Creator<nia> CREATOR = new v6d((byte) 22);
    public ArrayList a;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.n(parcel, 1, this.a);
        mve.s(parcel, r);
    }
}
