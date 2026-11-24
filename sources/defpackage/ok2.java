package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
public final class ok2 extends b4 {
    public static final Parcelable.Creator<ok2> CREATOR = new v6d((byte) 1);
    public final Intent a;

    public ok2(Intent intent) {
        this.a = intent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.s(parcel, r);
    }
}
