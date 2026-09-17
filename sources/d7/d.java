package d7;

import android.os.IBinder;
import android.os.IInterface;
public final class d implements f, IInterface {
    public final IBinder f6655a;

    public d(IBinder iBinder) {
        this.f6655a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f6655a;
    }
}
