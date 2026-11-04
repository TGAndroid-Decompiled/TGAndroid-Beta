package c9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class x extends p implements y {
    @Override
    public final boolean a(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        return false;
                    }
                    Parcelable.Creator creator = Bundle.CREATOR;
                    s.b(parcel);
                    b((Bundle) s.a(parcel));
                    return true;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                s.b(parcel);
                d((Bundle) s.a(parcel));
                return true;
            }
            Parcelable.Creator creator3 = Bundle.CREATOR;
            s.b(parcel);
            c((Bundle) s.a(parcel));
            return true;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        s.b(parcel);
        e((Bundle) s.a(parcel));
        return true;
    }
}
