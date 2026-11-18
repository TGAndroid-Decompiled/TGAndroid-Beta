package ab;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class a0 extends r6.a {
    public static final Parcelable.Creator<a0> CREATOR = new w.a(9);
    public final Bundle f901a;
    public a0.f f902b;

    public a0(Bundle bundle) {
        this.f901a = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.b(parcel, 2, this.f901a);
        bc.s(parcel, r10);
    }
}
