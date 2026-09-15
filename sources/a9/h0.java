package a9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class h0 extends s implements i0 {
    @Override
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            v.b(parcel);
            b((Bundle) v.a(parcel));
            return true;
        }
        return false;
    }
}
