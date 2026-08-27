package a7;

import android.os.IBinder;
import android.os.IInterface;

public final class a implements IInterface {

    public final IBinder f104a;

    public a(IBinder iBinder) {
        this.f104a = iBinder;
    }

    @Override
    public final IBinder asBinder() {
        return this.f104a;
    }
}
