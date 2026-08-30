package o8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class d0 extends o implements e0 {
    @Override
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            r.b(parcel);
            b((Bundle) r.a(parcel));
            return true;
        }
        return false;
    }
}
