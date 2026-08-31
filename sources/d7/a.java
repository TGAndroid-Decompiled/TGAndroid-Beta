package d7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f4295a;

    public a(IBinder iBinder) {
        this.f4295a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f4295a;
    }
}
