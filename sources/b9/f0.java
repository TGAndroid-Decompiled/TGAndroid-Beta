package b9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class f0 extends q implements g0 {
    @Override
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            t.b(parcel);
            b((Bundle) t.a(parcel));
            return true;
        }
        return false;
    }
}
