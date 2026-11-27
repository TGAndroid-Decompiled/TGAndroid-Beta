package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class led extends c4 {
    public static final Parcelable.Creator<led> CREATOR = new ced((byte) 4);
    public String a;
    public Bundle b;

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.b(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
