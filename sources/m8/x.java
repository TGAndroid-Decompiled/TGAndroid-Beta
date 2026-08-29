package m8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class x extends p implements y {
    @Override
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
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
