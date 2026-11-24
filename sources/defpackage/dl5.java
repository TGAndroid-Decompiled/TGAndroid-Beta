package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
public abstract class dl5 extends e1d {
    public dl5() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", (byte) 1);
    }

    public abstract void T(Status status);

    @Override
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            g4d.d(parcel);
            T((Status) g4d.a(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
