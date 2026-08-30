package o8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class w extends o implements x {
    @Override
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        return false;
                    }
                    Parcelable.Creator creator = Bundle.CREATOR;
                    r.b(parcel);
                    b((Bundle) r.a(parcel));
                    return true;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                r.b(parcel);
                d((Bundle) r.a(parcel));
                return true;
            }
            Parcelable.Creator creator3 = Bundle.CREATOR;
            r.b(parcel);
            c((Bundle) r.a(parcel));
            return true;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        r.b(parcel);
        e((Bundle) r.a(parcel));
        return true;
    }
}
