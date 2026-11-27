package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
public abstract class gl5 extends u3d {
    public gl5() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", (byte) 1);
    }

    public abstract void T(Status status);

    @Override
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            v6d.d(parcel);
            T((Status) v6d.a(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
