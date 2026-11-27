package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class f1f extends c4 {
    public static final Parcelable.Creator<f1f> CREATOR = new t4f((byte) 3);
    public final int a;

    public f1f(int i) {
        this.a = i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        bye.s(parcel, r);
    }
}
