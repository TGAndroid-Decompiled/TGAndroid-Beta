package l8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class b0 extends o implements c0 {
    @Override
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) r.a(parcel);
        r.b(parcel);
        b(bundle);
        return true;
    }
}
