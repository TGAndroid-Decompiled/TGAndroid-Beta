package c9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class c0 extends p implements d0 {
    @Override
    public final boolean a(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            s.b(parcel);
            b((Bundle) s.a(parcel));
            return true;
        }
        return false;
    }
}
