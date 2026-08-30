package d7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f4223a;

    public a(IBinder iBinder) {
        this.f4223a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f4223a;
    }
}
