package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class e5d extends k4d {
    @Override
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            p4d.b(parcel);
            b((Bundle) p4d.a(parcel));
            return true;
        }
        return false;
    }

    public abstract void b(Bundle bundle);
}
