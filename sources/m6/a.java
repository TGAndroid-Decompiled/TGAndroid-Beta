package m6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new j7.b(29);
    public final Intent f19882a;

    public a(Intent intent) {
        this.f19882a = intent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.f19882a, i7);
        xb.s(parcel, r10);
    }
}
