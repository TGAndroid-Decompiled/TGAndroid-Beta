package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class p2d extends u1d {
    @Override
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            z1d.b(parcel);
            b((Bundle) z1d.a(parcel));
            return true;
        }
        return false;
    }

    public abstract void b(Bundle bundle);
}
