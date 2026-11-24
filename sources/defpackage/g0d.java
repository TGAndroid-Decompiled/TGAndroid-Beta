package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class g0d extends tzc {
    @Override
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return false;
                    }
                    Parcelable.Creator creator = Bundle.CREATOR;
                    yzc.b(parcel);
                    b((Bundle) yzc.a(parcel));
                    return true;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                yzc.b(parcel);
                d((Bundle) yzc.a(parcel));
                return true;
            }
            Parcelable.Creator creator3 = Bundle.CREATOR;
            yzc.b(parcel);
            c((Bundle) yzc.a(parcel));
            return true;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        yzc.b(parcel);
        e((Bundle) yzc.a(parcel));
        return true;
    }

    public abstract void b(Bundle bundle);

    public abstract void c(Bundle bundle);

    public abstract void d(Bundle bundle);

    public abstract void e(Bundle bundle);
}
