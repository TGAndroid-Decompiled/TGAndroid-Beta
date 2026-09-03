package d7;

import android.os.IBinder;
import android.os.IInterface;
public final class a implements IInterface {
    public final IBinder f4204a;

    public a(IBinder iBinder) {
        this.f4204a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f4204a;
    }
}
