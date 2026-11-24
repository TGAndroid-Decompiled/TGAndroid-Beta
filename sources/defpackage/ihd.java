package defpackage;

import android.os.IBinder;
import android.os.IInterface;
public final class ihd implements btd, IInterface {
    public final IBinder a;

    public ihd(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.a;
    }
}
