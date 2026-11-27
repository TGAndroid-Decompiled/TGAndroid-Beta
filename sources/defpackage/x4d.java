package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class x4d extends k4d {
    @Override
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return false;
                    }
                    Parcelable.Creator creator = Bundle.CREATOR;
                    p4d.b(parcel);
                    b((Bundle) p4d.a(parcel));
                    return true;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                p4d.b(parcel);
                d((Bundle) p4d.a(parcel));
                return true;
            }
            Parcelable.Creator creator3 = Bundle.CREATOR;
            p4d.b(parcel);
            c((Bundle) p4d.a(parcel));
            return true;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        p4d.b(parcel);
        e((Bundle) p4d.a(parcel));
        return true;
    }

    public abstract void b(Bundle bundle);

    public abstract void c(Bundle bundle);

    public abstract void d(Bundle bundle);

    public abstract void e(Bundle bundle);
}
