package d7;

import android.os.IBinder;
import android.os.IInterface;
public final class d implements f, IInterface {
    public final IBinder f8159a;

    public d(IBinder iBinder) {
        this.f8159a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f8159a;
    }
}
