package m8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class c0 extends p implements d0 {
    @Override
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            s.b(parcel);
            b((Bundle) s.a(parcel));
            return true;
        }
        return false;
    }
}
