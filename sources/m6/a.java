package m6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new j7.b(29);
    public final Intent f20868a;

    public a(Intent intent) {
        this.f20868a = intent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f20868a, i7);
        bc.s(parcel, r10);
    }
}
