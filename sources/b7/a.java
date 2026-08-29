package b7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f1940a;

    public a(IBinder iBinder) {
        this.f1940a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f1940a;
    }
}
