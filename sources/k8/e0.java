package k8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class e0 extends p implements f0 {
    @Override
    public final boolean a(int i9, Parcel parcel, Parcel parcel2, int i10) {
        if (i9 == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            s.b(parcel);
            b((Bundle) s.a(parcel));
            return true;
        }
        return false;
    }
}
