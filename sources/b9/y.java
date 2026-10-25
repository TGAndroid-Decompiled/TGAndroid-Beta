package b9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class y extends q implements z {
    @Override
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        return false;
                    }
                    Parcelable.Creator creator = Bundle.CREATOR;
                    t.b(parcel);
                    b((Bundle) t.a(parcel));
                    return true;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                t.b(parcel);
                d((Bundle) t.a(parcel));
                return true;
            }
            Parcelable.Creator creator3 = Bundle.CREATOR;
            t.b(parcel);
            c((Bundle) t.a(parcel));
            return true;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        t.b(parcel);
        e((Bundle) t.a(parcel));
        return true;
    }
}
