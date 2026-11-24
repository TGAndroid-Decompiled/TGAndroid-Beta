package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public abstract class p0d extends tzc {
    @Override
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            yzc.b(parcel);
            b((Bundle) yzc.a(parcel));
            return true;
        }
        return false;
    }

    public abstract void b(Bundle bundle);
}
