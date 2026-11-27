package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class e33 extends c4 {
    public static final Parcelable.Creator<e33> CREATOR = new g31((byte) 14);
    public final Bundle a;

    public e33(Bundle bundle) {
        bundle.getClass();
        this.a = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = bye.r(parcel, 20293);
        bye.b(parcel, 1, this.a);
        bye.s(parcel, r);
    }
}
