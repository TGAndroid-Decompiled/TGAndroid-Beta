package a9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class a0 extends s implements b0 {
    @Override
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        return false;
                    }
                    Parcelable.Creator creator = Bundle.CREATOR;
                    v.b(parcel);
                    b((Bundle) v.a(parcel));
                    return true;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                v.b(parcel);
                d((Bundle) v.a(parcel));
                return true;
            }
            Parcelable.Creator creator3 = Bundle.CREATOR;
            v.b(parcel);
            c((Bundle) v.a(parcel));
            return true;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        v.b(parcel);
        e((Bundle) v.a(parcel));
        return true;
    }
}
