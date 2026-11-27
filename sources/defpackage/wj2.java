package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
public final class wj2 extends c4 {
    public static final Parcelable.Creator<wj2> CREATOR = new m9d((byte) 1);
    public final Intent a;

    public wj2(Intent intent) {
        this.a = intent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 1, this.a, i);
        bye.s(parcel, r);
    }
}
