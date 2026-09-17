package a9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class z extends r implements a0 {
    @Override
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        return false;
                    }
                    Parcelable.Creator creator = Bundle.CREATOR;
                    u.b(parcel);
                    b((Bundle) u.a(parcel));
                    return true;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                u.b(parcel);
                d((Bundle) u.a(parcel));
                return true;
            }
            Parcelable.Creator creator3 = Bundle.CREATOR;
            u.b(parcel);
            c((Bundle) u.a(parcel));
            return true;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        u.b(parcel);
        e((Bundle) u.a(parcel));
        return true;
    }
}
