package a9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class e0 extends r implements f0 {
    @Override
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            u.b(parcel);
            b((Bundle) u.a(parcel));
            return true;
        }
        return false;
    }
}
