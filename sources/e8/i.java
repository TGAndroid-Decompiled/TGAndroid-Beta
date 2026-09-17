package e8;

import android.os.IBinder;
import android.os.IInterface;
public final class i implements IInterface {
    public final IBinder f8051a;

    public i(IBinder iBinder) {
        this.f8051a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f8051a;
    }
}
