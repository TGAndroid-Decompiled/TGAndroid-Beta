package e7;

import android.os.IBinder;
import android.os.IInterface;
public final class d implements f, IInterface {
    public final IBinder f9831a;

    public d(IBinder iBinder) {
        this.f9831a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f9831a;
    }
}
