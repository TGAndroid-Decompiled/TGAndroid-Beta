package b8;

import android.os.IBinder;
import android.os.IInterface;
public final class d implements IInterface {
    public final IBinder f2602a;

    public d(IBinder iBinder) {
        this.f2602a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f2602a;
    }
}
